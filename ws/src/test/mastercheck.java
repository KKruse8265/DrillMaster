package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import restaurant.training.basis.Gericht;
import restaurant.training.basis.Kategorie;
import restaurant.training.basis.Mengeneinheit;
import restaurant.training.basis.Rezept;
import restaurant.training.basis.Tisch;
import restaurant.training.basis.Zutat;

public class mastercheck {
	private static Map<String, Rezept> rezepte = new HashMap<String, Rezept>();
	private static Map<String, Zutat> zutatenliste = new HashMap<>();
	private static Set<Gericht> gerichte = new TreeSet<>();
	private static List<Tisch> tische = new ArrayList<>();

	@BeforeClass
	// Alles was wir so annotieren wird einmal vor allem anderen ausgeführt
	public static void setUpBeforeClass() throws Exception {
		createZutaten();
		createRezepte();
		createSpeiseKarte();

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
	}

	@Before
	// Alles was wir so annotieren wird einmal vor jedem test (annotiert durch
	// @test) ausgeführt
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void rezepteVorhanden() {
		//fail("Noch nicht implementiert");
		assertEquals(rezepte.size(), 2); 
	}
	
	
	// die eigendlichen Tests
	
	@Test
	public void zutatenVorhanden() {
		//fail("Noch nicht implementiert");
		assertEquals(zutatenliste.size(), 3); 
	}
	
	@Test
	public void speisekarteVorhanden() {
		//fail("Noch nicht implementiert");
		assertEquals(gerichte.size(), 2); 
	}

	
	
	
	
	
	
	
	
	//Hilfsmethoden für eine bessere Übersicht
	
	private static void createSpeiseKarte() {
		gerichte.add(new Gericht("Kartoffelsuppe", rezepte.get("Kartoffelsuppe"), 9.90f, Kategorie.Hauptgang));
		gerichte.add(new Gericht("Schnitzel mit Kartoffeln und Rosenkohl",
				rezepte.get("Schnitzel mit Kartoffeln und Rosenkohl"), 19.90f, Kategorie.Hauptgang));
	}

	private static void createZutaten() {
		Zutat tmpZutat = new Zutat("Kartoffeln", Mengeneinheit.Kilogramm, 0.60, 20);
		zutatenliste.put(tmpZutat.getName(), tmpZutat);
		tmpZutat = new Zutat("Schnitzel", Mengeneinheit.Kilogramm, 4.60,5);
		zutatenliste.put(tmpZutat.getName(), tmpZutat);
		tmpZutat = new Zutat("Rosenkohl", Mengeneinheit.Kilogramm, 2.30,5);
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
