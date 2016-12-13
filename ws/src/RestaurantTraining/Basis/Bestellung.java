package RestaurantTraining.Basis;

import java.util.ArrayList;

public class Bestellung {
	private Tisch tisch;
	private ArrayList<Gericht> gericht;

	public Bestellung(Tisch tisch, ArrayList<Gericht> gericht) {
		super();
		this.tisch = tisch;
		this.gericht = gericht;
	}
}
