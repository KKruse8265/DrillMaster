package RestaurantTraining.Basis;

import java.util.HashMap;

public class Gericht {
	private HashMap<Beruf, Zeitaufwand> arbeitsaufwand;
	private Rezept rezept; // enthält auch die Zutaten
	private float preis;

	public Gericht(HashMap<Beruf, Zeitaufwand> arbeitsaufwand, Rezept rezept, float preis) {
		this.arbeitsaufwand = arbeitsaufwand;
		this.rezept = rezept;
		this.preis = preis;
	}
}
