package restaurant.training.basis;

/**
 * der Kellner nimmt die Bestellung an einem Tisch auf
 * + der Verweis auf den Tisch ist sehr gut
 * - Referenztyp sollte ein Interface sein (Prinzip: "programmiere gegen Interface, nicht gegen Implementierung")  
 * Habe erst einmal alle getter und Setter eingefügt, Notwendigkeit siehe Kommentare in den einzelnen Methoden
 * 
 * Wir sollten mal sehen wie dein Encoding eingestellt ist eigentlich sollten wir 
 * keine Probleme mehr mit Umlauten haben wenn wir beide das gleiche Encoding verwenden 
 * 
 */
import java.util.ArrayList;
import java.util.List;

import restaurant.training.basis.Gericht;

public class Bestellung {
	private Tisch tisch;
	private List<Gericht> tischBestellug = new ArrayList<>();
	// das was an diesen Tisch ausgeliefert wurde
	private List<Gericht> tischLieferung = new ArrayList<>();

	public Bestellung(Tisch tisch, ArrayList<Gericht> gericht) {
		// im Konstruktor würde ich nur den Tisch zuweisen
		this.tisch = tisch;

	}

	public Tisch getTisch() {
		// notwendig um zu sehen zu welchem Tisch die Bestellung gehört
		return tisch;
	}

	public void setTisch(Tisch tisch) {
		// eigentlich nicht notwendig, einmal bestellt sollte es keine
		// Notwendigkeit geben, das zu ändern
		// es sei denn die Gäste setzen sich um
		this.tisch = tisch;
	}

	public List<Gericht> getGericht() {
		// die Rückgabe der Bestellung kann hilfreich sein, wenn zum Beispiel
		// nachbestellt wird
		return tischBestellug;
	}

	public void setGericht(ArrayList<Gericht> gericht) {
		// eine komplettes Setzen der Liste scheint nicht notwendig zu sein,
		// eher ein Anfügen einzelner Positionen
		this.tischBestellug = gericht;
	}

	public boolean aufnehmen(Gericht wGericht) {
		// CB wofür steht jetzt das w ?
		// hier wird die Liste "zusammengebaut"
		return tischBestellug.add(wGericht);
	}

	public boolean entfernen(Gericht wGericht) {
		// hier wird ein Gericht wieder von der Bestellung entfernt (weil gerade
		// ausgegangen ist, Herd kaputt,
		// oder der Rosenkohl war zu verkohlt ;-))
		return tischBestellug.remove(wGericht);
	}

	public boolean liefern(Gericht lGericht) {
		// ein Gericht wird an den Tisch gebracht
		// aus der Bestellung geht es raus und auf die Rechnung geht es drauf
		return tischBestellug.remove(lGericht) & tischLieferung.add(lGericht);
	}

	public double abrechnen() throws Exception {
		double result = 0.00;
		// vor der eigentlichen Abrechnung wird geprüft, ob in der Bestellung noch nicht 
		//gelieferte Positionen vorhanden sind
		if (tischBestellug.size() > 0) { 
			throw new Exception("die Bestellung ist noch nicht abgearbeitet");
		} else {
			for (Gericht g : tischLieferung) {
				result += g.getPreis();
			}
		}
		return result;
	}
}
