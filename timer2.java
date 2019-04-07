package timer;
import java.util.Timer;
import java.util.TimerTask;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class timer2 extends Applet implements MouseListener,MouseMotionListener {
	int [] ball= {10,10};
	int [] mouse= {0,0};
	int [] ball_vel= {2,5};
	int ball_size=30;
	int rect_size=200;
	int rect_left=5;
	int rect_right=rect_left+rect_size;
	int rect_top=5;
	int rect_bottom=rect_top+rect_size;
	Timer t;
	
public void init() {
    addMouseListener(this);
    addMouseMotionListener(this);
	t=new Timer();

t.schedule(new TimerTask(){
	public void run() {
		bounceBall();
		repaint();
	}
},0,100);
}
public void paint(Graphics g) {
	g.setColor(Color.black);
	g.drawRect(rect_left,rect_top,rect_size,rect_size);
	
	g.setColor(Color.magenta);
	g.fillOval(ball[0],ball[1],ball_size,ball_size);
	
	g.setColor(Color.green);
	g.fillRect(mouse[0]-10,mouse[1]-10,30,30);
}
public void bounceBall() {
	ball[0]+=ball_vel[0];
	ball[1]+=ball_vel[1];
	if(ball[0]<=rect_left || ball[0]>=rect_right-ball_size)
		ball_vel[0]= -ball_vel[0];
	if(ball[1]<=rect_top || ball[1]>=rect_bottom-ball_size)
		ball_vel[1]= -ball_vel[1];
}
public void mousePressed(MouseEvent e) {
	
}
public void mouseMoved(MouseEvent e) {
	mouse[0]=e.getX();
	mouse[1]=e.getY();
	repaint();
}
public void mouseDragged(MouseEvent e) {
	
}
public void mouseClicked(MouseEvent e) {
	if(mouse[0]-10>=ball[0]&&mouse[0]-10<=ball[0]+ball_size && mouse[1]-10>=ball[1]&&mouse[1]-10<=ball[1]+ball_size)
		t.cancel();
}
public void mouseEntered(MouseEvent e) {
	
}
public void mouseExited(MouseEvent e) {
	
}
}
