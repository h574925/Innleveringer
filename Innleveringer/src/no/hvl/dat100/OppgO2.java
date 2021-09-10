package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class OppgO2 {

	public static void main(String[] args) {
	
		
		final int ANT_STUDENTER = 10;
		int studenter;
		
		for (studenter = 1; studenter <= ANT_STUDENTER; studenter++) {
		
		
		 
			String poengSum = showInputDialog("Din poengsum? ");
			int poeng = Integer.parseInt(poengSum);
			
		
		
			if (poeng >= 90 && poeng <= 100) {
			showMessageDialog(null, "Karakter: A");
			
		}
			
		
			else if (poeng >= 0 && poeng <= 39) {
			showMessageDialog(null, "Karakter: F");
		}
		
			else if ( poeng >= 40 && poeng <= 49) {
			showMessageDialog(null, "Karakter: E");
		}
		
			else if (poeng >= 50 && poeng <= 59) {
			showMessageDialog(null, "Karakter: D");
		}
		
			else if (poeng >= 60 && poeng <= 79) {
			showMessageDialog(null, "Karakter: C");
		}
		
			else if (poeng >= 80 && poeng <= 89) {
			showMessageDialog(null, "Karakter: B");
		}
		
			else if (poeng <= 0 || poeng >= 100) {
			showMessageDialog(null, "Ugyldig poengsum");  
			showMessageDialog(null, "Prøv igjen! ");
			
		
		
		

			}
		}
	}

	}


