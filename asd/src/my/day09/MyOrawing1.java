package my.day09;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class MyOrawing1 extends JFrame implements MouseMotionListener{

	int x=50, y =50;
	
	public MyOrawing1() {
		super("MyDrawing1");
		addMouseMotionListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		x =e.getX();
		y =e.getY();
		setTitle("x:" + x + "y:" +y);
		repaint();
		
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillOval(x, y, 10, 10);
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyOrawing1 md1 =new MyOrawing1();
		md1.setSize(500,500);
		md1.setVisible(true);

	}


}
