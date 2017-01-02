package restaurant.training.basis;

import java.sql.Date;
import java.util.SortedSet;
import java.util.TreeSet;

public class Tisch {
	private int tischnummer;
	//ist der Tisch belegt wenn er zwar reserviert ist aber keiner daran sitzt
	private boolean belegt=false;
	private int plaetze;
	private SortedSet<Reservierung> reservierungen = new TreeSet<>();
	/*
	 * Belegungsplan der Tische setzt eine Persitierung voraus
	 * dazu müsste gecheckt werden ob am Wunschdatum zur Wunschzeit Tische mit gewünschten Plätzen frei sind
	 * 
	 */
	//private Map<Zeitraum, String> reservierungen = new HashMap<>();
	// wie die Realisierung der Reservierung funzen soll ist mir noch völlig
	// fraglich
	// Calendar.set(year + 1900, month, date, hrs, min)
	// Calendar rightNow = Calendar.getInstance();

	public Tisch(int tischnummer, int plaetze) {
		this.tischnummer = tischnummer;
		this.plaetze = plaetze;
	}
	public void wirdBelegt(){
		this.belegt=true;
		//ist der Tisch belegt, können Bestellungen an diesem Tisch angenommen werden
	}
	public boolean istFrei(){
		return !belegt;
	}
	public boolean istBelegbar(Reservierung zeitraum){
		//für die Reservierung ist es nötig Datum und Uhrzeit festzulegen zu dem die Reservierung möglich sein soll
		return !belegt;
	}

	public boolean reserviere(Reservierung reservierung) {
		if (reservierungen.size() < 1) {
			//für diesen Tisch gibt es noch keine Reservierung, also kann eine angelegt werden
			reservierungen.add(reservierung);
			return true;
		} else
			
			return false;
	}
	
	public int getTischnummer() {
		return tischnummer;
	}
	public int getPlaetze() {
		return plaetze;
	}
	public String toString() {
//		String tmp;
//		if (belegt)
//			tmp = "Besetzt";
//		else
//			tmp = "Frei";
		//so ist es schön kompakt - der Konditionaloperator muss in Klammern gesetzt werden, 
		//da der Ausdruck von links nach rechts ausgewertet wird. Durch die Klammern wird erst der 
		//komplette Ausdruck ausgewerte und liefert dann den nötigen String, der dann ausgegeben wird
		// die hier anstehende Aufgabe "schreit" geradezu nach dem Konditionaloperator: in Abhängigkeit eines boolschen
		//Wertes soll entweder der eine oder der andere Wert genutzt werden
		return  "Tisch " + tischnummer + " " + (belegt? "Besetzt" : "Frei");
	}
}
