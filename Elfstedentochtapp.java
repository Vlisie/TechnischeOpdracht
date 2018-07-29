package elfstedentocht;
/*
 Mijn fantasie is op, ik kan er niks mooiers van maken.
 Veel stelt het niet voor, maar ik kreeg niks verzonnen en kreeg dus ook de gevraagde technsche onderdelen niet verwerkt.
 */
public class Elfstedentochtapp {
	public static void main(String[] args) throws Exception{
		Starthok starthok = new Starthok();
		try {
		starthok.starten();
		}catch(nietbekendException e) {
			System.out.println("Deze stad bestaat niet");
		}
	}
}
