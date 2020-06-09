package p2;
import p1.*;
import java.awt.*;
class W extends Frame
{
      public void paint(Graphics g)
	  {
                  int f=300,h=430;
				  int b=100;
                  g.setColor(Color.pink);
		  g.fillRect(660,200,230,380);
		  
		  
		  g.setColor(Color.black);
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
		
	    
		 
		 for(;f<=640 && h<=1030&&b<=900;f=f+5,h=h+5,b=b+5)
			{

				g.setColor(Color.white);
				g.fillArc(f,115,140,60,0,180);
		 		g.fillArc(h,115,140,60,0,180);
				 
			    			 	     
				try
				{
					
				   g.setColor(Color.yellow);
				   g.fillOval(200,b,100,100);
					Thread.sleep(100);
				   g.setColor(Color.white);
				   g.fillArc(f,115,140,60,0,180);
		 		   g.fillArc(h,115,140,60,0,180);
				    Thread.sleep(50);
					
				}
				    
				catch(Exception ae)
				{}
				  g.setColor(Color.cyan);
				  g.fillOval(200,b,100,100);
				  g.fillArc(f,115,140,60,0,180);
		 		  g.fillArc(h,115,140,60,0,180);
				
				
		     g.setColor(Color.gray);
		     g.fillRect(0,580,1000,150);
		     g.setColor(Color.green);
	             g.fillArc(100,515,200,130,0,180);
		     g.fillArc(200,515,200,130,0,180);		 
		     g.drawLine(1000,580,0,580);
		
				
			
		    }
			       this.dispose();
			        F2 b1=new F2();
                        b1.setBackground(Color.black);
                        
		        
                                    
	                b1.setSize(1000,800);
	                b1.setVisible(true); 
		
			 
		 
      }		 
	  


   public static void main(String ar[])
   {
       W o1=new W();
	   
	    o1.setBackground(Color.cyan);
	   o1.setSize(1000,800);
	   o1.setVisible(true);
	  
	}
}	
