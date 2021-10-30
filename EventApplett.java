import java.applet.*;  
import java.awt.*;  
import java.awt.event.*;  
public class EventApplett extends Applet  implements ActionListener{  
Button b,k;  
TextField tf,tc;  
  
public void init(){  
tf=new TextField(); 
tc=new TextField();  
b=new Button("Click"); 
k=new Button("ram"); 
setBackground(Color.red); 
setLayout(null); 

tf.setBounds(30,40,150,20);  
b.setBounds(80,150,60,50);  

tc.setBounds(50,70,150,20);  
k.setBounds(150,190,60,50);  
 
add(b); add(k);
add(tf); add(tc);  
b.addActionListener(this); 
k.addActionListener(this);
   
}  
  public void actionPerformed(ActionEvent e){  
if(e.getSource()==b)
{ 
 tf.setText("Welcome");  
}
if(e.getSource()==k)
{ 
 tc.setText("pappu"); 
}
}
}  
/*
<applet code="EventApplett.class" width="300" height="300">  
</applet>
*/  