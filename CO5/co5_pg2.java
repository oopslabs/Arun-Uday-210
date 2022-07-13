import java.awt.*;
import java.applet.*;

/*
<applet code="co5_pg2.class" width=500 height=500>
<param name="a" value="10">
<param name="b" value="20">
<param name="c" value="15">
</applet>
*/

public class co5_pg2 extends Applet{
	int a,b,c,d;
	String str;

	public void start(){
		String s1;
		s1 = getParameter("a");
		a = Integer.parseInt(s1);

		s1 = getParameter("b");
		b = Integer.parseInt(s1);
		s1 = getParameter("c");
		c = Integer.parseInt(s1);
	}

	public void paint(Graphics g)
	{
		if ((a>b) && (a>c))
			d = a;
		else if((b>a) && (b>c))
			d = b;
		else
			d=c;


		g.drawString("a is   " + a, 10, 50);
		g.drawString("b is   " + b, 10, 100);
		g.drawString("c is   " + c, 10, 150);
		g.drawString("max of three numbers is " + d, 10, 200);
	}
}
