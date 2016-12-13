package RestaurantTraining.Basis;

import java.util.ArrayList;
import java.util.HashMap;

public class Rezept {
	private String name;
	private ArrayList<String> zubereitung;
	private HashMap<Zutat, Double> zutaten;

	public Rezept(String name, ArrayList<String> zubereitung, HashMap<Zutat, Double> zutaten) {
		super();
		this.name = name;
		this.zubereitung = zubereitung;
		this.zutaten = zutaten;
	}

	public String getName() {
		return name;
	}

	public ArrayList<String> getZubereitung() {
		return zubereitung;
	}

	public HashMap<Zutat, Double> getZutaten() {
		return zutaten;
	}

	
}
