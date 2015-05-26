
public class Rectangle extends Quadrilatere {

	public Rectangle() {
		this.tab_mem = new Point[2];
		Point p1 = new Point( ((int)Math.random()*100)-1,((int)Math.random()*100)-1);
		Point p2 = new Point( ((int)Math.random()*100)-1,((int)Math.random()*100)-1);
		Point[] tab_saisie = {p1,p2};
		this.modifierPoints(tab_saisie);
		
	}
	
	public int nbClics(){
		return 2;
	}

	public void transformation(int dx, int dy, int indice){
		this.tab_mem[indice]= new Point(dx,dy);
	}
	
	public void modifierPoints(Point[] tab_saisie){
		Point p1 = tab_saisie[0];
		Point p2 = tab_saisie[1];
		Point p4 = new Point(p1.rendreX(), p2.rendreY());
		Point p3 = new Point(p2.rendreX(), p1.rendreY());
		Point[] tab = {p1,p3,p2,p4};
		this.tab_mem = tab;
	}
}
