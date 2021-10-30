import javax.swing.*;
import java.awt.event.*;  
public class library10 extends JFrame {
library10() {
JFrame f = new JFrame("Library Management System");
JLabel h = new JLabel("Issue Book");
h.setBounds(195,-20,200,100);
 JTextField text1 = new JTextField();
text1.setBounds(220,55,150,20);
JTextField text2 = new JTextField();
text2.setBounds(220,85,150,20);
JTextField text3 = new JTextField();
text3.setBounds(220,115,150,20);
JTextField text4 = new JTextField();
text4.setBounds(220,145,150,20);


JLabel w1 = new JLabel("Book Call No:");
w1.setBounds(90,55,150,20);
JLabel w2 = new JLabel("Student Id:");
w2.setBounds(90,85,150,20);
JLabel w3 = new JLabel("Student Name");
w3.setBounds(90,115,150,20);
JLabel w4 = new JLabel("Student Contact:");
w4.setBounds(90,145,150,20);


JButton b1 = new JButton("Issue Book");
b1.setBounds(150,255,150,30);
JButton b2 = new JButton("Back");
b2.setBounds(360,315,100,30);
  f.add(text1); f.add(h);f.add(text2);f.add (text3);f.add(text4);
 f.add(w1);f.add(w2);f.add(w3);f.add(w4);
f.add(b1);f.add(b2);
                f.setSize(500,500);    
                f.setLayout(null);    
                f.setVisible(true); 
           f.setDefaultCloseOperation(EXIT_ON_CLOSE);  
           }
          public static void main(String args[])
           {
          new library10();
           }}




