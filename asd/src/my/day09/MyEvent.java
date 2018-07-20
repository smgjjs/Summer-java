package my.day09;


import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class MyEvent extends JFrame implements ActionListenner {

	JButton red, green, blue;
	
	public MyEvent() {
		red =new JButton("RED");
		green =new JButton("GREEN");
		blue =new JButton("BLUE");
		
		add(red,BorderLayout.EAST);
		
		
	}
	
	
	
	public void actionPerformed(ActionEvent e) {
		
		String str = e.getActionCommand();
		
		if(str.squals("RED")) {
			
		}
		
		
	}
	
}
