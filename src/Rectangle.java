
public class Rectangle extends Quadrilatere {

	public Rectangle() {
		this.tab_mem = new Point[2];
	}
	
	public int nbClics(){
		return 2;
	}

	public void transformation(int dx, int dy, int indice){
		this.tab_mem[indice]= new Point(dx,dy);
	}
	
	public void modifierPoints(Point[] tab_saisie){
		this.tab_mem = tab_saisie;
	}
}
