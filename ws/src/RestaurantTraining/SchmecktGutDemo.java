package RestaurantTraining;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import RestaurantTraining.Basis.Mengeneinheit;
import RestaurantTraining.Basis.Rezept;
import RestaurantTraining.Basis.Zutat;

public class SchmecktGutDemo {

	private static HashMap<String,Rezept> rezepte = new HashMap<String,Rezept>();
	private static HashMap<String,Zutat> zutatenliste = new HashMap<>();
	private static HashMap<Zutat, Double> bestandteil = new HashMap<>();

	public static void main(String[] args) {
		/*
		 * Dieses Programm dient dem Erlernen von Java. Eine Praxisrelevanz ist
		 * nicht beabsichtigt. Im imaginüren Restaurant "Schmeckt Gut" sollen
		 * die üblichen Abläufe informationstechnisch dargestellt werden.
		 * 
		 * Jeder kennt aus eigener Erfahrung einen Restaurantbesuch und was da
		 * so passiert. Natürlich ist es in der Realität schwachsinnig einen
		 * Gast erst instanzieren zu müssen, bevor man ihn zur Kenntnis nimmt,
		 * aber wie gesagt Realitüt oder Computerunterstützung eines reellen
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
		createZutaten();
		createRezepte();
		for(String rezeptName:rezepte.keySet()) {
			System.out.println(rezepte.get(rezeptName));
		}

	}

	private static void createZutaten() {
		Zutat tmpZutat = new Zutat("Kartoffeln", Mengeneinheit.Kilogramm, 0.60);
		zutatenliste.put(tmpZutat.getName(),tmpZutat);
		tmpZutat = new Zutat("Schnitzel", Mengeneinheit.Kilogramm, 4.60);
		zutatenliste.put(tmpZutat.getName(),tmpZutat);
		tmpZutat = new Zutat("Rosenkohl", Mengeneinheit.Kilogramm, 2.30);
		zutatenliste.put(tmpZutat.getName(),tmpZutat);
	
	}

	private static void createRezepte() {
		Rezept rezept = null;
		ArrayList<String> zubereitung = new ArrayList<>();
		HashMap<Zutat, Double> bestandteile = new HashMap<>();
		
		bestandteile.put(zutatenliste.get("Kartoffeln"), 1.5);
		zubereitung.add("Alles klein machen");
		zubereitung.add("Drei Tage kräftig kochen lassen");
		
		rezept = new Rezept("Kartoffelsuppe" ,zubereitung, bestandteile );
		rezepte.put(rezept.getName(), rezept);
		
		bestandteile.put(zutatenliste.get("Kartoffeln"), 0.3);
		bestandteile.put(zutatenliste.get("Schnitzel"), 0.5);
		bestandteile.put(zutatenliste.get("Rosenkohl"), 0.2);
		zubereitung.add("Schnitzel braten");
		zubereitung.add("Kartoffeln kochen");
		zubereitung.add("Rosenkohl verkohlen lassen");
		
		rezept = new Rezept("Schnitzel mit Kartoffenl und Rosenkohl" ,zubereitung, bestandteile );
		rezepte.put(rezept.getName(), rezept);
		
	}

}
