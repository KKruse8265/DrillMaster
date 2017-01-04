package restaurant.training.basis;

public class Zutat {
	private String name;
	private Mengeneinheit mengeneinheit;
	private Double preisProMengeneinheit;
	private Integer bestand; //bestand ist in der zugeordneten Mengeneinheit angegeben

	public Zutat(String name, Mengeneinheit mengeneinheit, Double preisProMengeneinheit, Integer bestand) {
		this.name = name;
		this.mengeneinheit = mengeneinheit;
		this.preisProMengeneinheit = preisProMengeneinheit;
		this.bestand= bestand;
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
