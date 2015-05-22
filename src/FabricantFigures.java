import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.SwingUtilities;


public class FabricantFigures extends java.lang.Object implements java.awt.event.MouseListener {

	/**
	 * Figure en cours de fabrication
	 */
	private FigureColoree figure_en_cours_de_fabrication;
	
	/**
	 * Accumule le nombre de cliques de souris
	 */
	private int nb_points_cliques;
	
	/**
	 * Tableau contenant des points crées à partir de clics de souris
	 */
	private Point[] points_cliques;
	
	
	public FabricantFigures(FigureColoree fc){
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

		public void mousePressed(MouseEvent e) {
			Point p = new Point(e.getX(),e.getY());
			points_cliques[nb_points_cliques] = p;
			;
			nb_points_cliques = nb_points_cliques + 1;
			System.out.println(nb_points_cliques);
		}

		public void mouseReleased(MouseEvent e) {
		}
		
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
