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
		p = new Polygon();
		this.modifierPoints(tab_saisie);
	}
	
	
	public boolean estDedans(int x, int y){
		int[] PosX = new int[10];
		int[] PosY = new int[10];
		for (int i = 0 ; i<tab_mem.length ; i++){
			PosX[i] = tab_mem[i].rendreX();
			PosY[i] = tab_mem[i].rendreY();
			
		}
		p = new Polygon(PosX,PosY,tab_mem.length);
		System.out.println(p.contains(x,y));
		return p.contains(x,y);
	}
	
	public int nbClics(){
		return this.nbPoint();
	}
	
	public void modifierPoints(Point[] tab_saisie){
		this.tab_mem = tab_saisie;
	}
 
}
