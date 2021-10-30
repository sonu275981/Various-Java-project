import javax.swing.*;
import java.awt.event.*;  
public class library7 extends JFrame {
library7() {
JFrame f = new JFrame("Libaraian Login Form");
JLabel h = new JLabel("Libaraian Login Form");
h.setBounds(170,20,200,100);

     
     final JLabel label = new JLabel();            
     label.setBounds(20,150, 200,50);  
    final JPasswordField value = new JPasswordField();   
     value.setBounds(220,230,150,20);   
     JLabel l1=new JLabel("Enter Name:");    
        l1.setBounds(100,150,120,40);    
        JLabel l2=new JLabel("Enter Password:");    
        l2.setBounds(100,220, 100,30);    
        JButton b = new JButton("Login");  
        b.setBounds(190,320, 80,30);    
        final JTextField text = new JTextField();  
        text.setBounds(220,160,150,20);    
                f.add(value); f.add(l1); f.add(label); f.add(l2); f.add(b); f.add(text);f.add(h);  
                f.setSize(500,500);    
                f.setLayout(null);    
                f.setVisible(true); 
           f.setDefaultCloseOperation(EXIT_ON_CLOSE);  
           }
          public static void main(String args[])
           {
          new library7();
           }}
 












 






