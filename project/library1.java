import javax.swing.*;
import java.awt.event.*;  
public class library1 extends JFrame implements ActionListener {
JButton b1;
library1() {
JFrame k = new JFrame("Library Management System");
JLabel h = new JLabel("Library Management System");
h.setBounds(170,40,200,100);
b1 = new JButton("Admin Login");
b1.setBounds(190,190,120,40);
JButton b2 = new JButton("Librarian Login");
b2.setBounds(190,260,120,40);
b1.addActionListener(this);
add(h);add(b1);add(b2);
setLayout(null);
setVisible(true);
setSize(500,500);
setDefaultCloseOperation(EXIT_ON_CLOSE);  
}
public void actionPerformed(ActionEvent e)
{
	if(e.getSource()==b1)
	{
		library2 ob=new library2();
			ob.setVisible(true);
	}
} 
public static void main(String args[])
{
new library1();
}}







