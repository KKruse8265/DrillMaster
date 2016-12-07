package CollectionsDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Vector;

public class Test41 {

	public static void main(String[] args) {
		Map<Integer,Integer> coll = new HashMap<>();
		//coll.add(1); // ist schon in Collection definiert
		//coll.add(1,5);// ist schon in Collection definiert (füge an [pos] [wert] ein)
		coll.put(2,6); //füge einer Map etwas hinzu ([key] [value])
		coll.put(0,4);
		System.out.println(coll.remove(0)); // ist in List und in Map definiert
		System.out.println(coll.isEmpty());// ist in Collection und in Map
		//coll.add(1);
		//System.out.println(coll.peek());
		//coll.contains(2);
	}

}
