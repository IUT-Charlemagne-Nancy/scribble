import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.SwingUtilities;

/**
 * 
 * @author Corentin
 *
 */

public class FabricantFigures extends java.lang.Object implements
		java.awt.event.MouseListener {

	/**
	 * Parametre privee representant une position en x
	 */
	public int x;

	/**
	 * Parametre privee representant une position en y
	 */
	public int y;

	/**
	 * Figure en cours de fabrication
	 */
	private FigureColoree figure_en_cours_de_fabrication;

	/**
	 * Accumule le nombre de cliques de souris
	 */
	private int nb_points_cliques;

	/**
	 * Tableau contenant des points cr�es � partir de clics de souris
	 */
	private Point[] points_cliques;

	/**
	 * Constructeur d'un FabricantFigures
	 * @param fc la FigureColoree a cree
	 */
	public FabricantFigures(FigureColoree fc) {
		this.figure_en_cours_de_fabrication = fc;
		this.nb_points_cliques = 0;
		this.points_cliques = fc.tab_mem;
	}

	public void mouseClicked(MouseEvent e) {
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}

	/**
	 * Methode qui lorsqu'on clique avec la souris cree la figure choisie
	 */
	public void mousePressed(MouseEvent e) {
		if (nb_points_cliques < this.figure_en_cours_de_fabrication.nbClics()) {
			x = e.getX();
			y = e.getY();
			Point p = new Point(x, y);
			points_cliques[nb_points_cliques] = p;
			nb_points_cliques = nb_points_cliques + 1;
			System.out.println(nb_points_cliques);
			System.out.println("Position x : " + x + " Position y : " + y);

			if (nb_points_cliques == this.figure_en_cours_de_fabrication
					.nbClics()) {
				this.figure_en_cours_de_fabrication
						.changerCouleur(((DessinFigures) e.getSource()).couleur);
				this.figure_en_cours_de_fabrication
						.modifierPoints(points_cliques);
				((DessinFigures) e.getSource())
						.ajoute(figure_en_cours_de_fabrication);
				((DessinFigures) e.getSource()).selectionProchaineFigure();
				((DessinFigures) e.getSource()).repaint();
				((DessinFigures) e.getSource()).removeMouseListener(this);
			}

		}
	}

	public void mouseReleased(MouseEvent e) {
	}

}
