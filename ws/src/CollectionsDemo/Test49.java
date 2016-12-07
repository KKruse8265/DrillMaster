package CollectionsDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class A49 implements Comparable<A49>{
	private String s;
	A49(String s1){
		this.s=s1;
	}
	
	public int compareTo(A49 o) {
		return this.s.compareTo(o.s);
	}
	public String toString() {
		return s;
	}

	
	
}
public class Test49 {

	public static void main(String[] args) {
		List<A49> l = new ArrayList<>();
		l.add(new A49("a1"));
		l.add(new A49("m2"));
		l.add(new A49("b5"));
		Collections.sort(l);
		System.out.println(l);
	}

}
