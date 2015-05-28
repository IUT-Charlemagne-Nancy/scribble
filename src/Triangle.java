
public class Triangle extends Polygone {

	public Triangle() {
		this.tab_mem = new Point[3];
		Point p1 = new Point( ((int)Math.random()*100)-1,((int)Math.random()*100)-1);
		Point p2 = new Point( ((int)Math.random()*100)-1,((int)Math.random()*100)-1);
		Point p3 = new Point( ((int)Math.random()*100)-1,((int)Math.random()*100)-1);
		Point[] tab_saisie = {p1,p2,p3};
		this.modifierPoints(tab_saisie);
	}

	@Override
	public int nbPoint() {
		return 3;
	}

}
