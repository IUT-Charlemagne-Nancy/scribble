import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Fenetre extends JPanel {

	public static DessinFigures dessin;
	
	public Fenetre(String nom, int x, int y){
	}
	
	public static void main(String args[]) {
		DessinFigures dessin = new DessinFigures();
		dessin.setPreferredSize(new Dimension(400,400));
		PanneauChoix panneau = new PanneauChoix(dessin);
		panneau.setPreferredSize(new Dimension(75,75));
		Fenetre fenetre = new Fenetre("Affiche",400,400);
		fenetre.setLayout(new BorderLayout());
		fenetre.add(panneau, BorderLayout.NORTH);
		fenetre.add(dessin, BorderLayout.SOUTH);
		JFrame vue=new JFrame();
		vue.setContentPane(fenetre);
		vue.pack();
		vue.setVisible(true);
	}
}
