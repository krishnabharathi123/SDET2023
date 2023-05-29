package week5.day2;

import org.junit.Test;

public class WBBlock {

	@Test
	public void example1() {
		String s="WBBWWBBWBW";
		int k=7;
		System.out.println(minWBlock(s,k));
	}
	
	@Test
	public void example2() {
		String s="BBBBBBBWBW";
		int k=8;
		System.out.println(minWBlock(s,k));
	}
	
	@Test
	public void example3() {
		String s="WBWBBBW";
		int k=5;
		System.out.println(minWBlock(s,k));
	}
	//WBBWWBBWBW
	private int minWBlock(String s, int k) {
		int left=0;
		int right=0;
		int min=Integer.MAX_VALUE;
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='W') {
				count++;
			}
			if(right-left==k-1) {
				if(count < min) {
					min=count;
				}
				if(s.charAt(left)=='W') count--;
				
				left++;
			}
			right++;
		}
		
		
		
		return min;
	}
}
