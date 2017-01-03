package restaurant.training;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import restaurant.training.basis.Gericht;
import restaurant.training.basis.Kategorie;
import restaurant.training.basis.Mengeneinheit;
import restaurant.training.basis.Restaurant;
import restaurant.training.basis.Rezept;
import restaurant.training.basis.Tisch;
import restaurant.training.basis.Zutat;

public class SchmecktGutDemo {

	private static Map<String, Rezept> rezepte = new HashMap<String, Rezept>();
	private static Map<String, Zutat> zutatenliste = new HashMap<>();
	private static Set<Gericht> gerichte = new TreeSet<>();
	private static List<Tisch> tische = new ArrayList<>();

	private static Restaurant unsaNeues;

	public static void main(String[] args) {
		// Allgeimeines zu diesem Programm findest Du im Package-info
		// Erzeuge ein Restaurant
		unsaNeues = new Restaurant("PolkaSchuppen");
		// Tische mit einer Liste von Plätzen erzeugen
		unsaNeues.createTische(new byte[] { 3, 4, 4, 6, 4, 4, 5, 5, 2 });
		// bisschen rumgespielt, es werden Tische für die übergebene
		// Personenzahl belegt
		unsaNeues.belegeTischMit(3);
		unsaNeues.belegeTischMit(3);
		unsaNeues.belegeTischMit(3);
		unsaNeues.belegeTischMit(2);
		unsaNeues.belegeTischMit(4);
		unsaNeues.belegeTischMit(3);
		unsaNeues.belegeTischMit(6);
		unsaNeues.belegeTischMit(3);
		// unsaNeues.belegeTischMit(3); zum besseren Testen mal auskommentiert
		unsaNeues.showBelegung();

		createZutaten();
		createRezepte();
		createGerichte();
		// showKochbuch();

	}

	private static void createZutaten() {
		unsaNeues.addZutat(new Zutat("Kartoffeln", Mengeneinheit.Kilogramm, 0.60));
		unsaNeues.addZutat(new Zutat("Schnitzel", Mengeneinheit.Kilogramm, 4.60));
		unsaNeues.addZutat(new Zutat("Rosenkohl", Mengeneinheit.Kilogramm, 2.30));

	}

	private static void createRezepte() {
		Rezept rezept = new Rezept("Kartoffelsuppe");

		rezept.addBestandteil(zutatenliste.get("Kartoffeln"), 1.5);
		rezept.addZubereitung("Alles klein machen");
		rezept.addZubereitung("Drei Tage kräftig kochen lassen");
		unsaNeues.addRezept(rezept);

		rezept = new Rezept("Schnitzel mit Kartoffeln und Rosenkohl");
		rezept.addBestandteil(zutatenliste.get("Kartoffeln"), 0.3);
		rezept.addBestandteil(zutatenliste.get("Schnitzel"), 0.5);
		rezept.addBestandteil(zutatenliste.get("Rosenkohl"), 0.2);
		rezept.addZubereitung("Schnitzel braten");
		rezept.addZubereitung("Kartoffeln kochen");
		rezept.addZubereitung("Rosenkohl vielleicht besser nicht verkohlen lassen");
		unsaNeues.addRezept(rezept);
	}

	private static void createGerichte() {
		Gericht dsfs = new Gericht("Schnitzel nach Art des abgebrannten Hauses",
				unsaNeues.getRezept("Schnitzel mit Kartoffeln und Rosenkohl"), 19.99f, Kategorie.Hauptgang);
		unsaNeues.addGericht(dsfs);
	}

}
