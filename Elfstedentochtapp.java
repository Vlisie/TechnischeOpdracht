package elfstedentocht;

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
