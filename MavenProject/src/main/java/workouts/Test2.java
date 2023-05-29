package workouts;

import java.util.*;

public class Test2 {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "hello");
		for(Map.Entry<Integer, String> i: map.entrySet()) {
			
			System.out.println(i.getKey());
			System.out.println(i.getValue());
		}
		
		List<Integer> ls=new ArrayList<Integer>();
		List<List<Integer>> lst=new ArrayList<List<Integer>>();
		
		new ArrayList<Integer>();
		
		ls.add(12);
		ls.add(35);
		ls.add(67);
		
		lst.add(ls);
		List<Integer> ls1=new ArrayList<Integer>();
		ls.add(120);
		ls1.add(350);
		ls1.add(670);
		lst.add(ls1);
		System.out.println(lst);

	}

}
