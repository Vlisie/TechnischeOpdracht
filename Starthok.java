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
	Cameraman mart = new Cameraman(15,69);
	
		
String starten() throws Exception{
	System.out.println("Welkom bij de Elfstedentocht.");
	System.out.println("U kunt kiezen wat er gaat gebeuren.\nToets a om de uitzending te starten.\nToets s om te kijken in welke stad de schaatsers zich bevinden\nToets d om informatie over een schaatser op te vragen.\nToets f om de tocht te verlaten.\nVoer in:");
	boolean lekkerdoorgaan = true;
	while(lekkerdoorgaan == true) {
	char c = sc.next().charAt(0);
	switch(c) {
			case 'a':
				mart.startUitzending();
				System.out.println("De uitzending is bezig");
				break;
			case 's':
				System.out.println("Toets een getal om te zien waar de schaatsers zich bevinden.");
				int x = sc.nextInt();
				if(x>10) {
					throw new nietbekendException();}
				System.out.println("De elfstedentocht is van start gegaan.\nWe zijn onderweg naar "+ Route.elfsteden[x]);
			case 'd':
				break;
			case 'f':	
				System.out.println("U verlaat de Elfstedentocht tot over 30 jaar (hopelijk)");
				lekkerdoorgaan = false;
				break;
			default:
				System.out.println("foute input");			
	}
	}
	return "gestart";
}

void welkeSchaatser() {
	
}
}
class nietbekendException extends Exception{}
