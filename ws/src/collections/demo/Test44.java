package collections.demo;

import java.util.ArrayList;
import java.util.List;

public class Test44 {

	public static void main(String[] args) {
		List<Long> l1= new ArrayList<>();
		l1.add((Long)(Number)1);
		l1.add(new Long(2));
		l1.add(Long.parseLong("3"));
		System.out.println(l1.get(0));

	}

}
