package de.cokuss.chris;

public class Todos implements Comparable<Todos> {
	private int priority;
	private String text;

	public Todos(String text, int priority) {
		this.text = text;
		this.priority = priority;
	}

	@Override
	public int compareTo(Todos o) {
		return this.priority - o.priority;
	}

	public String getText() {
		return this.text;
	}
	@Override
	public String toString() {
		return "P "+this.priority+" : "+this.text;
	}
}
