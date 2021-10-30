import javax.swing.*;
import java.awt.*;
import java.awt.event.*;      
public class swingg {
public static void main(String args[]) {    
JFrame f = new JFrame("Facebook");
JButton b = new JButton("Login");
b.setBounds(190,300,90,30);
ImageIcon s = new ImageIcon("facebook.jpg");
JLabel t3 = new JLabel(s);
t3.setBounds(210,70,250,90);
JLabel t1 = new JLabel("USER ID");
t1.setBounds(130,150,200,50);
JLabel t2 = new JLabel("Password");
t2.setBounds(130,190,200,50);
JTextField x1 = new JTextField("name",2);
x1.setBounds(200,165,120,20);
JTextField x2 = new JTextField("PASSWORD",2);
x2.setBounds(200,205,120,20);
f.add(b);f.add(t2);f.add(t1);f.add(x1);f.add(x2);
f.add(t3); 
 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    f.setSize(600,500);  
    f.setLayout(null);  
    f.setVisible(true);  
    }  
    }  