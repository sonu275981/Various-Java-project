import javax.swing.*;
public class swingbtn {
public static void main(String[] args) { 
JFrame t = new JFrame("swing button");
JButton b = new JButton("click me");
b.setBounds(50,100,95,30);
t.add(b);
t.setSize(500,500);
t.setLayout(null);
t.setVisible(true);

}
}