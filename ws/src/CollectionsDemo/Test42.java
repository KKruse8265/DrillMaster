package CollectionsDemo;

import java.util.ArrayList;
import java.util.List;

public class Test42 {
	public void m(List<Integer> l) {
		System.out.print(l.size());
	}
	public void m1() {
		List<Integer> l = new ArrayList<>();
		l.add(1);
		l.add(2);
		m(l);
		m(new ArrayList());
	}
	public static void main(String[] args) {
		Test42 t= new Test42();
		t.m1();
		
	}

}
