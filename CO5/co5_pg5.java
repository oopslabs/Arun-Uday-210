import java.awt.*; 
import java.awt.event.*; 
import java.applet.*;
 
public class co5_pg5 extends Applet implements ActionListener
{ 
//declaring object 
 Frame f=new Frame(); 
 Label l1=new Label("first number"); 
 Label l2=new Label("second number"); 
 Label l3=new Label("result"); 
 
TextField t1=new TextField(); 
TextField t2=new TextField(); 
TextField t3=new TextField(); 
 
 Button b1=new Button("Add"); 
 Button b2=new Button("Mult"); 
 Button b3=new Button("Sub"); 
 Button b4=new Button("Div"); 
 
public co5_pg5() 
{ 
//giving coordinates  
l1.setBounds(50,100,100,20);  
l2.setBounds(50,150,100,20);  
l3.setBounds(50,190,100,20); 
 
 t1.setBounds(200,100,100,20);  
 t2.setBounds(200,150,100,20);  
 t3.setBounds(200,190,100,20); 
  b1.setBounds(50,250,50,20);
  b1.setBackground(Color.yellow);  
  b2.setBounds(110,250,50,20); 
  b2.setBackground(Color.yellow);  
  b3.setBounds(170,250,50,20); 
  b3.setBackground(Color.yellow);  
  b4.setBounds(230,250,50,20); 
  b4.setBackground(Color.yellow);  
 
//adding to frame 
f.add(l1); 
f.add(t1);
f.add(l2); 
f.add(l3); 
 
f.add(t2); 
f.add(t3); 
 
f.add(b1); 
f.add(b2); 
f.add(b3); 
f.add(b4); 
 
b1.addActionListener(this); 
b2.addActionListener(this); 
b3.addActionListener(this); 
b4.addActionListener(this); 
 
f.setLayout(null); 
f.setVisible(true); 
f.setSize(400,450); 
f.setLocation(500,200); 
f.setBackground(Color.gray); 
 
} 
 
public void actionPerformed(ActionEvent e) 
{ 
    int n1=Integer.parseInt(t1.getText());     
    int n2=Integer.parseInt(t2.getText()); 
 
    if(e.getSource()==b1) 
    { 
    t3.setText(String.valueOf(n1+n2)); 
    } 
 
    if(e.getSource()==b3) 
{ 
    t3.setText(String.valueOf(n1-n2)); 
    } 
 
    if(e.getSource()==b2) 
    { 
    t3.setText(String.valueOf(n1*n2)); 
    } 
 
    if(e.getSource()==b4) 
    { 
    t3.setText(String.valueOf(n1/n2)); 
    } 
} 
 
public static void main(String args[]) 
{ 
new co5_pg5(); 
} 
} 
/*
<applet code="co5_pg5.class" width=500 height=500>
</applet>
*/