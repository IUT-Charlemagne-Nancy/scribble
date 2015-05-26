import java.awt.Color;
import java.awt.Graphics;

/**
 * 
 * @author Benjamin
 *
 */
public abstract class FigureColoree extends java.lang.Object {
	private static final int TAILLE_CARRE_SELECTION = 50;
	private static final int PERIPHERIE_CARRE_SELECTION = 60;
	private boolean selected;
	protected Color couleur;
	protected Point[] tab_mem;
	
	public FigureColoree(){
		this.couleur= Color.black;
		this.tab_mem = new Point[this.nbPoint()];
		this.selected = false;
	}
	

	
	public abstract int nbPoint();
	public abstract int nbClics();
	public abstract boolean estDedans(int x, int y);
	public abstract void modifierPoints(Point[] tab_saisie);
	
	public void affiche(Graphics g){
		if( this.selected == true){
			g.setColor(Color.gray);
			for (int i = 0; i<tab_mem.length;i++){
				g.fillRect(tab_mem[i].rendreX(), tab_mem[i].rendreY(), 10, 10);
			}
		}
	}
	
	public int carreDeSelection(int x, int y){
		int nb = -1;
		for (int i = 0; i<this.tab_mem.length; i++){
			if (this.tab_mem[i].rendreX()>=x-10 || this.tab_mem[i].rendreX()<=x+10 && this.tab_mem[i].rendreY()>=y-10 || this.tab_mem[i].rendreY()<=y+10 ){
				nb = i;
			}
		}
		return nb;
	}
	public void translation(int x, int y){
		for (int i = 0; i<this.tab_mem.length;i++){
			this.tab_mem[i].translation(x, y);
		}
	}
	
	public void transformation(int x,int y, int numPoint){
		this.tab_mem[numPoint].modifierX(x);
		this.tab_mem[numPoint].modifierY(y);
	}
	
	public void selectionne(){
		this.selected = true;
	}
	
	public void deSelectionner(){
		this.selected = false;
	}
	
	public void changerCouleur(Color c){
		this.couleur = c;
	}
	
	public Color retournerCouleur(){
		return this.couleur;
	}
	
	
}
