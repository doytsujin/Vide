/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.malban.util.syntax.Syntax;

import de.malban.gui.dialogs.FontChooserComponent;
import de.malban.gui.dialogs.FontChooserPanel;
import de.malban.gui.dialogs.InternalColorChooserDialog;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

/**
 *
 * @author salchr
 */
public class StyleJPanel extends javax.swing.JPanel {

    KeyTableModel model;
    /**
     * Creates new form KeyBindingsJPanel
     */
    SimpleAttributeSet currentStyle;
    String currentName="";
    int mClassSetting=0;
    public StyleJPanel() {
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
      //  jTextArea1.setEditable(false);
       // StyleContext sc = new StyleContext();
        String text = jTextPane1.getText();
       DefaultStyledDocument doc = new DefaultStyledDocument();
       jTextPane1.setDocument(doc);
        
        jTextPane1.setText(text);
         TableColumnModel cModel = jTable1.getColumnModel();

         cModel.getColumn(0).setWidth(200);
         cModel.getColumn(1).setWidth(100);
         cModel.getColumn(2).setWidth(100);
         cModel.getColumn(3).setWidth(100);
         cModel.getColumn(4).setWidth(10);
         cModel.getColumn(5).setWidth(10);
         cModel.getColumn(6).setWidth(10);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();

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

        jButton1.setText("use");
        jButton1.setEnabled(false);
        jButton1.setMargin(new java.awt.Insets(0, 2, 0, 2));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Geneva", 2, 11)); // NOI18N
        jLabel4.setText("New bindings are activated with the next recoloring. ");

        jLabel5.setFont(new java.awt.Font("Geneva", 2, 11)); // NOI18N
        jLabel5.setText("NOT immediate!");

        jTextField1.setEnabled(false);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/de/malban/vide/images/font.png"))); // NOI18N
        jButton2.setEnabled(false);
        jButton2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton2.setPreferredSize(new java.awt.Dimension(19, 19));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/de/malban/vide/images/color_swatch.png"))); // NOI18N
        jButton3.setText("FG");
        jButton3.setEnabled(false);
        jButton3.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton3.setPreferredSize(new java.awt.Dimension(19, 19));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/de/malban/vide/images/color_swatch.png"))); // NOI18N
        jButton4.setText("BG");
        jButton4.setEnabled(false);
        jButton4.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton4.setPreferredSize(new java.awt.Dimension(19, 19));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextPane1.setText("Lorem ipsum dolor sit amet, ...");
        jScrollPane3.setViewportView(jTextPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addContainerGap(179, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(0, 0, 0)
                .addComponent(jLabel5)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (selectedRow == -1) return;
        
        TokenStyles.addStyle(
                currentName,
                StyleConstants.getBackground(currentStyle),
                StyleConstants.getForeground(currentStyle), 
                StyleConstants.isBold(currentStyle),
                StyleConstants.isItalic(currentStyle),
                StyleConstants.getFontSize(currentStyle),
                StyleConstants.getFontFamily(currentStyle)
                );

        jTable1.repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (currentStyle == null) return;
        FontChooserComponent fontChooser = FontChooserPanel.showFontChoserDialog("Font Chooser", currentStyle);
        jTextField1.setText(fontChooser.getSelectedFontFamily());
        StyleConstants.setFontFamily(currentStyle,fontChooser.getSelectedFontFamily());
        StyleConstants.setFontSize(currentStyle, fontChooser.getSelectedFontSize());
        StyleConstants.setBold(currentStyle, (fontChooser.getSelectedFontStyle()&Font.BOLD)==Font.BOLD);
        StyleConstants.setItalic(currentStyle, (fontChooser.getSelectedFontStyle()&Font.ITALIC)==Font.ITALIC);
        restyle();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (currentStyle == null) return;
        Color c = InternalColorChooserDialog.showDialog("Color");
        if (c == null) return;
        StyleConstants.setForeground(currentStyle,c);

        restyle();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (currentStyle == null) return;
        Color c = InternalColorChooserDialog.showDialog("Color");
        if (c == null) return;
        StyleConstants.setBackground(currentStyle,c);

        restyle();
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables

    String getColor(Color c)
    {
        String cc = "";
        cc += c.getRed()+", ";
        cc += c.getGreen()+", ";
        cc += c.getBlue();
        return cc;
    }
    public class KeyTableModel extends AbstractTableModel
    {    
        String[] columns = {"Name", "FG color", "BG Color", "Font", "size", "bold", "italic"};

        @Override
        public String getColumnName(int col) {
            return columns[col];
        }
        @Override
        public int getRowCount() {
            return TokenStyles.styleList.size();
        }

        @Override
        public int getColumnCount() {
            return columns.length;
        }
        @Override
        public Object getValueAt(int row, int col) {
            if (col==0) return TokenStyles.styleList.get(row).name;
            if (col==1) return getColor(StyleConstants.getForeground(TokenStyles.styleList.get(row)));
            if (col==2) return getColor(StyleConstants.getBackground(TokenStyles.styleList.get(row)));
            if (col==3) return StyleConstants.getFontFamily(TokenStyles.styleList.get(row));
            if (col==4) return StyleConstants.getFontSize(TokenStyles.styleList.get(row));
            if (col==5) return StyleConstants.isBold(TokenStyles.styleList.get(row));
            if (col==6) return StyleConstants.isItalic(TokenStyles.styleList.get(row));
            return "";
        }
        public Class<?> getColumnClass(int col) 
        {
            if (col==0) return String.class;
            if (col==1) return Color.class;
            if (col==2) return Color.class;
            if (col==3) return String.class;
            if (col==4) return Integer.class;
            if (col==5) return Boolean.class;
            if (col==6) return Boolean.class;
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
        currentStyle = (SimpleAttributeSet) TokenStyles.styleList.get(selectedRow).clone();
        currentName = TokenStyles.styleList.get(selectedRow).name;
        jTextField1.setText(StyleConstants.getFontFamily(currentStyle));
        restyle();
        mClassSetting--;
        jTextField1.setEnabled(true);
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        
    }
    
    void restyle()
    {
        String text = jTextPane1.getText();
        DefaultStyledDocument doc = (DefaultStyledDocument)jTextPane1.getDocument();
        jTextPane1.setText(text);
        int e=doc.getLength();
        int s=0;
        doc.setCharacterAttributes(s, e,currentStyle , true);
        jTextPane1.repaint();
    }


}
