package CollectionsDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Test41 {

	public static void main(String[] args) {
		Queue<Integer> coll = new PriorityQueue<>();
		coll.add(1);
	//	coll.add(1,5);
		coll.remove(0);
	//	coll.put(1,4);
		coll.isEmpty();
		coll.add(1);
		coll.peek();
		coll.contains(2);
	}

}
