package timer;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.util.Timer;
import java.util.TimerTask;
public class myTimer extends Applet
{
Timer t;
int [] ball= {10,10};
int [] ball_vel= {2,5};
int ball_size=30;
int size=200;
int rect_left=5;
int rect_top=5;
int rect_right=rect_left+size;
int rect_bottom=rect_top+size;
public void init() {
	setSize(300,300);
	t =new Timer();
	t.schedule(new TimerTask()
	{
		public void run() 
		{
			bounceBall();
			repaint();
		}
	},0,100);
}
public void bounceBall()
{
	ball[0]+=ball_vel[0];
	ball[1]+=ball_vel[1];
	if((ball[0]<=rect_left)|| (ball[0]>=rect_right-ball_size))
		ball_vel[0]= -ball_vel[0];
	if((ball[1]<=rect_top)|| (ball[1]>=rect_bottom-ball_size))
		ball_vel[1]=-ball_vel[1];
	
		
}
public void paint(Graphics g) 
 {
	g.setColor(Color.black);
    g.drawRect(rect_left, rect_top,size,size);
	g.setColor(Color.MAGENTA);
    g.fillOval(ball[0],ball[1], ball_size,ball_size);
 }
}
