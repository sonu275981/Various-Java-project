import java.awt.*;  
import java.applet.*;  
  
  
public class DisplayImage extends Applet {  
  
  Image kamal;  
  
  public void init() {  
    kamal = getImage(getDocumentBase(),"a1.png");  
  }  
    
  public void paint(Graphics g) {  
    g.drawImage(kamal, 30,30, this); 
    g.setColor(Color.green);
  
g.drawString("Welcome",50, 50);  
g.drawLine(20,30,20,300);  
g.drawRect(70,100,30,30);  
g.fillRect(170,100,30,30);  
g.drawOval(70,200,30,30);  
  
g.setColor(Color.black);  
g.fillOval(170,200,30,30);  
g.drawArc(90,150,30,30,30,270);  
g.fillArc(270,150,30,30,0,180); 
  }  
      
  } 
/*
 
<applet code="DisplayImage.class" width="300" height="300">  
</applet> 
*/