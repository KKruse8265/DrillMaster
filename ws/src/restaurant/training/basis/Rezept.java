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

	public String getName() {
		return name;
	}

	public List<String> getZubereitung() {
		return zubereitung;
	}

	public Map<Zutat, Double> getZutaten() {
		return bestandteil;
	}
	public String toString(){
		return name;
	}
	
}
