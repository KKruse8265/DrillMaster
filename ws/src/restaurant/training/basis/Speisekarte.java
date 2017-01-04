package restaurant.training.basis;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Speisekarte {
	private Set<Gericht> speisekarte = new TreeSet<>();

	public boolean add(Gericht e) {
		return speisekarte.add(e);
	}

	public int size() {
		return speisekarte.size();
	}

	public Speisekarte(TreeSet<Gericht> speisekarte) {
		this.speisekarte = speisekarte;
	}
	public Speisekarte(){
		
	}

	public String toString() {
		String result = "";
		String resultGetraenke = "";
		String resultVor = "";
		String resultNach = "";
		String resultHaupt = "";
		Gericht gericht;
		Iterator<Gericht> gerichte = speisekarte.iterator();
		while (gerichte.hasNext()) {
			gericht = gerichte.next();
			switch (gericht.getKategorie()) {
			case Getraenk:
				resultGetraenke += gericht.toString() + "/n";
				break;
			case Hauptgang:
				resultHaupt += gericht.toString() + "/n";
				break;
			case Vorspeise:
				resultVor += gericht.toString() + "/n";
				break;
			case Nachspeise:
				resultNach += gericht.toString() + "/n";
				break;
			default:
				break;
			}
			result = "Getränke /n" + resultGetraenke + "Vorspeise /n" + resultVor + "Hauptgang /n" + resultHaupt
					+ "Nachspeise /n" + resultNach;
		}
		return result;
	}

}
