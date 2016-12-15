package collections.demo;

import java.util.ArrayList;
import java.util.List;

public class Test45 {

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		l1.add(30);
		l1.add(20);
		l1.add(1, 0);
		List<Integer> l2 = new ArrayList<>(l1);
		l1.add(15);
		l2.addAll(l1);
		l2.add(4, 9);
		List<Integer> l3= l2.subList(2, 5);
		l3.clear();
		System.out.println(l2);
	}

}
