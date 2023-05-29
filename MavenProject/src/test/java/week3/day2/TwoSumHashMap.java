package week3.day2;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumHashMap {

	@Test
	public void positive() {
		int[] num= {0,5,2,3,7,1};
		int k=3;
		System.out.println(Arrays.toString(twoSum(num,k)));
	}
	
	@Test
	public void positive1() {
		int[] num= {1,5,2,10,60,78};
		int k=79;
		System.out.println(Arrays.toString(twoSum(num,k)));
	}
	@Test
	public void positive2() {
		int[] num= {3,2,4};
		int k=6;
		System.out.println(Arrays.toString(twoSum(num,k)));
	}
	
	@Test
	public void positive3() {
		int[] num= {3,3};
		int k=6;
		System.out.println(Arrays.toString(twoSum(num,k)));
	}
	/*
	 * Store the value in hash map--> key - number and value - index
	 * Math logic --> subtract the target value with the key and get the number..
	 * If that number is already available in hash, then print current index and index of the number
	 */
	//Time Complexity--> O(n)
	//Space Complexity-->O(n)
	private int[] twoSum(int[] num, int k) {
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		int[] out=new int[2];
		for(int i=0;i<num.length;i++) {
			map.put(num[i], i);
			System.out.println(map);
			
			if(map.containsKey(k-num[i])){
				System.out.println(i+" "+map.get(k-num[i]));
				out[0]=map.get(k-num[i]);
				out[1]=i;
				if(out[0]!=out[1]) return out;
			}
			
		}
		
		return out;
	}
}
