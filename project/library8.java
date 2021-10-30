import javax.swing.*;
import java.awt.event.*;  
public class library8 extends JFrame {
library8() {
JFrame k = new JFrame("Library Management System");
JLabel h = new JLabel("Librarian Section");
h.setBounds(170,15,200,100);
JButton b1 = new JButton("Add Book");
b1.setBounds(110,100,200,40);
JButton b2 = new JButton("View Book");
b2.setBounds(110,155,200,40);
JButton b3 = new JButton("Issue Book");
b3.setBounds(110,205,200,40);
JButton b4 = new JButton("View Issued Book");
b4.setBounds(110,260,200,40);
JButton b5 = new JButton("Return Book");
b5.setBounds(110,315,200,40);
JButton b6 = new JButton("Logout");
b6.setBounds(110,370,200,40);

add(h);add(b1);add(b2);add(b3);add(b4);add(b5);
add(b6);
setLayout(null);
setVisible(true);
setSize(500,500);
setDefaultCloseOperation(EXIT_ON_CLOSE);  
}
public static void main(String args[])
{
new library8();
}}