package collections.demo;

import java.util.HashSet;
import java.util.Set;

public class Test46 {

	public static void main(String[] args) {
		Set<Integer> s1= new HashSet<>();
		s1.add(30);
		s1.add(23);
		s1.add(null);
		Set<Integer> s2 = new HashSet<>(s1);
		s2.addAll(s1);
		System.out.println(s2.size());

	}

}
