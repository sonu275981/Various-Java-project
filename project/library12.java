import javax.swing.*;
import java.awt.event.*;  
public class library12 extends JFrame {
library12() {
JFrame f = new JFrame("Library Management System");
String data[][]={{"","","","","","",""},{"","","","","","",""},{"","","","","","",""},{"","","","","","",""},{"","","","","","",""},{"","","","","","",""},{"","","","","","",""},{"","","","","","",""},{"","","","","","",""},{"","","","","","",""}};
String column[]={"ID","BookCallno","Student_Id","Student_name","Student_Contact","Quantity","Issue_Date"};
JTable jt = new JTable(data,column);
  jt.setBounds(30,40,200,300);          
    JScrollPane sp=new JScrollPane(jt);    
    f.add(sp);          
    f.setSize(850,400);    
    f.setVisible(true);
     f.setDefaultCloseOperation(EXIT_ON_CLOSE);     
}     
public static void main(String[] args) {    
    new library12();
}}




