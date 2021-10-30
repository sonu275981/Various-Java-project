import javax.swing.*;
import java.awt.event.*;  
public class library4 extends JFrame {
library4() {
JFrame f = new JFrame("Library Management System");
JLabel h = new JLabel("Add Librarian");
h.setBounds(170,-20,200,100);
 JTextField text1 = new JTextField();
text1.setBounds(220,55,150,20);
JTextField text2 = new JTextField();
text2.setBounds(220,85,150,20);
JTextField text3 = new JTextField();
text3.setBounds(220,115,150,20);
JTextField text4 = new JTextField();
text4.setBounds(220,145,150,20);
JTextField text5 = new JTextField();
text5.setBounds(220,175,150,20);
JTextField text6 = new JTextField();
text6.setBounds(220,205,150,20);
JLabel w1 = new JLabel("Name:");
w1.setBounds(90,55,150,20);
JLabel w2 = new JLabel("Password:");
w2.setBounds(90,85,150,20);
JLabel w3 = new JLabel("Email:");
w3.setBounds(90,115,150,20);
JLabel w4 = new JLabel("Address:");
w4.setBounds(90,145,150,20);
JLabel w5 = new JLabel("City:");
w5.setBounds(90,175,150,20);
JLabel w6 = new JLabel("Contact No:");
w6.setBounds(90,205,150,20);
JButton b1 = new JButton("Add Librarian");
b1.setBounds(150,255,150,30);
JButton b2 = new JButton("Back");
b2.setBounds(170,315,100,30);
  f.add(text1); f.add(h);f.add(text2);f.add (text3);f.add(text4);f.add(text5);f.add(text6);
 f.add(w1);f.add(w2);f.add(w3);f.add(w4);f.add(w5);
f.add(w6);f.add(b1);f.add(b2);
                f.setSize(500,500);    
                f.setLayout(null);    
                f.setVisible(true); 
           f.setDefaultCloseOperation(EXIT_ON_CLOSE);  
           }
          public static void main(String args[])
           {
          new library4();
           }}




