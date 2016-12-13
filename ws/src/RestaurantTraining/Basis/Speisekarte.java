package RestaurantTraining.Basis;

import java.util.Iterator;
import java.util.TreeSet;

public class Speisekarte {

	private TreeSet<Gericht> speisekarte;

	public Speisekarte(TreeSet<Gericht> speisekarte) {
		this.speisekarte = speisekarte;
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
			case Getränk:
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
