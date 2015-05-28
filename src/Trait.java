import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.SwingUtilities;


import javax.swing.SwingUtilities;


public class Trait extends java.lang.Object implements java.awt.event.MouseListener,MouseMotionListener {
	
	private int lastX;
	private int lastY;
	
	
	public Trait(){
		final MouseMotionListener mml=new MouseMotionListener(){
			
			public void mouseMoved(MouseEvent e) {
				lastX=e.getX();
				lastY=e.getY();
			}

			public void mouseDragged(MouseEvent e) {
				lastX=e.getX();
				lastY=e.getY();
			}
			
		};
		MouseListener ml=new MouseListener(){

			public void mouseClicked(MouseEvent e) {
				if (SwingUtilities.isRightMouseButton(e)){
				}
				if (SwingUtilities.isMiddleMouseButton(e)){
				}
			}

			public void mouseEntered(MouseEvent e) {
			}

			public void mouseExited(MouseEvent e) {
			}

			public void mousePressed(MouseEvent e) {
			}

			public void mouseReleased(MouseEvent e) {
			}
			
		};
	}


	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}

