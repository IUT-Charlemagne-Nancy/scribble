/**
 * 
 * @author Benjamin
 *
 */
public class Point {
	private int x;
	private int y;

	/**
	 * Constructeur du Point
	 * @param x1 position x
	 * @param y1 position y
	 */
	public Point(int x1, int y1) {
		this.x = x1;
		this.y = y1;
	}

	/**
	 * Methode qui permet de connaitre une distance
	 * @param p Point auquel on veut connaitre la distance avec notre point
	 * @return distance entre les deux pointd
	 */
	public double distance(Point p) {
		double distance = Math.abs(Math.sqrt(Math.pow(p.rendreX() - this.x, 2)
				+ (Math.pow(p.rendreY() - this.y, 2))));
		return distance;
	}

	/**
	 * Methode qui permet de connaitre la position du point
	 * @return la position x du point
	 */
	public int rendreX() {
		return this.x;
	}

	/**
	 * Methode qui permet de connaitre la position du point
	 * @returnpoisition y du point
	 */
	public int rendreY() {
		return this.y;
	}

	/**
	 * Methode qui augmente le position du point
	 * @param nb nombre auquel on veut ajouter a la position
	 */
	public void incrementerX(int nb) {
		if (this.x + nb < 0) {
			this.x = 0;
		} else {
			this.x = this.x + nb;
		}
	}

	/**
	 * Methode qui augmente le position du point
	 * @param nb nombre auquel on veut ajouter a la position
	 */
	public void incrementerY(int nb) {
		if (this.y + nb < 0) {
			this.y = 0;
		} else {
			this.y = this.x + nb;
		}
	}

	/**
	 * Methode qui modifie le position du point
	 * @param nb nouvelle position
	 */
	public void modifierX(int nb) {
		this.x = nb;
	}

	/**
	 * Methode qui modifie le position du point
	 * @param nb nouvelle position
	 */
	public void modifierY(int nb) {
		this.y = nb;
	}

	/**
	 * Methode pour modifier la position du point
	 * @param x1 nombre a ajouter
	 * @param y1 nombre a ajouter
	 */
	public void translation(int x1, int y1) {
		this.incrementerX(x1);
		this.incrementerY(y1);
	}
}
