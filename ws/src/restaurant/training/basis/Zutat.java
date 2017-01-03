package restaurant.training.basis;

public class Zutat {
	private String name;
	private Mengeneinheit mengeneinheit;
	private Double preisProMengeneinheit;

	public Zutat(String name, Mengeneinheit mengeneinheit, Double preisProMengeneinheit) {
		this.name = name;
		this.mengeneinheit = mengeneinheit;
		this.preisProMengeneinheit = preisProMengeneinheit;
	}

	public Zutat() {

	}

	public String getName() {
		return name;
	}

	public Mengeneinheit getMengeneinheit() {
		return mengeneinheit;
	}

	public Double getPreisProMengeneinheit() {
		return preisProMengeneinheit;
	}
	
}
