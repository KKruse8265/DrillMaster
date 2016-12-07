package CollectionsDemo;
class Aph<X,Y extends X>{
	private X t;
	public void set	(Y t) {
		this.t=t;
	}
	public X get() {
		return this.t;
	}
}
class Bph{}
class Cph extends Bph{}
class Dph{}

public class PlatzhalterDemo {

	public static void main(String[] args) {
		//Welches ist eine gültige Nutzung der Klasse Aph?
//		class E extends Aph<Cph,Bph>{}
		Aph a= new Aph<>();
		Aph<Dph,Dph> a1= new Aph();
//		Aph<X,Y> a2= new Aph<X,Y>();
		Aph a3 = new Aph<Object, Aph<Bph,Cph>>();
	}

}
