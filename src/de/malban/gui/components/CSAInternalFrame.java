/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * JPortalInternalFrame.java
 *
 * Created on 10.02.2010, 23:54:00
 */

package de.malban.gui.components;

import de.malban.gui.Windowable;
import java.awt.Rectangle;
import javax.swing.SwingUtilities;

/**
 *
 * @author Malban
 */
public class CSAInternalFrame extends javax.swing.JInternalFrame {

    private static int _UID_ = 0;
    
    public final int uid = (_UID_++);
    
    CSAView mParent =null;
    /** Creates new form CSAInternalFrame */
    public CSAInternalFrame() {
        initComponents();
        
        // Theme t = Configuration.getConfiguration().getCurrentTheme();
        // setFrameIcon(new javax.swing.ImageIcon(t.getImage("BlueIconSmall.png")));
        
        
//if (uid ==2)
//    System.out.println("HERE:\n"+de.malban.util.Utility.getCurrentStackTrace());
        
    }

    public void setParent(CSAView p)
    {
        mParent=p;
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setClosable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(800, 600));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        if (mParent != null)
            mParent.removeInternalFrame(this);
    }//GEN-LAST:event_formInternalFrameClosed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        mParent.aboutToCloseInternalFrame(this);
    }//GEN-LAST:event_formInternalFrameClosing

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentResized
    javax.swing.JPanel mPanel;
    public void addPanel(javax.swing.JPanel panel)
    {
//        System.out.println(""+uid+"panel added: "+panel.toString());
        mPanel = panel;
        add(panel, java.awt.BorderLayout.CENTER);
    }

    public javax.swing.JPanel getPanel()
    {
//        System.out.println(""+uid+"panel trued to get: "+mPanel);
        return mPanel;
    }
    public void iconified()
    {
    }
    public void deIconified()
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                doLayout();
                invalidate();
                validate();
                repaint();
                mPanel.doLayout();
                mPanel.invalidate();
                mPanel.validate();
                mPanel.repaint();
                if (mPanel instanceof Windowable)
                    ((Windowable)mPanel).deIconified();

                CSAInternalFrame.this.setBounds(CSAInternalFrame.this.getBounds().x, CSAInternalFrame.this.getBounds().y, CSAInternalFrame.this.getBounds().width+1, CSAInternalFrame.this.getBounds().height);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    boolean iconState = false;
    public void setIconState(boolean s)
    {
        iconState = s;
    }
    public boolean getIconState()
    {
        return iconState;
    }
    Rectangle iBounds = null;
    public void setIconBounds(Rectangle b)
    {
        iBounds = new Rectangle(b);
    }
    public Rectangle getIconBounds()
    {
        return iBounds;
    }
}
