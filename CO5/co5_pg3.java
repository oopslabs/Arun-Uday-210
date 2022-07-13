import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/* 
<applet code = "co5_pg3.class" width = 500 height = 500>
</applet>
*/

public class co5_pg3 extends Applet implements ActionListener
{
	Label l1,l2,l3,l4,l5,l6;
	TextField t1,t2,t3,t4,t5,t6;
	Button b;
	int avg;
	public void init()
	{
		l1 = new Label("Mark 1:");
		t1 = new TextField(10);

		l2 = new Label("Mark 2:");
		t2 = new TextField(10);

		l3 = new Label("Mark 3:");
		t3 = new TextField(10);

		l4 = new Label("Mark 4:");
		t4 = new TextField(10);

		l5 = new Label("Mark 5:");
		t5 = new TextField(10);
		
		l6 = new Label("Average :");
		t6 = new TextField(10);

		b = new Button("add");

		add(l1); add(t1);
		add(l2); add(t2);
		add(l3); add(t3);
		add(l4); add(t4);
		add(l5); add(t5);
		add(l6); add(t6);
		add(b);
		b.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		int n1=Integer.parseInt(t1.getText());     
		int n2=Integer.parseInt(t2.getText());     
		int n3=Integer.parseInt(t3.getText());
		int n4=Integer.parseInt(t4.getText());
		int n5=Integer.parseInt(t5.getText()); 
		if(e.getSource() == b)
		{
        		avg=(n1+n2+n3+n4+n5)/5;         
			t6.setText(String.valueOf(avg)); 
			Graphics g=getGraphics();
			if(avg > 50) 
        		{ 
       		g.setColor(Color.YELLOW); 
        		g.fillOval(20, 100, 300, 300); 
        		g.setColor(Color.BLACK); 
        		g.fillOval(100, 175, 30, 30); 
        		g.fillOval(220, 175, 30, 30); 
			g.fillOval(105, 250, 120, 60); 
		      g.setColor(Color.YELLOW); 
        		g.fillRect(105, 250, 120, 30); 
        		g.fillOval(105, 260, 120, 40); 
        		}  
			else 
        		{ 
        		g.setColor(Color.yellow); 
        		g.fillOval(20,100,300,300); 
        		g.setColor(Color.black ); 
        		g.fillOval(100,175,30,30); 
        		g.fillOval(220,175,30,30); 
        		g.setColor(Color.black); 
        		g.drawArc(95,250,150,150,0,180); 
        		g.fillArc(95,250,150,150,0,180); 
 
            	}
		} 
	}

} 

