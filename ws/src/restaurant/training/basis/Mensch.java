package restaurant.training.basis;
/**
 * Basisklasse Mensch, die kann man sicher irgendwann mal zu was brauchen
 */
import java.util.Date;

public class Mensch {
	private String vorname;
	private String nachname;
	private Date gebDatum;
	private Beruf beruf;
	private Adresse adresse;
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	public Date getGebDatum() {
		return gebDatum;
	}
	public void setGebDatum(Date gebDatum) {
		this.gebDatum = gebDatum;
	}
	public Beruf getBeruf() {
		return beruf;
	}
	public void setBeruf(Beruf beruf) {
		this.beruf = beruf;
	}
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	public Mensch(String vorname, String nachname, Date gebDatum, Beruf beruf, Adresse adresse) {
		super();
		this.vorname = vorname;
		this.nachname = nachname;
		this.gebDatum = gebDatum;
		this.beruf = beruf;
		this.adresse = adresse;
	}
	public Mensch(){}
	public Mensch(String vorname, String nachname) {
		super();
		this.vorname = vorname;
		this.nachname = nachname;
	}
	
}
