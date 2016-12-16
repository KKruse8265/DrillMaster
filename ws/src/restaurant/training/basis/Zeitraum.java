package restaurant.training.basis;

import java.util.Calendar;

public class Zeitraum {
	private Calendar von; // 14.12.2016 17:00
	private Calendar bis; // 14.12.2016 20:00

	public Zeitraum(Calendar von, Calendar bis) {
		this.von = von;
		this.bis = bis;
	}

	public Calendar getVon() {
		return von;
	}

	public void setVon(Calendar von) {
		if (von.compareTo(bis) < 0) {
			// die Startzeit liegt vor der Endezeit
			this.von = von;
		} else
			throw new IllegalArgumentException("Der Beginn einer Reservierung sollte schon vor dem Ende liegen");
	}

	public Calendar getBis() {
		return bis;
	}

	public void setBis(Calendar bis) {
		this.bis = bis;
	}

}
