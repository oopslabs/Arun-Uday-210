import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class co5_pg4 extends Applet implements MouseListener 
{
 	int a,b;
 	public void init()
 	{
		addMouseListener( this);
 	}
 	public void paint(Graphics g)
 	{
 		int x[]={130,320,225};
 		int y[]={150,150,25};
 		g.drawPolygon(x,y,3);
 		g.setColor(Color.yellow);
 		g.fillPolygon(x,y,3);
		g.drawRect(150,150,150,200);
 		g.setColor(Color.gray);
		g.fillRect(150,150,150,200);
 		g.drawRect(200, 200,50,150);
 		g.setColor(Color.blue);
 		g.fillRect(200,200,50,150);
 
 		g.drawOval(200,75,50,50);
 		g.setColor(Color.white);
 		g.fillOval(200,75,50,50);
		if(a>200 && a<300 && b>200 && b<300) 
        	{ 
            g.setColor(Color.red); 
            g.fillRect(200, 200, 50, 150); 
        	} 

 	}
	public void mouseClicked(MouseEvent e) 
    	{ 
 		a=e.getX();
		b=e.getY();
		repaint(); 
    	} 
    	public void mouseEntered(MouseEvent e) 
    	{ 
 
    	}  
    	public void mouseExited(MouseEvent e) 
	{ 
 
    	} 
 	public void mouseReleased(MouseEvent e) 
    	{ 
 
    	} 
	public void mousePressed(MouseEvent e) 
    	{ 

	}

}
/*
<applet code="co5_pg4.class" width="500" 
height="700" border="2">
</applet>
*/