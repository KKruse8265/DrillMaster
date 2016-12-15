package collections.demo;

import java.util.PriorityQueue;
import java.util.Queue;

public class Test47 {

	public static void main(String[] args) {
		Queue<Integer> q = new PriorityQueue<>();
		for (int i= 0; i<=5;i++){
			q.add(i);
		}
		q.peek();q.poll();q.peek();q.poll();
		System.out.println(q);

	}

}
