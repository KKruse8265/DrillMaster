package RestaurantTraining.Basis;

import java.util.ArrayList;
import RestaurantTraining.Basis.Gericht;

public class Bestellung {
	private Tisch tisch;
	private ArrayList<Gericht> gericht;

	public Bestellung(Tisch tisch, ArrayList<Gericht> gericht) {
		super();
		this.tisch = tisch;
		this.gericht = gericht;
	}
}
