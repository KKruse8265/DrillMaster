package RestaurantTraining.Basis;

import java.util.ArrayList;
import java.util.HashMap;

import de.cokuss.chris.Todos;

public class Rezept {
	private String name;
	private ArrayList<String> zubereitung;
	private HashMap<Zutat, Double> bestandteil;

	public Rezept(String name, ArrayList<String> zubereitung, HashMap<Zutat, Double> bestandteil) {
		this.name = name;
		this.zubereitung = zubereitung;
		this.bestandteil = bestandteil;
	}

	public String getName() {
		return name;
	}

	public ArrayList<String> getZubereitung() {
		return zubereitung;
	}

	public HashMap<Zutat, Double> getZutaten() {
		return bestandteil;
	}
	public String toString(){
		return name;
	}
	
}
