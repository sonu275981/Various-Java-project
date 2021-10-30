import javax.swing.*;
import java.awt.event.*;  
public class library3 extends JFrame {
library3() {
JFrame k = new JFrame("Library Management System");
JLabel h = new JLabel("Admin Section");
h.setBounds(170,15,200,100);
JButton b1 = new JButton("Add Librarian");
b1.setBounds(110,100,200,40);
JButton b2 = new JButton("View Librarian");
b2.setBounds(110,155,200,40);
JButton b3 = new JButton("Delete Librarian");
b3.setBounds(110,205,200,40);
JButton b4 = new JButton("Logout");
b4.setBounds(110,255,200,40);

add(h);add(b1);add(b2);add(b3);add(b4);
setLayout(null);
setVisible(true);
setSize(500,500);
setDefaultCloseOperation(EXIT_ON_CLOSE);  
}
public static void main(String args[])
{
new library3();
}}