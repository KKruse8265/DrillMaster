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
		//coll.add(1); // ist schon in Collection definiert -->Alle List, Set und Queue
		//coll.add(1,5);// ist nur in List ( und Subtypen von List) definiert (fuege an [index] [wert] ein)
		coll.put(2,6); //fuege einer Map etwas hinzu ([key] [value]) -->Map ist K e i n e Collection
		coll.put(2,4);	//put auf einen bestehenden key überschreibt den Value für diesen Keys
		System.out.println(coll.remove(0)); // ist in Collection und in Map definiert
		System.out.println(coll.isEmpty());// ist in Collection und in Map
		//coll.add(1);	//Bei Sets wird k e i n Dupilkat hinzugefügt add liefert in dem Fall false
		//System.out.println(coll.peek()); //wird in Queue verwendet
		//coll.contains(2); // wird in allen Collection`s verwendet
		coll.containsKey(2); // definiert in Map und ermittelt, ob der Key existiert
		coll.containsValue(2);//definiert in Map und ermittelt, ob der Value existiert
	}

}
