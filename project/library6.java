import javax.swing.*;
import java.awt.event.*;  
public class library6 extends JFrame {
JLabel h;JTextField text1;JButton b1;JButton b2;
library6() {
JFrame f = new JFrame("Library Management System");
 h = new JLabel("Enter Id:");
h.setBounds(100,55,200,100);
  text1 = new JTextField();
text1.setBounds(220,95,150,20);
 b1 = new JButton("Delete");
b1.setBounds(150,195,150,30);
 b2 = new JButton("Back");
b2.setBounds(270,315,100,30);
f.add(b1);f.add(b2);f.add(h);f.add(text1);
                f.setSize(500,500);    
                f.setLayout(null);    
                f.setVisible(true); 
           f.setDefaultCloseOperation(EXIT_ON_CLOSE);  
           }
          public static void main(String args[])
           {
          new library6();
           }}





