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
		super();
		Point p1 = new Point( ((int)Math.random()*100)-1,((int)Math.random()*100)-1);
		Point p2 = new Point( ((int)Math.random()*100)-1,((int)Math.random()*100)-1);
		Point p3 = new Point( ((int)Math.random()*100)-1,((int)Math.random()*100)-1);
		Point p4 = new Point( ((int)Math.random()*100)-1,((int)Math.random()*100)-1);
		Point[] tab_saisie = {p1,p2,p3,p4};
		this.modifierPoints(tab_saisie);
	}
	
	public void affiche(java.awt.Graphics g){
		int[] x = new int[10];
		int[] y = new int[10];
		
		for (int i = 0 ; i<tab_mem.length ; i++){
			x[i] = tab_mem[i].rendreX();
			y[i] = tab_mem[i].rendreY();
			
		}
		g.fillPolygon(x,y,tab_mem.length);
	}
	
	public boolean estDedans(int x, int y){
		return false;
	}
	
	public int nbClics(){
		return 4;
	}
	
	public void modifierPoints(Point[] tab_saisie){
		this.tab_mem = tab_saisie;
	}
 
}
