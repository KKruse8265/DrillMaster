package RestaurantTraining.Basis;

import java.util.ArrayList;

public class Rezept {
 private String name;
 private ArrayList<String> zubereitung;
 private ArrayList<Zutat> zutaten;

 
 public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public ArrayList<String> getZubereitung() {
	return zubereitung;
}


public void setZubereitung(ArrayList<String> zubereitung) {
	this.zubereitung = zubereitung;
}


public ArrayList<Zutat> getZutaten() {
	return zutaten;
}


public void setZutaten(ArrayList<Zutat> zutaten) {
	this.zutaten = zutaten;
}


public Rezept(String name, ArrayList<String> zubereitung, ArrayList<Zutat> zutaten) {
	this.name = name;
	this.zubereitung = zubereitung;
	this.zutaten = zutaten;
}
 
 
}
