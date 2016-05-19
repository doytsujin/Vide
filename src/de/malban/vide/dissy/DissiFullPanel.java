/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.malban.vide.dissy;

import de.malban.config.Configuration;
import de.malban.gui.CSAMainFrame;
import de.malban.gui.Stateable;
import de.malban.gui.Windowable;
import de.malban.gui.components.CSAView;
import de.malban.gui.dialogs.InternalFrameFileChoser;
import de.malban.vide.vecx.VecXPanel;
import java.io.File;
import java.io.Serializable;

/**
 *
 * @author malban
 */
public class DissiFullPanel extends javax.swing.JPanel  implements
        Windowable, Stateable{
    public boolean isLoadSettings() { return true; }
    private CSAView mParent = null;
    private javax.swing.JMenuItem mParentMenuItem = null;
    private int mClassSetting=0;
    MemoryInformationTableModel model=null;
    DASM6809 dasm = new DASM6809();
    boolean init = false;
    private VecXPanel vecxPanel = null; // needed for vectrex memory access
    
    public void setVecxy(VecXPanel v)
    {
        vecxPanel = v;
    }
    @Override public boolean isIcon()
    {
        CSAMainFrame frame = ((CSAMainFrame)Configuration.getConfiguration().getMainFrame());
        if (frame.getInternalFrame(this) == null) return false;
        return frame.getInternalFrame(this).isIcon();
    }
    @Override public void setIcon(boolean b)
    {
        CSAMainFrame frame = ((CSAMainFrame)Configuration.getConfiguration().getMainFrame());
        if (frame.getInternalFrame(this) == null) return;
        try
        {
            frame.getInternalFrame(this).setIcon(b);
        }
        catch (Throwable e){}
    }

    @Override
    public void closing()
    {
        if (vecxPanel != null) vecxPanel.resetDissi();
        deinit();
    }
    @Override
    public void setParentWindow(CSAView jpv)
    {
        mParent = jpv;
    }
    @Override
    public void setMenuItem(javax.swing.JMenuItem item)
    {
        mParentMenuItem = item;
        mParentMenuItem.setText("Dissi");
    }
    @Override
    public javax.swing.JMenuItem getMenuItem()
    {
        return mParentMenuItem;
    }
    @Override
    public javax.swing.JPanel getPanel()
    {
        return this;
    }
    public void deinit()
    {
        init = false;
    }
    /**
     * Creates new form DissiPanel
     */
    public  DissiFullPanel() {
        initComponents();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jTextFieldTileFile = new javax.swing.JTextField();
        jButtonFileSelect1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        dissiPanel1 = new de.malban.vide.dissy.DissiPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();

        setName("dissy"); // NOI18N

        jLabel5.setText("Bin File");

        jTextFieldTileFile.setText("FROGGER.BIN");
        jTextFieldTileFile.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldTileFileFocusLost(evt);
            }
        });
        jTextFieldTileFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTileFileActionPerformed(evt);
            }
        });

        jButtonFileSelect1.setText("...");
        jButtonFileSelect1.setMargin(new java.awt.Insets(0, 1, 0, -1));
        jButtonFileSelect1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFileSelect1ActionPerformed(evt);
            }
        });

        jButton1.setText("Dis");
        jButton1.setName("dissy"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("ROM starts at");

        jTextField1.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dissiPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 763, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dissiPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Source table", jPanel2);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 763, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Output", jPanel1);

        jCheckBox3.setSelected(true);
        jCheckBox3.setText("assume Vectrex");

        jCheckBox4.setText("create unkown labels");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldTileFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonFileSelect1)
                .addGap(47, 47, 47)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox4)
                    .addComponent(jCheckBox3))
                .addGap(110, 110, 110))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTileFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonFileSelect1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jButton1)
                    .addComponent(jLabel5)
                    .addComponent(jCheckBox3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE))
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Output");
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldTileFileFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldTileFileFocusLost
        jTextFieldTileFileActionPerformed(null);
    }//GEN-LAST:event_jTextFieldTileFileFocusLost

    private void jTextFieldTileFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTileFileActionPerformed

        String file = jTextFieldTileFile.getText().trim();
        String _class = "";
        if (file.length() == 0) return;

    }//GEN-LAST:event_jTextFieldTileFileActionPerformed

    private void jButtonFileSelect1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFileSelect1ActionPerformed
        InternalFrameFileChoser fc = new de.malban.gui.dialogs.InternalFrameFileChoser();
        fc.setCurrentDirectory(new java.io.File("."+File.separator));
        int r = fc.showOpenDialog(Configuration.getConfiguration().getMainFrame());
        if (r != InternalFrameFileChoser.APPROVE_OPTION) return;
        String name = fc.getSelectedFile().getAbsolutePath();
        jTextFieldTileFile.setText(name);
        jTextFieldTileFileActionPerformed(null);
    }//GEN-LAST:event_jButtonFileSelect1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String text = dissiPanel1.dis(jTextFieldTileFile.getText(), de.malban.util.UtilityString.Int0(jTextField1.getText()));
        jTextArea1.setText(text);
        dissiPanel1.correctModel();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private de.malban.vide.dissy.DissiPanel dissiPanel1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonFileSelect1;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldTileFile;
    // End of variables declaration//GEN-END:variables

    
    public boolean isInit()
    {
        return init;
    }
    
    
    
    public MemoryInformation getMemoryInformation(int address)
    {
        return dasm.myMemory.memMap.get(address);
    }
    public static String SID = "dissiFull";
    public String getID()
    {
        return SID;
    }
    public Serializable getAdditionalStateinfo(){return null;}
    public void setAdditionalStateinfo(Serializable ser){}
    
}
