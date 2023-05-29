package week5.day2;

import org.junit.Test;

public class ReverseString {

	@Test
	public void example1() {
		String s="hello";
		System.out.println(reverseString(s));
	}
	
	@Test
	public void example2() {
		String s="hello world";
		System.out.println(reverseString(s));
	}
	
	@Test
	public void example3() {
		String s="";
		System.out.println(reverseString(s));
	}
	
	@Test
	public void example4() {
		String s="u";
		System.out.println(reverseString(s));
	}

	//Time Complexity --> O(n)
	//Space Complexity --> O(n)
	private String reverseString(String s) {
		
		int left=0;
		int right=s.length()-1;
		char temp;
		StringBuilder sb=new StringBuilder(s);
		while(left<=right) {
			temp=sb.charAt(left);//h
			sb.setCharAt(left++, sb.charAt(right));//o
			sb.setCharAt(right--, temp);//h
		}
		return sb.toString();
	}
	
	
}
