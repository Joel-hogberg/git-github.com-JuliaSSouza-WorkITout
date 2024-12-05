import javax.swing.*;
import java.awt.Color;
import helper_classes.*;

public class WindowBuilder {
  public static void main(String[] args) {

     JFrame frame = new JFrame("My Awesome Window");
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setSize(679, 367);
     JPanel panel = new JPanel();
     panel.setLayout(null);
     panel.setBackground(Color.decode("#003c6b"));
     JPasswordField element2 = new JPasswordField("");
     element2.setBounds(282, 142, 114, 21);
     element2.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
     element2.setBackground(Color.decode("#B2B2B2"));
     element2.setForeground(Color.decode("#656565"));
     element2.setBorder(new RoundedBorder(2, Color.decode("#979797"), 0));
     OnFocusEventHelper.setOnFocusText(element2, "Password", Color.decode("#353535"),   Color.decode("#656565"));
     panel.add(element2);

     JLabel element4 = new JLabel("Log In");
     element4.setBounds(297, 54, 95, 37);
     element4.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 30));
     element4.setForeground(Color.decode("#D9D9D9"));
     panel.add(element4);

     JTextField element5 = new JTextField("");
     element5.setBounds(282, 110, 114, 21);
     element5.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
     element5.setBackground(Color.decode("#B2B2B2"));
     element5.setForeground(Color.decode("#656565"));
     element5.setBorder(new RoundedBorder(2, Color.decode("#979797"), 0));
     OnFocusEventHelper.setOnFocusText(element5, "Username", Color.decode("#353535"),   Color.decode("#656565"));
     panel.add(element5);

     JLabel element6 = new JLabel("Forgot Your Password?");
     element6.setBounds(281, 175, 126, 21);
     element6.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 12));
     element6.setForeground(Color.decode("#D9D9D9"));
     panel.add(element6);

     JButton element7 = new JButton("Create Account");
     element7.setBounds(285, 207, 106, 29);
     element7.setBackground(Color.decode("#2e2e2e"));
     element7.setForeground(Color.decode("#D9D9D9"));
     element7.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 12));
     element7.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
     element7.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(element7, Color.decode("#232323"), Color.decode("#2e2e2e"));
     panel.add(element7);

     frame.add(panel);
     frame.setVisible(true);

  }
}