import javax.swing.*;
import java.awt.event.*;  
public class checkboxx extends JFrame implements ActionListener{
JCheckBox c1,c2,c3;JButton b;
checkboxx() {
JFrame k = new JFrame("Job Requirment");
 JLabel h = new JLabel("Job for Developer");
h.setBounds(190,40,200,60);
 c1 = new JCheckBox("java",true);
c1.setBounds(100,100,50,50);
 c2 = new JCheckBox("c++");
c2.setBounds(100,150,50,50);
 c3 = new JCheckBox("Phyton",true);
c3.setBounds(100,200,90,50);
 b = new JButton("Apply");
b.setBounds(190,250,90,30);
b.addActionListener(this);
k.add(h);k.add(c1);k.add(c2);k.add(c3);k.add(b);
k.setLayout(null);
k.setVisible(true);
k.setSize(500,500);
k.setDefaultCloseOperation(EXIT_ON_CLOSE);  
}
public void actionPerformed(ActionEvent e) {
String msg="";
 if(c1.isSelected())
{
msg="Apply for java\n";
}
if(c2.isSelected())
{
msg+="Apply for c++\n";
}
if(c3.isSelected())
{
msg+="Apply for Phyton\n";
}
msg+="********************\n";
 JOptionPane.showMessageDialog(this,msg+"job Applied: Thanku ");  
} 
public static void main(String args[])
{
new checkboxx();
}}