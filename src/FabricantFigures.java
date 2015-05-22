import java.awt.Graphics;
import java.awt.event.MouseEvent;


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
	
	@Override
	public void mouseClicked(MouseEvent e) {
		Point p = new Point(e.getX(),e.getY());
		this.points_cliques[this.nb_points_cliques] = p;
		;
		this.nb_points_cliques = this.nb_points_cliques + 1;
		Graphics g = null;
		this.figure_en_cours_de_fabrication.affiche(g);
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
