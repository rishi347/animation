package p1;
import java.awt.*;
public class F2 extends Frame
{
	  public void paint(Graphics g)
	  {
                 
		 
                  g.setColor(Color.white);
	          g.fillOval(200,100,100,100); 
                 
		 g.setColor(Color.pink);
                   g.fillRect(660,200,230,380);	
		 g.setColor(Color.yellow);
                  g.fillRect(710,210,40,50);
		  g.fillRect(800,210,40,50);
		  g.fillRect(710,290,40,50);
		  g.fillRect(800,290,40,50);
		  g.fillRect(710,370,40,50);
		  g.fillRect(800,370,40,50);
		  g.fillRect(710,450,40,50);
		  g.fillRect(800,450,40,50);

			 g.setColor(Color.gray);
		      g.fillRect(0,580,1000,150);
            	
		  g.setColor(Color.green);
	      g.fillArc(100,515,200,130,0,180);
		  g.fillArc(200,515,200,130,0,180);		 
		  g.drawLine(1000,580,0,580);
		  
	   
	  }
			 
				
      
			 
	  
}
	   
