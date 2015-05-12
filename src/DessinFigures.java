import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;
import javax.swing.SwingUtilities;


public class DessinFigures extends JPanel  {
	private Color couleur;
	private int lastX;
	private int lastY;
	

public DessinFigures() {

		final MouseMotionListener mml=new MouseMotionListener(){
			
			public void mouseMoved(MouseEvent e) {
				lastX=e.getX();
				lastY=e.getY();
			}

			public void mouseDragged(MouseEvent e) {
				Graphics g=getGraphics();
				dessiner(g,e);
				lastX=e.getX();
				lastY=e.getY();
			}
			
		};
		this.addMouseMotionListener(mml);
		MouseListener ml=new MouseListener(){

			public void mouseClicked(MouseEvent e) {
				if (SwingUtilities.isRightMouseButton(e)){
					removeMouseMotionListener(mml);
					repaint();
				}
				if (SwingUtilities.isMiddleMouseButton(e)){
					repaint();
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
		this.addMouseListener(ml);
}

	public void paintComponent(Graphics g){
		super.paintComponent(g);
	}

	public void dessiner(Graphics g,MouseEvent e){
		g.setColor(getCouleur());
		g.drawLine(lastX, lastY, e.getX(), e.getY());
	}
	
	
	public void setCouleur(Color couleur) {
		this.couleur = couleur;
		
	}

	public Color getCouleur() {
		return couleur;
	}

	
	
	
	
	
	
	
	
	
}
