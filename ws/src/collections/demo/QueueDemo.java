package collections.demo;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<String> que = new LinkedBlockingQueue<>(2);
		que.add("erstes");
		que.add("zweites");
		//System.out.println(que.add("drittes"));
		/*bei einer Queue, die eine begrenzte Kapazit�t hat
		(in der Regel, Queues, die im threadKontext benutzt werden)
		f�hrt die Verwendung von add zu einener IllegalStateException
		 wenn versucht wird mehr als die vorgesehnen Elemente einzuf�gen
		offer liefert in einem solchen Fall einfach nur false*/
		System.out.println(que.offer("viertes"));
		System.out.println(que);
		
		
		
	}

}
