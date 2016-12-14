package RestaurantTraining.Basis;

import java.util.HashMap;

public class Gericht {
	private HashMap<Beruf, Zeitaufwand> arbeitsaufwand;
	private String name;
	private Rezept rezept;
	//float ist mit Kanonen auf Spa�en geschossen: double reicht hier aus
	private float preis;
	private Kategorie kategorie;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPreis() {
		return preis;
	}

	public void setPreis(float preis) {
		this.preis = preis;
	}

	public void setKategorie(Kategorie kategorie) {
		this.kategorie = kategorie;
	}

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
