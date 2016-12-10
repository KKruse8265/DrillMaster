package RestaurantTraining.Basis;

public class Zutat {
	private String name;
	private int menge;
	private Mengeneinheit mengeneinheit;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMenge() {
		return menge;
	}

	public void setMenge(int menge) {
		this.menge = menge;
	}

	public Mengeneinheit getMengeneinheit() {
		return mengeneinheit;
	}

	public void setMengeneinheit(Mengeneinheit mengeneinheit) {
		this.mengeneinheit = mengeneinheit;
	}

	public Zutat(String name, int menge, Mengeneinheit mengeneinheit) {
		this.name = name;
		this.menge = menge;
		this.mengeneinheit = mengeneinheit;
	}

}
