package restaurant.training;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import restaurant.training.basis.Gericht;
import restaurant.training.basis.Kategorie;
import restaurant.training.basis.Mengeneinheit;
import restaurant.training.basis.Rezept;
import restaurant.training.basis.Speisekarte;
import restaurant.training.basis.Tisch;
import restaurant.training.basis.Zutat;

public class SchmecktGutDemo {

	private static Map<String, Rezept> rezepte = new HashMap<String, Rezept>();
	private static Map<String, Zutat> zutatenliste = new HashMap<>();
	private static Map<Integer, Tisch> tischMap = new HashMap<>();
	private static Speisekarte speisekarte;
	private static Set<Gericht> gerichte = new TreeSet<>();

	public static void main(String[] args) {
		/*
		 * Dieses Programm dient dem Erlernen von Java. Eine Praxisrelevanz ist
		 * nicht beabsichtigt. Im imaginären Restaurant "Schmeckt Gut" sollen
		 * die üblichen Abläufe informationstechnisch dargestellt werden.
		 * 
		 * Jeder kennt aus eigener Erfahrung einen Restaurantbesuch und was da
		 * so passiert. Natürlich ist es in der Realität schwachsinnig einen
		 * Gast erst instanzieren zu müssen, bevor man ihn zur Kenntnis nimmt,
		 * aber wie gesagt Realität oder Computerunterstützung eines reellen
		 * Restaurants ist auch nicht das Ziel-
		 * 
		 */
		// im Restaurant gibt es eine Anzahl von Tischen
		// jeder Tisch hat eine bestimmte Anzahl von Plätzen
		// jeder Tisch hat eine Nummer mit der er eindeutig gekennzeichnet ist
		// ein Tisch kann für eine bestimmte Zeit reserviert sein

		// Im restaurant arbeiten ein Wirt, der die Getränke zapft

		// Im Restaurant arbeiten Kellner, die die Bestellung der Gäste
		// aufnehmen
		// die Bestellung an die Küche oder den Wirt weitergeben und
		// die gewünschten Gerichte/Getränke an den richtigen Tisch/Gast bringen
		// außerdem kassieren sie ab.

		// es gibt eine Speisekarte in der alle bestellbaren Gerichte aufgeführt
		// sind

		// die Gäste wählen die Gerichte aus,
		// Gäste können tische reservieren

		// die Küche bereiten an Hand der Bestellung die Gerichte zu

		// jedes Gericht hat Zutaten die im Rezept stehen

		// am Ende des Tages, wrd aus den verbrauchten Zutaten eine
		// Einkaufsliste für den Wirt generiert

		// Tische mit einer Liste von Plätzen erzeugen
		createTische(new byte[] { 3, 4, 4, 6, 4, 4, 5, 5, 2 });
		createZutaten();
		createRezepte();
		createSpeiseKarte();
		showKochbuch();
		showResturantBelegung();

	}

	private static void createSpeiseKarte() {
		gerichte.add(new Gericht("Kartoffelsuppe", rezepte.get("Kartoffelsuppe"), 9.90f, Kategorie.Hauptgang));
		gerichte.add(new Gericht("Schnitzel mit Kartoffeln und Rosenkohl",
				rezepte.get("Schnitzel mit Kartoffeln und Rosenkohl"), 19.90f, Kategorie.Hauptgang));
	}

	private static void showResturantBelegung() {
		for (int i = 1; i <= tischMap.size(); i++) {
			System.out.println(tischMap.get(i).toString());
		}
	}

	private static void showKochbuch() {
		System.out.println("Unser Kochbuch");
		for (String rezeptName : rezepte.keySet()) {
			Rezept rezept = rezepte.get(rezeptName);
			System.out.println("\t" + rezept.getName());
			for (Zutat t : rezept.getZutaten().keySet()) {
				System.out.println("\t\t" + t.getName());
			}
		}
	}

	private static void createTische(byte[] integers) {
		for (int i = 0; i < integers.length; i++) {
			tischMap.put(i + 1, new Tisch(i + 1, integers[i]));
		}
	}

	private static void createZutaten() {
		Zutat tmpZutat = new Zutat("Kartoffeln", Mengeneinheit.Kilogramm, 0.60);
		zutatenliste.put(tmpZutat.getName(), tmpZutat);
		tmpZutat = new Zutat("Schnitzel", Mengeneinheit.Kilogramm, 4.60);
		zutatenliste.put(tmpZutat.getName(), tmpZutat);
		tmpZutat = new Zutat("Rosenkohl", Mengeneinheit.Kilogramm, 2.30);
		zutatenliste.put(tmpZutat.getName(), tmpZutat);

	}

	private static void createRezepte() {
		Rezept rezept = null;
		ArrayList<String> zubereitung = new ArrayList<>();
		HashMap<Zutat, Double> bestandteile = new HashMap<>();

		bestandteile.put(zutatenliste.get("Kartoffeln"), 1.5);
		zubereitung.add("Alles klein machen");
		zubereitung.add("Drei Tage kräftig kochen lassen");

		rezept = new Rezept("Kartoffelsuppe", zubereitung, bestandteile);
		rezepte.put(rezept.getName(), rezept);
		zubereitung.clear();
		bestandteile.clear();

		bestandteile.put(zutatenliste.get("Kartoffeln"), 0.3);
		bestandteile.put(zutatenliste.get("Schnitzel"), 0.5);
		bestandteile.put(zutatenliste.get("Rosenkohl"), 0.2);
		zubereitung.add("Schnitzel braten");
		zubereitung.add("Kartoffeln kochen");
		zubereitung.add("Rosenkohl verkohlen lassen");

		rezept = new Rezept("Schnitzel mit Kartoffeln und Rosenkohl", zubereitung, bestandteile);
		rezepte.put(rezept.getName(), rezept);
		zubereitung.clear();
		bestandteile.clear();
	}

}
