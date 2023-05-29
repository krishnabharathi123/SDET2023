package week5.day2;

import org.junit.Test;

public class StringPalindrome_ExpandFromCentre {

	@Test
	public void example1() {
		String s="madam";
		System.out.println(isPalindrome(s));
	}
	
	@Test
	public void example2() {
		String s="maddam";
		System.out.println(isPalindrome(s));
	}
	
	@Test
	public void example3() {
		String s="hello";
		System.out.println(isPalindrome(s));
	}
	
	@Test
	public void example4() {
		String s="h";
		System.out.println(isPalindrome(s));
	}
	
	//2 pointer --> Expand from center
	/*
	 * check if the string length is odd or even
	 * if odd start both the pointer in the mid
	 * if even set left pointer as mid-1 and right pointer as mid
	 */
	private boolean isPalindrome(String s) {
		int mid=s.length()/2;
		int left;
		int right;
		if(s.length()%2==0) {
			left=mid-1;
			right=mid;
		}
		else {
			left=mid-1;
			right=mid+1;
		}
		
		while(left>=0 && right <s.length()) {
			if(s.charAt(left)==s.charAt(right)) {
				left--;
				right++;
			}
			else {
				return false;
			}
			
		}
		return true;
	}

}
