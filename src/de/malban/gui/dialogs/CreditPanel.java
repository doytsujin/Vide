/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CreditPanel.java
 *
 * Created on 05.04.2010, 23:00:22
 */

package de.malban.gui.dialogs;
import de.malban.config.Configuration;
import de.malban.gui.CSAMainFrame;
import de.malban.gui.Windowable;
import de.malban.gui.components.CSAView;
/**
 *
 * @author Malban
 */
public class CreditPanel extends javax.swing.JPanel  implements Windowable{

    private CSAView mParent = null;
    private javax.swing.JMenuItem mParentMenuItem = null;
    private int mClassSetting=0;

    @Override
    public void closing(){}
    @Override
    public void setParentWindow(CSAView jpv)
    {
        mParent = jpv;
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
    public void setMenuItem(javax.swing.JMenuItem item)
    {
        mParentMenuItem = item;
        mParentMenuItem.setText("Credits");
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


    /** Creates new form CreditPanel */
    public CreditPanel() {
        initComponents();
        jTextPane1.setCaretPosition(0);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        jTextPane1.setContentType("text/html"); // NOI18N
        jTextPane1.setText("<html>\r\n  <head>\r\n\r  </head>\r\n  <body>\r\n    <p style=\"margin-top: 0\">\r\n<h1>Credits</h1>\n<p>\n<b>TT - Tile Tools</b> (and all code done by me) is open source and released und GPL 2.0.\n</p>\n<p>All stuff I didn´t do myself was taken from some accessable internet site. In my believe everything contained in this program is either done by myself or free to share. Some stuff I searched for, found and put into the game and can´t seem to track down anymore. I´m sorry if I miss some credits here. If a credit is missing it is <b>not</b> because I don´t want to give credit where it is due, but because I´m such a scatterbrain, that I didn´t keep track of things I found. If you are such a person, please contact me and I will certainly give credit!<BR>\nIf for some reason copyrighted work which is not free to use is contained, please contact me and I will remove it as soon as possible.</p> \n\t\n\t<P> <b>Graphics:</b><br> \n\t<i>a)</i> Some taken from:<BR>\n\tHomepage: \"http://www.reinerstilesets.de/\"<i>Reiner \"Tiles\" Prokein</i><BR>\n\tThanks for making such a generous site. <BR>\n\n\t<i>b)</i> Jerry Huxtable, for the coding of image filters, and making them available:<BR>\n\tHomepage: \"http://www.jhlabs.com/\"<BR>\n\t<BR>\n\n\t<i>c)</i> WTactics, releasing there graphics under the GPL 2.0 license - <b>absolut fantastic!</B><BR>\n\tHomepage: \"http://wtactics.org/\"<BR>\n\t(see also README in image folder)\n\t<BR><BR>\n\t</p>\n\n\t<P> <b>Coding:</b><br> \n\t<i>a)</i> Scripting Bean Shell:<BR>\n\tHomepage: \"http://www.beanshell.org/\"<BR>\n\t\n\t<i>b)</i> Glitter inspired by:<BR>\n\tHomepage: \"http://www.eigelb.at/\"<BR>\n\n\t<i>c)</i> Syntax highlighting:<BR>\n\t(shifted to my code base, corrected a bug and got rid of that \"I want to live forever\"- Thread!)<br>\n\tHomepage: \"http://ostermiller.org/syntax/\"<BR>\n\n\t<i>g)</i> Sun :-)<BR>\n\tFor Java and Netbeans.<br>\n\t</p>\n\n\t<P> <b>Help:</b><br> \n\t<i>a)</i> Javadoc2Help<BR>\n\tHomepage: \"http://javadoc2help.sourceforge.net/\" <i></i><BR>\n\n\t<i>b)</i> HelpSetMaker:<BR>\n\tHomepage: \"http://www.cantamen.de/helpsetmaker.php\"<BR>\n\t</p>\n </p>\r\n  </body>\r\n</html>\r\n"); // NOI18N
        jTextPane1.setName("jTextPane1"); // NOI18N
        jScrollPane1.setViewportView(jTextPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
    public void deIconified() { }

}
