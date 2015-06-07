/**
 * 
 * @author Corentin
 *
 */
public class Quadrilatere extends Polygone {

	/**
	 * Constructeur d'un Quadrilatere
	 */
	public Quadrilatere() {
		super();
	}

	/**
	 * Methode abstraite qui definit un nombre de points
	 * 
	 * @return un nombre de points
	 */
	@Override
	public int nbPoint() {
		return 4;
	}

}
