/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.malban.vide.script;

import de.malban.vide.veccy.VeccyPanel;
import static de.malban.vide.script.ExportDataPanel.IMPORT;

/**
 *
 * @author malban
 */
public class ImportFrame extends javax.swing.JFrame {

    /**
     * Creates new form ExportFrame
     */
    public ImportFrame() {
        initComponents();
    }

    public ImportFrame(VeccyPanel sourceEdit) {
        initComponents();
        exportDataPanel1.setData(sourceEdit, IMPORT, this);        
    }    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exportDataPanel1 = new de.malban.vide.script.ExportDataPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Import");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exportDataPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1040, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exportDataPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private de.malban.vide.script.ExportDataPanel exportDataPanel1;
    // End of variables declaration//GEN-END:variables
}
