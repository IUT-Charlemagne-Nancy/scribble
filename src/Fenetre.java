import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Fenetre extends JPanel {

	public static DessinFigures dessin;
	
	public Fenetre(String nom, int x, int y){
	}
	
	public static void main(String args[]) {
		DessinFigures dessin = new DessinFigures();
		PanneauChoix panneau = new PanneauChoix(dessin);
		Fenetre fenetre = new Fenetre("Affiche",400,400);
		fenetre.setLayout(new BorderLayout());
		fenetre.add(panneau, BorderLayout.NORTH);
		fenetre.add(dessin, BorderLayout.CENTER);
		JFrame vue=new JFrame();
		vue.setContentPane(fenetre);
		vue.pack();
	}
}
