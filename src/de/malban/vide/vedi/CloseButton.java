/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.malban.vide.vedi;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

/**
 *
 * @author malban
 */
public class CloseButton extends javax.swing.JPanel {

    public static  final int CB_NORMAL = 0;
    public static  final int CB_ARMED = 1;
    public static  final int CB_PRESSED = 2;
    
    public int state = CB_NORMAL;
    
    public Color background;
    
    private ArrayList<CloseListener> mListener= new ArrayList<CloseListener>();
    /**
     * Creates new form CloseButton
     */
    public CloseButton() {
        initComponents();
        background = getBackground();
        setStateDisplay();
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

        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setMaximumSize(new java.awt.Dimension(10, 10));
        setPreferredSize(new java.awt.Dimension(10, 10));
        setSize(new java.awt.Dimension(10, 10));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });
        setLayout(null);

        jLabel1.setText("x");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel1MouseReleased(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
        });
        add(jLabel1);
        jLabel1.setBounds(2, -3, 6, 15);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        setArmed(true);
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        setNormal();
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        setPressed(true);
    }//GEN-LAST:event_jLabel1MousePressed

    private void jLabel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseReleased
        
        if ((state & CB_ARMED) == CB_ARMED)
            fireClosePressed();
        setNormal();
    }//GEN-LAST:event_jLabel1MouseReleased

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        setArmed(true);
    }//GEN-LAST:event_formMouseEntered

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
        setNormal();
    }//GEN-LAST:event_formMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
    public void setArmed(boolean b)
    {
        if (b)
        {
            state = state | CB_ARMED;
        }
        else
            state = state & (~CB_ARMED);
        setStateDisplay();
    }
    public void setPressed(boolean b)
    {
        if (b)
            state = state | CB_PRESSED;
        else
            state = state & (~CB_PRESSED);
        setStateDisplay();
    }
    public void setNormal()
    {
        state = CB_NORMAL;
        setStateDisplay();
    }
    void setStateDisplay()
    {
        if ((state & CB_ARMED) == CB_ARMED)
            setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        else
            setBorder(javax.swing.BorderFactory.createLineBorder(getBackground()));
        if ((state & CB_PRESSED) == CB_PRESSED)
            setBackground(new Color (100,100,100,255));
        else
            setBackground(background);
        repaint();
    }
    private void fireClosePressed()
    {
        boolean close = true;
        CloseEvent e = new CloseEvent();
        e.source = this;

        // otherwise concurrent exceptions might occur
        ArrayList<CloseListener> clone = (ArrayList<CloseListener>) mListener.clone();
        for (CloseListener l: clone)
        {
            close = l.closeRequested(e);
            if (!close) return;
        }
    }
    public void addCloseListerner(CloseListener listener)
    {
        mListener.remove(listener);
        mListener.add(listener);
    }

    public void removeCloseListerner(CloseListener listener)
    {
        mListener.remove(listener);
    }
    public void clearCloseListerner()
    {
        mListener.clear();
    }
    public void renameTo(String newFilename)
    {
        ArrayList<CloseListener> clone = (ArrayList<CloseListener>) mListener.clone();
        for (CloseListener l: clone)
        {
            l.renameTo(newFilename);
        }
        
    }
}
