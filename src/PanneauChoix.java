import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JRadioButton;



public class PanneauChoix extends JPanel {
	
	private DessinFigures dessin;
	
	public PanneauChoix(DessinFigures a){
		this.dessin = a;
		final JComboBox c = new JComboBox(new String [] {"noir","vert","bleu","jaune","gris","violet","rose","rouge"});
		c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch (c.getSelectedIndex()) {
				case 0 :	
					a.setCouleur(Color.BLACK) ;
				break;
				case 1 :	
					a.setCouleur(Color.GREEN) ;
				break;
				case 2 :	
					a.setCouleur(Color.BLUE);
				break;
				case 3 :
					a.setCouleur(Color.YELLOW) ;
				break;
				case 4 :
					a.setCouleur(Color.GRAY);
				break;
				case 5 :	
					a.setCouleur(Color.MAGENTA);
				break;
				case 6 :	
					a.setCouleur(Color.PINK);
				break;
				case 7 :	
					a.setCouleur(Color.RED);
				break;
				}
				dessin.setCouleur(a.getCouleur());
			}
		});
		final JRadioButton b1 = new JRadioButton ( "Nouvelle figure" );
		final JRadioButton b2 = new JRadioButton ( "Tracé à main levée" );
		final JRadioButton b3 = new JRadioButton ( "Manipulations" );
		ButtonGroup bg = new ButtonGroup ();
		bg.add(b1);
		bg.add(b2);
		bg.add(b3);
		this.add(c);
		this.add(b1);
		this.add(b2);
		this.add(b3);
		}
	
	public void determineCouleur(int n) {
		
	}
}
