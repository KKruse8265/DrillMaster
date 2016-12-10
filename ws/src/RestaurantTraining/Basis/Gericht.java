package RestaurantTraining.Basis;

import java.util.HashMap;

public class Gericht {
	private HashMap<Beruf, Zeitaufwand> arbeitsaufwand;
	private Rezept rezept; // enthält auch die Zutaten

	public Gericht(HashMap<Beruf, Zeitaufwand> arbeitsaufwand, Rezept rezept) {
		this.arbeitsaufwand = arbeitsaufwand;
		this.rezept = rezept;
	}

}
