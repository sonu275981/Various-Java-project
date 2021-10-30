import java.awt.*; 
import javax.swing.*; 
class First 
{  
First()
{  
JFrame ob=new JFrame("Hello");
JButton b=new JButton("click me");  
b.setBounds(30,100,90,60);// setting button position  
ob.add(b);//adding button into frame  
ob.setSize(300,300);//frame size 300 width and 300 height  
ob.setLayout(null);//no layout manager  
ob.setVisible(true);//now frame will be visible, by default not visible  
}  
public static void main(String args[]){  
First f=new First();  
}}  