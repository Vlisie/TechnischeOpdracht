package elfstedentocht;

import java.util.*;

public class Starthok {
	Scanner sc = new Scanner(System.in);
	Wedstrijdschaatser henk = new Wedstrijdschaatser("Henk", 32);
	Wedstrijdschaatser sjaak = new Wedstrijdschaatser("Sjaak", 22);
	Wedstrijdschaatser bob = new Wedstrijdschaatser("Bob", 42);
	Toerschaatser jaap = new Toerschaatser("Jaap", 27);
	Toerschaatser kees = new Toerschaatser("Kees", 67);
	Toerschaatser karla = new Toerschaatser("Karla", 47);
	Cameraman mart = new Cameraman(5);
	
	
int starten(int nWedstrijdschaatsers, int nToerschaatsers){
	System.out.println("Welkom bij de Elfstedentocht.");
	System.out.println("U kunt kiezen wat er gaat gebeuren.\nToets a om de uitzending te starten.\nToets s om het startschot te geven en de tijd te laten lopen.\nToets d om informatie over een schaatser op te vragen.\nToets f om de tocht te verlaten.\nVoer in:");
	char c = sc.next().charAt(0);
	switch(c) {
			case 'a':
				startUitzending();
			case 's':
				tijdLatenLopen();
			case 'd':
			
			case 'f':	
	
	
	
	
	
	}
	startUitzending();
	int nTotaalschaatsers = nWedstrijdschaatsers + nToerschaatsers; 
	return nTotaalschaatsers;
}

void startUitzending() {
	
}
void tijdLatenLopen() {
	
}
void welkeSchaatser() {
	
}
}
