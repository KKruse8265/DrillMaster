package restaurant.training.basis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import de.cokuss.chris.Todos;

public class Rezept {
	private String name;
	private List<String> zubereitung= new ArrayList<>();
	private Map<Zutat,Double> bestandteil= new HashMap<>();

	public Rezept(String name, ArrayList<String> zubereitung, HashMap<Zutat, Double> bestandteil) {
		this.name = name;
		this.zubereitung = zubereitung;
		this.bestandteil = bestandteil;
	}
	

	public Rezept(String name) {
		this.name = name;
	}


	public boolean addZubereitung(String nanNehme) {
		return zubereitung.add(nanNehme);
	}

	public Double addBestandteil(Zutat key, Double value) {
		return bestandteil.put(key, value);
	}

	public String getName() {
		return name;
	}

	public String toString() {
		String result = name + "/n";
		for(Zutat zutat: bestandteil.keySet()) {
			result = result + zutat.getName() + " : ";
			result = result + bestandteil.get(zutat).doubleValue();
			result = result + zutat.getMengeneinheit() + "/n";
		}
		return result;
	}
	public List<String> getZubereitung() {
		return zubereitung;
	}

	public Map<Zutat, Double> getZutaten() {
		return bestandteil;
	}

	
}
