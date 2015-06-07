import java.awt.Color;
import java.awt.Graphics;

/**
 * 
 * @author Benjamin
 *
 */
public abstract class FigureColoree extends java.lang.Object {
	/**
	 * Attribut qui definit la taille des carres de selections
	 */
	private static final int TAILLE_CARRE_SELECTION = 50;

	/**
	 * Attribut qui definit la peripherie des carres de selections
	 */
	private static final int PERIPHERIE_CARRE_SELECTION = 60;

	/**
	 * Attribut privee qui permet de savoir si la figure est selectionee ou non
	 */
	private boolean selected;

	/**
	 * Attribut prrotected qui permet de definir une couleur
	 */
	protected Color couleur;

	/**
	 * Attribut protected qui est une tableau de point
	 */
	protected Point[] tab_mem;

	/**
	 * Constructeur qui definit une FigureColoree
	 */
	public FigureColoree() {
		this.couleur = Color.black;
		this.tab_mem = new Point[this.nbPoint()];
		this.selected = false;
	}

	/**
	 * Methode abstraite qui definit un nombre de points
	 * 
	 * @return un nombre de points
	 */
	public abstract int nbPoint();

	/**
	 * Methode abstraite qui definit un nombre de clics
	 * 
	 * @return un nombre de clics
	 */
	public abstract int nbClics();

	/**
	 * Methode permettant de savoir si le curseur est dans la zone de la figure
	 * 
	 * @param x
	 *            position du curseur
	 * @param y
	 *            position du curseur
	 * @return si le curseur est dedans où non
	 */
	public abstract boolean estDedans(int x, int y);

	/**
	 * Methode qui permet de modifier les points de la figure
	 * 
	 * @param tab_saisie
	 *            tableau de points
	 */
	public abstract void modifierPoints(Point[] tab_saisie);

	/**
	 * Methode qui affiche la figure
	 * 
	 * @param g
	 */
	public void affiche(Graphics g) {
		int[] x = new int[10];
		int[] y = new int[10];
		g.setColor(couleur);
		for (int i = 0; i < tab_mem.length; i++) {
			x[i] = tab_mem[i].rendreX();
			y[i] = tab_mem[i].rendreY();

		}
		g.fillPolygon(x, y, tab_mem.length);
		System.out.println(this.selected);
		if (this.selected == true) {
			g.setColor(Color.red);
			for (int i = 0; i < tab_mem.length; i++) {
				g.fillRect(tab_mem[i].rendreX() - 5, tab_mem[i].rendreY() - 5,
						10, 10);
			}
		}
	}

	/**
	 * Methode qui affiche les carres de selections
	 * 
	 * @param x
	 *            position du carre
	 * @param y
	 *            position du carre
	 * @return carre selectionnee
	 */
	public int carreDeSelection(int x, int y) {
		int nb = -1;
		for (int i = 0; i < this.tab_mem.length; i++) {
			if (this.tab_mem[i].rendreX() >= x - 10
					&& this.tab_mem[i].rendreX() <= x + 10
					&& this.tab_mem[i].rendreY() >= y - 10
					&& this.tab_mem[i].rendreY() <= y + 10) {
				nb = i;
			}
		}
		return nb;
	}

	/**
	 * Methode qui permet de modifier la position de la figure
	 * 
	 * @param x
	 *            nouvelle position
	 * @param y
	 *            nouvelle position
	 */
	public void translation(int x, int y) {
		for (int i = 0; i < this.tab_mem.length; i++) {
			this.tab_mem[i] = new Point(this.tab_mem[i].rendreX() + x,
					this.tab_mem[i].rendreY() + y);
		}
	}

	/**
	 * Methode qui permet de modifier les coordonees d'un seul caree
	 * 
	 * @param x
	 *            nouvelle position
	 * @param y
	 *            nuvelle position
	 * @param numPoint
	 *            carree selectionne
	 */
	public void transformation(int x, int y, int numPoint) {
		this.tab_mem[numPoint].modifierX(x);
		this.tab_mem[numPoint].modifierY(y);
	}

	/**
	 * Methode qui permet de selectionne une figure
	 */
	public void selectionne() {
		this.selected = true;
	}

	/**
	 * Methode qui permet de deselectionne une figure
	 */
	public void deSelectionner() {
		this.selected = false;
	}

	/**
	 * Methode qui permet de changer la couleur
	 * 
	 * @param c
	 *            nouvelle couleur
	 */
	public void changerCouleur(Color c) {
		this.couleur = c;
	}

	/**
	 * Methode qui permet de connaitre la couleur utilisee
	 * 
	 * @return la couleur presente
	 */
	public Color retournerCouleur() {
		return this.couleur;
	}

}
