import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


public class DessinFigures extends JPanel  {
	
	private int lastX;
	private int lastY;

	protected Color couleur;
	
/**
 * Tableau pouvant contenir jusqu'à 100 figures à visualiser et manipuler	
 */
	FigureColoree[] figures;
	
/**
 * Objet "listener" pour les manipulations et transformations de figures via la souris	
 */

	private ManipulateurFormes mf;	
	
/**
 * Nombre effectif de figures apparaissant dans ce dessin	
 */
	private int nbf;
	
/**
 * Indice de la figure actuellement selectionnée (-1 si aucune figure selectionnee)	
 */
	private int sel;
	
	
/**
 * Constructeur vide : dessin ne contenant aucune figure
 */
public DessinFigures() {
	super();
	this.figures = new FigureColoree[100];
	this.nbf = 0;
	this.sel = -1;
}

/**
 * Methode activant les manipulations des formes geometriques à la souris
 */
public void activeManipulationsSouris(){
	
}



/**
 * Cette methode permet d'ajouter une nouvelle figure au dessin
 * @param fc- figure à ajouter au dessin
 */
public void ajoute(FigureColoree fc) {
	int i = 0;
	while(this.figures[i] != null){
		i = i + 1;
	}
	this.figures[i] = fc;
	this.nbf = this.nbf + 1;
}

/**
 * Cette methode permet d'initier le mecanisme evenementiel de fabrication des figures à la souris (ajout du listener)
 * @param fc -forme à construire point par point à la souris
 */
public void construit(FigureColoree fc){
	FabricantFigures fabricant = new FabricantFigures(fc);
	this.addMouseListener(fabricant);
}

/**
 * Methode desactivant les manipulations des formes geometriques a la souris
 */
public void desactiveManipulationsSouris(){
	
}

/**
 * Cette methode retourne la figure actuellement selectionne
 * @param figure selectionne (ou null si aucune figure n'est pas selectionne)
 */
public FigureColoree figureSelection(){
	if (sel ==-1) {
		return null;
	}
	return this.figures[sel];
}

/**
 * Cette methode retourne le nombre de figures apparaissant dans ce dessin
 * @return nombre de figures sur le dessin
 */
public int nbFigures(){
	return nbf;
}

/**
 * Cette methode selectionne la prochaine figure dans le tableau des figures.
 */
public void selectionProchaineFigure(){
	this.sel = this.sel + 1;
	
}

public void supprimeAuditeurs(){
	
}

/**
 * Cette methode permet d'initier le mecanisme evenementiel de trace quelconque a la souris (definition de la couleur du trace et ajout des listeners)
 * @param c - couleur du trait
 */
public void Trace(Color couleur) {
	this.couleur = couleur;
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
	for(int i = 0;i<nbf;i++){
		figures[i].affiche(g);
	} 
}

public void dessiner(Graphics g,MouseEvent e){
	g.setColor(getCouleur());
	g.drawLine(lastX, lastY, e.getX(), e.getY());
}

public void setCouleur(Color a) {
	this.couleur = a;
	
}

public Color getCouleur() {
	return this.couleur;
}


public class ManipulateurFormes extends java.lang.Object implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener {

	private int indice;
	
	private int last_x;
	
	private int last_y;
	
	private boolean trans;

	@Override
	public void mouseDragged(MouseEvent e) {
	
		setLastX(e.getX());
		setLastY(e.getY());
		this.trans = true;
		figures[0].translation(e.getX(),e.getY());
		}

	@Override
	public void mouseMoved(MouseEvent e) {

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
	
		figures[0].selectionne();
	
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


	public int getLastX() {
		return last_x;
	}

	public void setLastX(int last_x) {
		this.last_x = last_x;
	}

	public int getLastY() {
		return last_y;
	}

	public void setLastY(int last_y) {
		this.last_y = last_y;
	}
}


}