package collections.demo;

import java.util.ArrayList;
import java.util.List;

public class Test43 {

	public static void main(String[] args) {
		List<Integer> l1= new ArrayList<>();
		l1.add(1);
		List l2=l1;
		l2.add("hello");
		List<Integer> l3= l2;
		l2.add(2);
		System.out.println(l1);
		

	}

}
