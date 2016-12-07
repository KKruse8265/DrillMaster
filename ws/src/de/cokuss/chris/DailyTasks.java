package de.cokuss.chris;

import java.util.PriorityQueue;
import java.util.Queue;

public class DailyTasks {

	static Queue<Todos> myTasks = new PriorityQueue<>();

	public static void main(String[] args) {
		myTasks.add(new Todos("aufstehen", 1));
		myTasks.add(new Todos("umdrehen", 0));
		myTasks.add(new Todos("umdrehen", 0));
		myTasks.add(new Todos("umdrehen", 0));
		myTasks.add(new Todos("umdrehen", 0));
		myTasks.add(new Todos("wieder hinlegen", 1));
		myTasks.add(new Todos("Whats App auf Nachricht von Kerstin checken", 3));
		myTasks.add(new Todos("Kaffe kochen", 2));
		myTasks.add(new Todos("Dreck abkratzen", 3));
		myTasks.add(new Todos("Java lernen", 4));
		myTasks.add(new Todos("wieder hinlegen", 4));

		System.out.println("Normale Interation\n");
		for (Todos td : myTasks) {
			System.out.println(td);
		}
		System.out.println("\nUnd jetzt richtig\n");
		while (!myTasks.isEmpty()) {
			System.out.println(myTasks.remove());
		}
	}
}
