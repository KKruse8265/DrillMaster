package restaurant.training.basis;

import java.util.ArrayList;
import java.util.HashMap;

import de.cokuss.chris.Todos;

public class Rezept {
	private String name;
	//besser w�re List<String> zubereitung= new ArrayList<>();
	private ArrayList<String> zubereitung;
	//Map<Zutat,Double> bestandteil= new HashMap<>();
	//HashMap akzeptiert auch null-Werte 
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
