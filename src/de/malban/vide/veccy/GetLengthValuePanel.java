package de.malban.vide.veccy;


import de.malban.vide.vedi.panels.*;
import de.malban.config.Configuration;
import de.malban.gui.components.ModalInternalFrame;
import java.awt.event.KeyEvent;
import java.util.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

public class GetLengthValuePanel extends javax.swing.JPanel {

    /** Creates new form FilePropertiesPanel */
    public GetLengthValuePanel() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldLinenumber = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

        jTextFieldLinenumber.setText("127");
        jTextFieldLinenumber.setPreferredSize(new java.awt.Dimension(100, 21));
        jTextFieldLinenumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLinenumberActionPerformed(evt);
            }
        });
        jTextFieldLinenumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldLinenumberKeyPressed(evt);
            }
        });

        jLabel13.setText("Radius (max 127):");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldLinenumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jTextFieldLinenumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel13))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldLinenumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLinenumberActionPerformed
        String t = jTextFieldLinenumber.getText();
        lineNumber = de.malban.util.UtilityString.IntX(t, -1);
        ((ModalInternalFrame)modelDialog).modalExit(true);
    }//GEN-LAST:event_jTextFieldLinenumberActionPerformed

    private void jTextFieldLinenumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldLinenumberKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE )
        {
            ((ModalInternalFrame)modelDialog).modalExit(true);
        }
        if (evt.getKeyCode() == KeyEvent.VK_TAB )
        {
            ((ModalInternalFrame)modelDialog).modalExit(true);
        }
    }//GEN-LAST:event_jTextFieldLinenumberKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel13;
    private javax.swing.JTextField jTextFieldLinenumber;
    // End of variables declaration//GEN-END:variables

    int lineNumber = 127;
    // returns new Properties, not saved yet!
    ModalInternalFrame modelDialog;
    public static int showEnterValueDialog()
    {
        JFrame frame = Configuration.getConfiguration().getMainFrame();
        GetLengthValuePanel panel = new GetLengthValuePanel();
        
        ArrayList<JButton> eb= new ArrayList<JButton>();
        ModalInternalFrame modal = new ModalInternalFrame("Length?", frame.getRootPane(), frame, panel,null, null , null);
        panel.modelDialog = modal;
        modal.setVisible(true);
        return panel.lineNumber%128;
    }    

}
