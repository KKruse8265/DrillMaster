package RestaurantTraining.Basis;

import java.util.HashMap;

public class Gericht {
	private HashMap<Beruf, Zeitaufwand> arbeitsaufwand;
	private String name;
	private Rezept rezept;
	private float preis;
	private Kategorie kategorie;

	public Kategorie getKategorie() {
		return kategorie;
	}

	public Gericht(String name, HashMap<Beruf, Zeitaufwand> arbeitsaufwand, Rezept rezept, float preis, Kategorie kategorie) {
		this.name = name;
		this.arbeitsaufwand = arbeitsaufwand;
		this.rezept = rezept;
		this.preis = preis;
		this.kategorie = kategorie;
	}
	
	public String toString() {
		String result = name + " " + preis;
		return result;
	}
	
}
