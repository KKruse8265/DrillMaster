package restaurant.training.basis;

import java.sql.Date;
import java.util.Calendar;
import java.util.HashMap;

public class Tisch {
	private int tischnummer;
	private boolean belegt=false;
	private int plaetze;
	/*
	 * Belegungsplan der Tische setzt eine Persitierung voraus
	 * dazu müsste gecheckt werden ob am Wunschdatum zur Wunschzeit Tische mit gewünschten Plätzen frei sind
	 * 
	 */
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
	public boolean istBelegt(){
		return belegt;
	}
	public boolean istBelegbar(Date datum, Date uhrzeit){
		//für die Reservierung ist es nötig Datum und Uhrzeit festzulegen zu dem die Reservierung möglich sein soll
		return !belegt;
	}

	public String toString() {
		String tmp;
		if (belegt)
			tmp = "Besetzt";
		else
			tmp = "Frei";
		return "Tisch " + tischnummer + " " + tmp;
	}
}
