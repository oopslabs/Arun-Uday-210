import java.applet.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.event.*;
public class co5_pg6 extends Applet implements ItemListener{
    Choice choice;
    int c;
    public void init(){
    choice = new Choice();
    choice.addItem("Shapes");
    choice.addItem("RECTANGLE");
    choice.addItem("SQUARE");
    choice.addItem("CIRCLE");
    choice.addItem("TRIANGLE");
    add(choice);
    choice.addItemListener(this);
}
    public void itemStateChanged (ItemEvent e){
    c= choice.getSelectedIndex();
    repaint();
}
    public void paint(Graphics g){
        super.paint(g);
        if (c == 1){
            g.drawRect(190,170,150,150);
            g.setColor(Color.green);
            g.fillRect(190,170,150,150);
        }
        if (c == 2){
            g.drawRect(200,200,50,50);
            g.setColor(Color.orange);
            g.fillRect(200,200,50,50);
        }
        if (c == 3){
            g.drawOval(180,180,100,100);
            g.setColor(Color.yellow);
            g.fillOval(180,180,100,100);
        }
        if (c ==4){
            int[] x={120,210,0};
            int[] y={0,210,210};
            g.drawPolygon(x,y,3);
            g.setColor(Color.blue);
            g.fillPolygon(x,y,3);
        }
    }
}
   /*<applet code="co5_pg6.class" width="500" height="700" border="2"></applet>*/
   