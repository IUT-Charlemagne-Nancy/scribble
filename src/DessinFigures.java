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
public void Trace() {
	
	
}

public void paintComponent(Graphics g){
	super.paintComponent(g);
	for(int i = 0;i<nbf;i++){
		figures[i].affiche(g);
	} 
}

public void setCouleur(Color a) {
	this.couleur = a;
	
}

public Color getCouleur() {
	return this.couleur;
}


}