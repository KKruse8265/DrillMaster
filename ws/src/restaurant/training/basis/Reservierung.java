package restaurant.training.basis;

import java.util.Calendar;

public class Reservierung implements Comparable<Reservierung> {
	private Calendar von; // 14.12.2016 17:00
	private Calendar bis; // 14.12.2016 20:00

	public Reservierung(Calendar von, Calendar bis) {
		this.von = von;
		this.bis = bis;
	}

	public Calendar getVon() {
		return von;
	}

	public Calendar getBis() {
		return bis;
	}

	public void setVon(Calendar von) {
		if (von.compareTo(bis) < 0) {
			// die Startzeit liegt vor der Endezeit
			this.von = von;
		} else
			throw new IllegalArgumentException("Der Beginn einer Reservierung sollte schon vor dem Ende liegen");
	}

	public void setBis(Calendar bis) {
		if (bis.compareTo(von) > 0) {
			// Endezeit die liegt nach der Startzeit
			this.bis = bis;
		} else
			throw new IllegalArgumentException("Das Ende einer Reservierung sollte schon nach dem Anfang liegen");
	}

	public boolean equals(Reservierung reservierung) {
		// zwei Reservierungen sind gleich (eigentlich nicht korrekt 
		// warscheinlich überschneiden sie sich nur
		// also ist equals nicht die ideale Bezeichnung) wenn
		// sich entweder Start oder Ende Zeitpunkt innerhalb der Grenzen
		// befindet
		// Wir sollten us nch einen passenderen namen für diese Methode einfallen lassen 
		// vielleicht frei oder überschneiden???
		if (reservierung.getVon().compareTo(von) >= 0 && reservierung.getBis().compareTo(bis) <= 0) {
		} else if (reservierung.getBis().compareTo(bis) <= 0 && reservierung.getVon().compareTo(von) >= 0) {
			return true;
		}
		return false;
	}

	@Override
	public int compareTo(Reservierung o) {
		//if(!(o instanceof Reservierung)) throw new ClassCastException();
		if (this.equals(o)) {
			//eine Überschneidung wurde entdeckt
			return 0;
		};
		// hier reicht ein einfaches Kleiner-Größer für irgendeine Grenze (von|bis)
		
		if (von.compareTo((o).getVon())<0) {
			return -1;
		}
		if (von.compareTo((o).getVon())>0) {
			return 1;
		}
		//alles was nicht kleiner oder größer ist sollte gleich sein
		//das ist zwar schon über equals aufruf abgedeckt, das weiß der Compiler aber nicht 
		return 0;
	}
}
