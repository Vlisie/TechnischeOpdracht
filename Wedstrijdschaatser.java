package elfstedentocht;

public class Wedstrijdschaatser implements KrijgtSalaris {
	int leeftijd;
	Wedstrijdschaatser(String naam, int leeftijd){
	this.leeftijd = leeftijd;
	}
	void controleleeftijd(Wedstrijdschaatser w) throws Exception{
		if(w.leeftijd>40) {
			throw new TeOudException();
		}
	}
}
class TeOudException extends Exception{}