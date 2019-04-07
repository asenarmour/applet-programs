package newApplet;
import java.applet.Applet;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class myAnimation extends Applet{
	int x_pos=0;
	int y_pos=400;
	int a=0;
	Timer timer;
	public void init() {
		setSize(400,400);
		timer =new Timer();
		timer.schedule(new TimerTask(){
			public void run() {
				move();
				repaint();
			}
		},0,500);
	}
	public void paint(Graphics g) {
		
	   if(a%2==0) {
		g.setColor(Color.magenta);
		g.fillOval(x_pos,y_pos,30,30);
	   }
	   else {
		   g.setColor(Color.green);
		   g.fillOval(x_pos,y_pos,30,30);
	   }
	   a+=1;
	   }
    public void move() {
    	
    	if(x_pos>=400)
    	{
    		x_pos=0;
    		y_pos=400;
    	}
    	else {
    		x_pos+=30;
        	y_pos-=30;
    	}
    	
    }
    public void update(Graphics g) {
    	paint(g);
    }
}
