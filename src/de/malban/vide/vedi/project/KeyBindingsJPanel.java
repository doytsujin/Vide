/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.malban.vide.vedi.project;

import de.malban.gui.HotKey;
import de.muntjak.tinylookandfeel.Theme;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author salchr
 */
public class KeyBindingsJPanel extends javax.swing.JPanel {

    KeyTableModel model;
    /**
     * Creates new form KeyBindingsJPanel
     */
    int mClassSetting=0;
    public KeyBindingsJPanel() {
        initComponents();
        model = new KeyTableModel();
        jTable1.setModel(model);
        ListSelectionModel cellSelectionModel = jTable1.getSelectionModel();

        cellSelectionModel.addListSelectionListener(new ListSelectionListener() 
        {
              public void valueChanged(ListSelectionEvent e) {
                tableSelectionChanged();
              }
        });        
        jTextField2.setEditable(false);
        jTextField1.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel1.setText("action");

        jTextField1.setPreferredSize(new java.awt.Dimension(6, 21));
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jLabel2.setText("key");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jTable1);

        jTextField2.setPreferredSize(new java.awt.Dimension(6, 21));

        jLabel3.setText("click on the textfield and press key");

        jButton1.setText("use");
        jButton1.setMargin(new java.awt.Insets(0, 2, 0, 2));
        jButton1.setPreferredSize(new java.awt.Dimension(50, 21));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jCheckBox1.setText("on release");

        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("New bindings are activated with the next instance they are used, activation is ");

        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("NOT immediate!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(jCheckBox1)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(0, 0, 0)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    KeyStroke lastKeyStroke = null;
    java.awt.event.KeyEvent event = null;
    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        
        event = evt;
        lastKeyStroke = KeyStroke.getKeyStroke(evt.getKeyCode(), evt.getModifiersEx(), jCheckBox1.isSelected());
        jTextField1.setText(lastKeyStroke.toString());
        
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (selectedRow == -1) return;
        if (lastKeyStroke == null) return;
        if (event == null) return;
        HotKey.hotkeyList.get(selectedRow).event = event.getKeyCode();
        HotKey.hotkeyList.get(selectedRow).mask = event.getModifiersEx();
        HotKey.hotkeyList.get(selectedRow).onRelease = jCheckBox1.isSelected();
        
        
        jTable1.repaint();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

    
    public class KeyTableModel extends AbstractTableModel
    {    
        String[] columns = {"Function", "Hotkey", "Where"};

        @Override
        public String getColumnName(int col) {
            return columns[col];
        }
        @Override
        public int getRowCount() {
            return HotKey.hotkeyList.size();
        }

        @Override
        public int getColumnCount() {
            return columns.length;
        }
        @Override
        public Object getValueAt(int row, int col) {
            if (col==0) return HotKey.hotkeyList.get(row).name;
            if (col==1) return HotKey.hotkeyList.get(row).getKeyString();
            if (col==2) return HotKey.hotkeyList.get(row).where;

            return "";
        }
        public Class<?> getColumnClass(int col) 
        {
            return Object.class;
        }
        public boolean isCellEditable(int row, int col) 
        {
            return false;
        }
        public void setValueAt(Object aValue, int row, int col) 
        {
        }
    }
    int selectedRow = -1;
    void tableSelectionChanged() 
    {
        if (mClassSetting>0) return;
        mClassSetting++;

        selectedRow = jTable1.getSelectedRow();
        jTextField2.setText(HotKey.hotkeyList.get(selectedRow).name);
        jTextField1.setText(HotKey.hotkeyList.get(selectedRow).getKeyString());
        lastKeyStroke = HotKey.hotkeyList.get(selectedRow).getKeyStroke();
        event = null;
        mClassSetting--;
        
    }
    
    public void updateMyUI()
    {
        int fontSize = Theme.textFieldFont.getFont().getSize();
        int rowHeight = fontSize+3;
        jTable1.setRowHeight(rowHeight);
    }

}
