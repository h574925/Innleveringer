package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class OppgO1 {

	public static void main(String[] args) {
		

	
	String bruttoInntekt = showInputDialog("Bruttoinntekt: ");
	String utTxt = "Totalt utregnet trinnskatt er:" + " ";
	int lønn = Integer.parseInt(bruttoInntekt);
	
	
	// skattetrinn
	double trinn0 = 0;
	double trinn1 = 0.017;
	double trinn2 = 0.041; 
	double trinn3 = 0.132;
	double trinn4 = 0.162;
	
	
	if (lønn <= 184800)  {
		showMessageDialog(null, utTxt + lønn * trinn0  + " kr.");
	}
	
	else if (lønn <= 260100 && lønn >= 184801) { 
		showMessageDialog(null, utTxt + lønn * trinn1 + " kr.");
		
	}
	else if (lønn <= 651250 && lønn >= 260101) {
		showMessageDialog(null, utTxt + lønn * trinn2 + " kr.");
		
	}
	else if (lønn <= 1021550 && lønn >= 651251) {
		showMessageDialog(null, utTxt + lønn * trinn3 + " kr.");
		
	
	}
	else if (lønn > 1021550) {
		showMessageDialog(null, utTxt + lønn * trinn4 + " kr.");
		
	}
	
	

}

}



