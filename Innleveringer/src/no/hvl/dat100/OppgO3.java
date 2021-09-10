package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class OppgO3 {

	public static void main(String[] args) {
		
		String nummer = showInputDialog("Nummer: ");
		
		int n = Integer.parseInt(nummer);		
		int faktor = 1;
		
		for (int i = 2; i <= n; i++) {
			
		faktor = faktor * i;
		
		}
		
		showMessageDialog(null, "Fakultet av " + n + " er: " + faktor);
		
	}
	

	}


