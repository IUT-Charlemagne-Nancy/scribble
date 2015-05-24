import java.awt.event.MouseEvent;


public class ManipulateurFormes extends java.lang.Object implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener {

	private int indice;
	
	private int last_x;
	
	private int last_y;
	
	private boolean trans;
	
	private DessinFigures a;

	@Override
	public void mouseDragged(MouseEvent e) {
	
		setLastX(e.getX());
		setLastY(e.getY());
		this.trans = true;
		a.figures[0].translation(e.getX(),e.getY());
		}

	@Override
	public void mouseMoved(MouseEvent e) {

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
	
		a.figures[0].selectionne();
	
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


	public int getLastX() {
		return last_x;
	}

	public void setLastX(int last_x) {
		this.last_x = last_x;
	}

	public int getLastY() {
		return last_y;
	}

	public void setLastY(int last_y) {
		this.last_y = last_y;
	}
}

	

