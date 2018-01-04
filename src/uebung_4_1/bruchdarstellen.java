package uebung_4_1;

public class bruchdarstellen {

public static void bruchdarsteller (double zaehler, double nenner)	{
	
	double zaehlern=zaehler;
	double nennern=nenner;
	double ergebnis=zaehlern/nennern;
	
	System.out.println(zaehler);
	System.out.println("----------------------- = "+ergebnis);
	System.out.println(nenner);
}

public static void main(String[] args) {
	bruchdarsteller(4,5);
	bruchdarsteller(6,7);
	bruchdarsteller(1,3);
	System.out.println("Goldener Schnitt berechnen:");
	GoldenerSchnitt(1,1,100);
}
public static void GoldenerSchnitt(double nenner, double zaehler, int x) {
	
	for(int i =0; i < x; i++) {
	double nennerNeu=zaehler+nenner;
	double zaehlerNeu=nenner;
	bruchdarsteller(nennerNeu, zaehlerNeu);
	nenner=nennerNeu;
	zaehler=zaehlerNeu;
	}
}
}
