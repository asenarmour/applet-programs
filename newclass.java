package newApplet;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class newclass extends Applet implements MouseListener,MouseMotionListener{
int x,y;
String event;
public void init() {
addMouseListener(this);
addMouseMotionListener(this);
}
public void paint(Graphics g) {
g.fillOval(x,y,30,30);
//g.drawString("mouse is"+event+"at"+x+" "+y,20,20);
}
public void mousePresssed(MouseEvent e) {
	x=e.getX();
	y=e.getY();
	repaint();
}
public void mouseReleased(MouseEvent e) {
	x=e.getX();
    y=e.getY();
    repaint();
}
public void mouseClicked(MouseEvent e) {
	x=e.getX();
	y=e.getY();
	repaint();
}
public void mouseEntered(MouseEvent e) {
	x=e.getX();
	y=e.getY();
	repaint();
}
public void mouseExited(MouseEvent e) {
	x=e.getX();
	y=e.getY();
	repaint();
}
public void mouseMoved(MouseEvent e) {
	x=e.getX();
	y=e.getY();
	event="Moved";
	repaint();
}
public void mouseDragged(MouseEvent e) {
	x=e.getX();
	y=e.getY();
	event="dragged";
	repaint();
}
public void update(Graphics g) {
	paint(g);
}
}
