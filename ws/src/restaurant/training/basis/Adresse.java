package restaurant.training.basis;
/**
 * 
 * @author Kerstin
 * eine ganz normale deutsche Postadresse
 * Version 01 nur mit getter und setter, Vollstaendiger und parameterloser Konstruktor sowie toString-Methode
 */
public class Adresse {
	private String strasse;
	private String hausnummer;
	private String plz;
	private String ort;
	public Adresse(){
		
	}
	public String getStrasse() {
		return strasse;
	}
	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}
	public String getHausnummer() {
		return hausnummer;
	}
	public void setHausnummer(String hausnummer) {
		this.hausnummer = hausnummer;
	}
	public String getPlz() {
		return plz;
	}
	public void setPlz(String plz) {
		this.plz = plz;
	}
	public String getOrt() {
		return ort;
	}
	public void setOrt(String ort) {
		this.ort = ort;
	}
	public Adresse(String strasse, String hausnummer, String plz, String ort) {
		super();
		this.strasse = strasse;
		this.hausnummer = hausnummer;
		this.plz = plz;
		this.ort = ort;
	}
	@Override
	public String toString() {
		return strasse + " "+ hausnummer + "\n" + plz + " " + ort ;
	}
	
}
