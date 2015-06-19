package xyz.ajinkya.StktToCM;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Hello world!
 * 
 */
public class App {

  public static void main(String[] args) {
    JFrame frame = new JFrame("StktToCM...");
    frame.setSize(300, 300);
    JLabel label = new JLabel();
    Container content = frame.getContentPane();
    content.add(label, BorderLayout.CENTER);
    String message = "Lets take a look into CM";
    label.setText(message);
    frame.setVisible(true);
  }
}
