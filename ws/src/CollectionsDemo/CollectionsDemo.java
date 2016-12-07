package CollectionsDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

class Person {
	String name;
	String beruf;
	Integer alter;

	public Person(String name, String beruf, Integer alter) {
		this.name = name;
		this.beruf = beruf;
		this.alter = alter;
	}
	public String toString(){
		return name + " "+ beruf;
	}

	public boolean equals(Object o) {
		return this.name.equals(((Person) o).name);
	}
}
class Haustier implements Comparable<Haustier>{
	String name;
	String art;
	int prioritaet;
	public Haustier(String name, String art, int pri){
		this.name=name;
		this.art=art;
		this.prioritaet=pri;
	}
	public String toString(){
		return name + " "+ art;
	}
	@Override
	public boolean equals(Object o){
		return this.name==((Haustier)o).name && this.art==((Haustier)o).art;
	}
	@Override
	public int hashCode(){
		return name.hashCode()+art.hashCode();
	}
	@Override
	public int compareTo(Haustier o) {
		int result=0;
				if(this.prioritaet<o.prioritaet){
					result=-1;
					}else if(this.prioritaet>o.prioritaet){
						result=1;
					}
		return result;
		
	}
	
}

public class CollectionsDemo {

	public static void main(String[] args) {
		// List mit ArrayList
		List<Integer> list = new ArrayList<>();
		list.add(1);
//		list.add("eins");
//		list.add(new Person("Kerstin", "Drillsergant", 51));
//		list.add(new Haustier("Leo","Katze"));
		list.add(1);
		// Set mit HashSet
//		Set<Haustier> set = new HashSet<>();
//		set.add(1);
//		set.add("eins");
//		set.add("eins");
//		set.add(new Person("Kerstin", "Drillsergant", 51));
//		set.add(new Haustier("Leo","Katze"));
//		set.add(new Haustier("Scotty","Hund"));
//		set.add(new Haustier("Scotty","Hund"));
//		set.add(1);
//		// Set mit TreeSet
		Set<Haustier> setT = new TreeSet<>();
//		setT.add(1);
//		setT.add("eins");
//		setT.add(new Person("Kerstin", "Drillsergant", 51));
		setT.add(new Haustier("Leo","Katze",1));
		setT.add(new Haustier("Blacki","Katze",4));
		setT.add(new Haustier("Scotty","Hund",2));
		setT.add(new Haustier("Dusty","Hund",3));
//		setT.add(1);
//		//Queue mit PriorityQueue
		Queue<Haustier> que=new PriorityQueue<>();
		//que.offer(new Haustier("xxx", "Fledermaus",7));
		que.addAll(setT);
//		que.add("eins");
		que.add(new Haustier("Piepsi", "Blaumeise",1));
		que.add(new Haustier("Piepsi", "Blaumeise",1));
		
//		que.add(new Haustier("Leo","Katze",1));
//		que.add(new Haustier("Blacki","Katze",4));
//		que.add(new Haustier("Scotty","Hund",2));
//		que.add(new Haustier("Dusty","Hund",3));
//		que.add(1); 
		Iterator<Haustier> itHaustier=que.iterator();
		System.out.println("mit Iterator:\n");
		while(itHaustier.hasNext()){
			System.out.println(itHaustier.next());
		}
//		for (Object o:setT){
//			System.out.println(o);
//		}
//		System.out.println("----------------\n");
//		
		System.out.println("\nMit for-each:\n");
		for(Haustier h:que){
			System.out.println(h);
		}
		System.out.println("\nIn Reihenfolge der Priorität:\n");
		while(!que.isEmpty()){
			System.out.println(que.poll());
		}
		// Collection vs. Collections

	}

}
