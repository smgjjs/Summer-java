package my.day09;

import java.awt.MenuItem;
import java.awt.Frame;
import java.awt.PopupMenu;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.*;


public class MouseE extends Frame {
	
	String str = "나를 클릭해보세여";
	int  x =50, y =50;
	PopupMenu pm;
	MenuItem mi1, mi2;
	
	
	public MouseE() {
		super();
		pm =new PopupMenu();
		add(pm);
		
		mi1 = new MenuItem("열기");
		mi2 = new MenuItem("닫기");
		
		pm.add(mi1);
		pm.addSeparator();
		pm.add(mi2);
		
		MyHandler my =new MyHandler();
		addMouseListener(my);
		
		
	}


	class MyHandler implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			setBackground(Color.yellow);
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			setBackground(Color.yellow);
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			setBackground(Color.yellow);
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			setBackground(Color.yellow);
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			setBackground(Color.yellow);
		}
		
		
	}
	
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
			
			System.out.println("Pressed");
			
			x =e.getX();
			y = e.getY();
			setTitle("x:" + x + " Y :"+ y);
			repaint();
			
			
			if(e.getModifiersEx()==(MouseEvent.BUTTON1_DOWN_MASK+MouseEvent.SHIFT_DOWN_MASK))
				pm.show(MouseE.this,x,y);
		}
			
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MouseE me = new MouseE();
		me.setSize(400, 400);
		me.setVisible(true);

	}


}
