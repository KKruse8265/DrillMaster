package restaurant.training.basis;

import java.util.HashMap;

public class Gericht implements Comparable<Gericht>{
	//Gegen Interface CB gegen welches? Kann weg, oder?
	private String name;
	private Rezept rezept;
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

	public Gericht(String name,  Rezept rezept, float preis, Kategorie kategorie) {
		this.name = name;
		this.rezept = rezept;
		this.preis = preis;
		this.kategorie = kategorie;
	}
	
	public String toString() {
		String result = name + " " + preis;
		return result;
	}

	@Override
	public int compareTo(Gericht o) {
		return name.compareTo(o.name);
	}
	
}
