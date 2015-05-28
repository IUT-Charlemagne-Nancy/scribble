import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javafx.scene.control.Tab;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;



public class PanneauChoix extends JPanel {
	
	private DessinFigures dessin;
	
	public PanneauChoix(DessinFigures a){
	
		
		final JComboBox c = new JComboBox(new String [] {"noir","vert","bleu","jaune","gris","violet","rose","rouge"});
		c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FigureColoree figure;
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
					a.setCouleur(a.getCouleur());
			}
		});
		
		
		final JComboBox d = new JComboBox(new String [] {"Aucune","Quadrilatere","Rectangle","Triangle"});
		d.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FigureColoree figure;
				switch (d.getSelectedIndex()) {
				case 0 :
					
				break;
				
				case 1 :
					FigureColoree figureA = new Quadrilatere();
					figure = figureA;
					a.construit(figure);
					
				break;
				case 2 :	
					FigureColoree figureB = new Rectangle();
					figure = figureB;
					a.construit(figure);
					
				break;
				case 3 :	
					FigureColoree figureC = new Triangle();
					figure = figureC;
					a.construit(figure);
					
				break;
		
				}
			}
		});
		d.setEnabled(false);
		
		final JRadioButton b1 = new JRadioButton ( "Nouvelle figure" );
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				d.setEnabled(true);
				
			}
		});
		
		final JRadioButton b2 = new JRadioButton ( "Tracé à main levée" );
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				d.setEnabled(false); 
				a.Trace(a.couleur);
			}
		});
		
		final JRadioButton b3 = new JRadioButton ( "Manipulations" );
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				d.setEnabled(false);
				a.activeManipulationsSouris();
			}
		});
		
		ButtonGroup bg = new ButtonGroup ();
		bg.add(b1);
		bg.add(b2);
		bg.add(b3);
		this.add(b1);
		this.add(b2);
		this.add(b3);
		this.add(c);
		this.add(d);
		}
	
	public void determineCouleur(int n) {
		
	}
	
}
