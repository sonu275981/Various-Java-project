import java.util.*;
import java.awt.*;
import java.applet.*;

public class immge extends Applet
{
 Image sonu;  
  
  public void init() {  
    sonu = getImage(getDocumentBase(),"2.jpg");  
  }  


   public void paint(Graphics g)
  { 
     for(int i=0;i<500;i++)
      {  
    g.drawImage(sonu, 30,30, this);
      try{Thread.sleep(100);}catch(Exception e){}  
      }
    g.setColor(Color.red);  
    g.drawArc(90,150,30,30,30,270);
    g.fillArc(270,150,30,30,0,180); 
  }
}



/*
<applet code="immge.class" width="300" height="300">  
</applet>
*/  