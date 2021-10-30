import java.applet.Applet;  
import java.awt.*;  
public class aplet extends Applet
{  
  
public void paint(Graphics g)
{ 
g.setColor(Color.blue);  
g.drawString("welcome",160,160); 
g.setColor(Color.black);  
g.drawString("sonu",150,150); 
}  
  
}

/* 
<applet code="aplet.class" width="500" height="500"> 
</applet> 
*/    