/**
 * 
 * @author Benjamin
 *
 */
import java.awt.*;
import javax.swing.*;

public abstract class Polygone extends FigureColoree{

	private java.awt.Polygon p ;
	
	public Polygone() {
		
	}
	
	public void affiche(java.awt.Graphics g){
		g.drawPolygon(p);
	}
	
	public boolean estDedans(int x, int y){
		return false;
	}
	
	public int nbClics(){
		return p.npoints;
	}
	
	public void modifierPoints(Point[] tab_saisie){
		this.tab_mem = tab_saisie;
	}
 
}
