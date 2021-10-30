import javax.swing.*;
import java.awt.event.*;  
public class library5 extends JFrame {
library5() {
JFrame f = new JFrame("Library Management System");
String data[][]={{"","","","","","",""},{"","","","","","",""},{"","","","","","",""},{"","","","","","",""},{"","","","","","",""},{"","","","","","",""},{"","","","","","",""},{"","","","","","",""},{"","","","","","",""},{"","","","","","",""}};
String column[]={"ID","NAME","PASSWORD","EMAIL","ADDRESS","CITY","CONTACT"};
JTable jt = new JTable(data,column);
  jt.setBounds(30,40,200,300);          
    JScrollPane sp=new JScrollPane(jt);    
    f.add(sp);          
    f.setSize(500,500);    
    f.setVisible(true);
     f.setDefaultCloseOperation(EXIT_ON_CLOSE);     
}     
public static void main(String[] args) {    
    new library5();
}}




