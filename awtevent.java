import java.awt.*;
import java.awt.event.*;
class awtevent extends Frame implements ActionListener
{
TextField tf;
Button b;
awtevent()
{
tf = new TextField();
tf.setBounds(60,50,170,20);
b = new Button("click");
b.setBounds(100,120,80,30);
add(b);add(tf);
b.addActionListener(this);
setSize(300,300);
setLayout(null);
setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
tf.setText("welcome");
}
public static void main(String args[])
{
new awtevent();
}
}