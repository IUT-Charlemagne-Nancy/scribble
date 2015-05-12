/**
 * 
 * @author Benjamin
 *
 */
public class Point {
	private int x;
	private int y;
	
	public Point(int x1, int y1){
		this.x = x1;
		this.y = y1;
	}
	
	public double distance(Point p){
		double distance = Math.abs(Math.sqrt(Math.pow(p.rendreX()-this.x, 2)+(Math.pow(p.rendreY()-this.y, 2))));
		return distance;
	}
	
	public int rendreX(){
		return this.x;
	}
	
	public int rendreY(){
		return this.y;
	}
	
	public void incrementerX(int nb){
		if (this.x+nb<0){
			this.x = 0;
		}else{
			this.x=this.x+nb;
		}		
	}
	
	public void incrementerY(int nb){
		if (this.y+nb<0){
			this.y = 0;
		}else{
			this.y=this.x+nb;
		}		
	}
	
	public void modifierX(int nb){
		this.x = nb;
	}
	
	public void modifierY(int nb){
		this.y = nb;
	}
	
	public void translation(int x1, int y1){
		this.incrementerX(x1);
		this.incrementerY(y1);
	}
}
