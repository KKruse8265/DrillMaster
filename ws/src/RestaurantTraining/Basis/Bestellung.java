package RestaurantTraining.Basis;
/**
 * der Kellner nimmt die Bestellung an einem Tisch auf
 * + der Verweis auf den Tisch ist sehr gut
 * - Referenztyp sollte ein Interface sein (Prinzip: "programmiere gegen Interface, nicht gegen Implementierung")
 * - der Variablenname gericht ist unguenstig: er suggeriert ein einzelnes Gericht, hier sind aber durchaus mehrere 
 * 	gerichte pro tisch zu erwarten.  
 * Habe erstmal alle getter und Setter eingefügt, Notwendigkeit siehe Kommentare in den einzelnen Methoden
 */
import java.util.ArrayList;
import java.util.List;

import RestaurantTraining.Basis.Gericht;

public class Bestellung {
	private Tisch tisch;
	//nicht ideal
	private ArrayList<Gericht> gericht;
	//gegen Interface codieren
	//das was an diesem Tisch bestellt wurde
	private List<Gericht> tischBestellung = new ArrayList<>();
	//das was an diesen Tisch ausgeliefert wurde
	private List<Gericht> tischLieferung = new ArrayList<>();

	public Bestellung(Tisch tisch, ArrayList<Gericht> gericht) {
		//im Konstruktor würde ich nur den Tisch zuweisen
		//Super-Aufruf ohne Parameter wird impliziet gemacht, darum würde ich das nicht explizit hinschreiben
		super();
		this.tisch = tisch;
		//this.gericht = gericht;
		
	}

	public Tisch getTisch() {
		//notwendig um zu sehen zu welchem Tisch die Bestellung gehört
		return tisch;
	}

	public void setTisch(Tisch tisch) {
		//eigentlich nicht notwendig, einmal bestellt sollte es keine Notwendigkeit geben, das zu ändern
		//es sei denn die Gaeste setzen sich um
		this.tisch = tisch;
	}

	public List<Gericht> getGericht() {
		//die Rückgabe der Bestellung kann hilfreich sein, wenn zum Beispiel nachbestellt wird
		return gericht;
	}

	public void setGericht(ArrayList<Gericht> gericht) {
		//eine komplettes Setzen der Liste scheint nicht notwendig zu sein, eher ein Anfuegen einzelner Positionen
		this.gericht = gericht;
	}
	public boolean aufnehmen(Gericht wGericht){
		//hier wird die Liste "zusammengebaut"		
		return tischBestellung.add(wGericht); 
	}
	public boolean entfernen(Gericht wGericht){
		//hier wird ein Gericht wieder von der Bestellung entfernt (weil gerade ausgegangen ist, Herd kaputt,
		//oder der Rosenkohl war zu verkohlt ;-))
		return tischBestellung.remove(wGericht);
	}
	public boolean liefern(Gericht lGericht){
		//ein Gericht wird an den Tisch gebracht
		//aus der Bestellung geht es raus und auf die Rechnung geht es drauf
		return tischBestellung.remove(lGericht)& tischLieferung.add(lGericht);
	}
	public double abrechnen()throws Exception{
		double result=0.00;
		if (tischBestellung.size()>0) {
			throw new Exception("die Bestellung ist noch nicht abgearbeitet");
			} else {
				for(Gericht g: tischLieferung){
					result+=g.getPreis();
				}
			}
		return result;
	}
	
	
	
	
	
}
