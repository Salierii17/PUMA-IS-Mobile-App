package Final.project;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
public class FinalProject {
   public static void main(final String args[]) {

      // Frame
      JFrame frame = new JFrame("KUKUS");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      ImageIcon img = new ImageIcon("/steam.png");
      frame.setSize(550, 350);
      frame.setIconImage(img.getImage());

      // menubar
      JMenuBar mb = new JMenuBar();
      JMenu brand = new JMenu("kukus");
      JMenuItem icon = new JMenuItem(img);
      brand.setMnemonic(KeyEvent.VK_F);
      mb.add(brand);
      mb.add(icon);
      mb.add(Box.createHorizontalGlue());
      
      JMenu aboutMenu = new JMenu("About");
      aboutMenu.setMnemonic(KeyEvent.VK_S);
      mb.add(aboutMenu);

      JMenu LoginMenu = new JMenu("Log in");
      // LoginMenu.setMnemonic(KeyEvent.VK_R);
      mb.add(LoginMenu);
      // menuBar.revalidate();
      // frame.setJMenuBar(mb);
      frame.getContentPane().add(BorderLayout.CENTER.mb);
      frame.setVisible(true);

      JLabel title =  new JLabel("KUKUS");
      frame.add(title);
      
   }
}