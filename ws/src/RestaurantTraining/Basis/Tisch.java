package RestaurantTraining.Basis;

import java.sql.Date;
import java.util.Calendar;
import java.util.HashMap;

public class Tisch {
	private int tischnummer;
	private boolean belegt;
	private int plaetze;
	// wie die Realisierung der Reservierung funzen soll ist mir noch völlig fraglich 
	//Calendar.set(year + 1900, month, date, hrs, min)
	// Calendar rightNow = Calendar.getInstance();
	
	public Tisch(int tischnummer, boolean belegt, int plaetze) {
		this.tischnummer = tischnummer;
		this.belegt = belegt;
		this.plaetze = plaetze;
	}

	
}
