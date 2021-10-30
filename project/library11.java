import javax.swing.*;
import java.awt.event.*;  
public class library11 extends JFrame {
library11() {
JFrame f = new JFrame("Library Management System");
String data[][]={{"","","","","","","",""},{"","","","","","","",""},{"","","","","","","",""},{"","","","","","","",""},{"","","","","","","",""},{"","","","","","","",""},{"","","","","","","",""},{"","","","","","","",""},{"","","","","","","",""},{"","","","","","","",""}};
String column[]={"ID","Callno","Name","Author","Publisher","Quantity","Issued","Added_date"};
JTable jt = new JTable(data,column);
  jt.setBounds(30,40,200,300);          
    JScrollPane sp=new JScrollPane(jt);    
    f.add(sp);          
    f.setSize(650,400);    
    f.setVisible(true); 
     f.setDefaultCloseOperation(EXIT_ON_CLOSE);    
}     
public static void main(String[] args) {    
    new library11();
}}




