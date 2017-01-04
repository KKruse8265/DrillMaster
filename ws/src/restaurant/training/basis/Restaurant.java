package restaurant.training.basis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Restaurant {
	private String name;
	private Map<String, Rezept> kochbuch = new HashMap<String, Rezept>();
	private Set<Zutat> lagerbestand = new HashSet<>();
	private Speisekarte speisekarte = new Speisekarte();
	//das Restaurant hat eine Speisekarte braucht eine getSpeisekarte
	//und eine setSpeisekarte
	
	

	public String toString() {
		return speisekarte.toString();
	}

	public Speisekarte getSpeisekarte() {
		return speisekarte;
	}

	public void setSpeisekarte(Speisekarte speisekarte) {
		this.speisekarte = speisekarte;
	}

	private List<Tisch> tische = new ArrayList<>();

	public Restaurant() {
		super();
		// wenn ich JUnit richtig verstehe ist ein parameterloser Konstruktor
		// notwendig
	}

	public Restaurant(String name) {
		super();
		this.name = name;
	}

	public void addZutat(Zutat zutat) {
		lagerbestand.add(zutat);
	}
	
	public String getName() {
		return name;
	}

	public void addRezept(Rezept rezept) {
		kochbuch.put(rezept.getName(), rezept);
	}

	public Rezept getRezept(Object name) {
		return kochbuch.get(name);
	}

	public boolean addGericht(Gericht gericht) {
		return speisekarte.add(gericht);
	}

	public void showKochbuch() {
		System.out.println("Unser Kochbuch");
		for (String rezeptName : kochbuch.keySet()) {
			Rezept rezept = kochbuch.get(rezeptName);
			System.out.println("\t" + rezept.getName());
			for (Zutat t : rezept.getZutaten().keySet()) {
				System.out.println("\t\t" + t.getName());
			}
		}
	}

	public void createTische(byte[] plaetze) {
		for (int i = 0; i < plaetze.length; i++) {
			tische.add(new Tisch(i + 1, plaetze[i]));
		}
	}

	public void belegeTischMit(final int plaetze) {
		// erstmal ohne Datum und Zeit
		List<Tisch> freieTische = new ArrayList<>();
		for (Tisch t : tische) {
			// tolle Idee mit der List und dem Comperator
			// sorum wäre es noch ein bisschen fixer
			if (t.istFrei() && t.getPlaetze() >= plaetze) {

				// am tisch sind genug Plätze vorhanden
				freieTische.add(t);
			}
		}
		if (freieTische.size() == 0) {
			System.out.println("kein Tisch mit genügend Plätzen frei");
		} else {
			Collections.sort(freieTische, new Comparator<Tisch>() {

				@Override
				public int compare(Tisch o1, Tisch o2) {
					// hier wird die Liste freieTische nach der Anzahl der
					// freibleibenden Plätze sortiert
					int result = 0;
					if ((o1.getPlaetze() - plaetze) < (o2.getPlaetze() - plaetze)) {
						result = -1;
					} else {
						if ((o1.getPlaetze() - plaetze) > (o2.getPlaetze() - plaetze)) {
							result = 1;
						}
					}

					return result;
				}
			});
			freieTische.get(0).wirdBelegt();
			System.out.println(freieTische.get(0) + " ist mit " + plaetze + " Plätzen belegt");
		}
	}

	public void showBelegung() {
		for (Tisch t : tische) {
			// Ausgabe der Tischbelegung
			System.out.println(t);
		}
		// for (int i = 1; i <= tischMap.size(); i++) {
		// System.out.println(tischMap.get(i).toString());
		// }
	}

}