import java.awt.*;  
import java.awt.event.*;  
public class TextFieldExample extends Frame implements ActionListener{  
    TextField tf1,tf2,tf3; Label l1,l2,l3; 
    Button b1,b2,b3,b4,b5,b6;  
    TextFieldExample(){  
        l1 = new Label("calculator");
        l1.setBounds(220,35,60,30); l1.setBackground(Color.green); 
        l2 = new Label("LOGIN ID");
        l2.setBounds(65,270,60,30); l2.setBackground(Color.red); 
        l3 = new Label("PASSWORD");
        l3.setBounds(65,330,75,30); l3.setBackground(Color.green); 
        tf1=new TextField();  
        tf1.setBounds(100,70,150,20); tf1.setBackground(Color.yellow); 
        tf2=new TextField();  
        tf2.setBounds(100,120,150,20); tf2.setBackground(Color.green);  
        tf3=new TextField();  
        tf3.setBounds(100,170,150,20); tf3.setBackground(Color.red);  
        tf3.setEditable(false);   
        b1=new Button("+");  
        b1.setBounds(50,220,30,30);
        b1.setBackground(Color.yellow);
        b3=new Button("*");  
        b3.setBounds(190,220,30,30);
        b3.setBackground(Color.green); 
        b4=new Button("/");  
        b4.setBounds(260,220,30,30);b4.setBackground(Color.pink); 
        b5=new Button("LOGIN");
        b5.setBounds(60,400,60,30);b5.setBackground(Color.red);
        b6=new Button("LOGGED");
        b6.setBounds(200,400,70,30);b6.setBackground(Color.green);
        b2=new Button("-");  
        b2.setBounds(120,220,30,30);b2.setBackground(Color.red);  
        b1.addActionListener(this);  
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        add(tf1);add(tf2);add(tf3);add(b1);add(b2);add(b3);add(b4);add(l1);add(l2);add(l3);add(b5);add(b6);
        setSize(600,500);  
        setLayout(null);  
        setVisible(true); 
        setBackground(Color.blue);
    }         
    public void actionPerformed(ActionEvent e) {  
        String s1=tf1.getText();  
        String s2=tf2.getText();  
        int a=Integer.parseInt(s1);  
        int b=Integer.parseInt(s2);  
        int c=0;  
        if(e.getSource()==b1){  
            c=a+b;  
        }else if(e.getSource()==b2){  
            c=a-b;  
        }else if(e.getSource()==b3){  
            c=a*b;  
        }else if(e.getSource()==b4){  
            c=a/b;
          } 
        String result=String.valueOf(c);  
        tf3.setText(result);  
    }  
public static void main(String[] args) {  
    new TextFieldExample();  
}  
}  