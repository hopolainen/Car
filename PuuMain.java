
public class PuuMain {

	public static void main(String[] args) {
		// ohjelmoinnin perusteissa koodit kirjoitettiin tähän
		
		// Luodaan Puu-luokasta olio
		
//		Puu puu1 = new Puu();
//		puu1.ika = 5;
//		puu1.laji = "Kuusi";
//		puu1.tulostaTiedot();
//		
//		System.out.println("==============");
//		
//		Puu puu2 = new Puu();
//		puu2.laji = "Koivu";
//		puu2.ika = 0;
//		puu2.kasva();
//		puu2.kasva();
//		puu2.tulostaTiedot();
//		
		
		
		Puu puu3 = new Puu(200,"Paju");
		//ei enää toimi, koska asetettu private:ksi
		//puu3.ika = -100;
		puu3.kasva();
		puu3.kasva();
		puu3.kasva();
		puu3.kasva();
		puu3.kasva();
		puu3.kasva();

		//puu3.tulostaTiedot();

		if (puu3.getIka()>200)
		{
			System.out.println("Yli 200 vuotta vanha puu");
		}
		else
		{
			System.out.println("Alle 200 vuotta vanha");
		}
	}

} //PuuMainin lopetus

class Puu  {
	
	private int ika;
	private String laji;
	
	
	// Getter-metodi ika-attribuutille
	// Source > Generate Getters and Setters
	public int getIka() {
		return ika;
	}


	// Parametrinen muodostin / konstruktori / constructor
	public Puu(int i, String l)
	{
		ika = i;
		laji = l;
		//tulostaTiedot();
	}
	
	
	public Puu(String l)
	{
		ika = 5;
		laji = l;
		//tulostaTiedot();
	}
	
	public void kasva()
	{
		ika = ika + 1; // ika++
		System.out.println("Puu on nyt " + ika + " vuotta.");
	}

	public void tulostaTiedot()
	{
		System.out.println("Laji: " + laji);
		System.out.println("Ikä: " + ika);
	}

	
	
}


