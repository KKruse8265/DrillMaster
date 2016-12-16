package restaurant.training.basis;

import java.util.Calendar;

public class Zeitraum {
	private Calendar von;
	private Calendar bis;

	public Zeitraum(Calendar von, Calendar bis) {
		this.von = von;
		this.bis = bis;
	}

	public Calendar getVon() {
		return von;
	}

	public void setVon(Calendar von) {
		if(von.compareTo(bis) < 0 ) {
			//bedeutet hoffentlich das von vor bis ist
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
