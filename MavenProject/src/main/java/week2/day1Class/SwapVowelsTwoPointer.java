package week2.day1Class;

import java.util.Arrays;

import org.junit.Test;

public class SwapVowelsTwoPointer {

	/*
	 * Given an input String s. Swap the vowels in the input Example: Input -
	 * "Hello Everyone! Welcome to Testleaf" Output -
	 * "Halle evoryeno! Welcemo te TEstloef"
	 */

	@Test
	public void positive() {
		String input = "Hello Everyone! Welcome to Testleaf";
		String output = "Halle evoryeno! Welcemo te TEstloef";
		swapVowelsUsingStringBuider(input);
	}

	@Test
	public void edge() {
		String input = "happie";
		String output = "heppia";
		swapVowelsUsingStringBuider(input);
	}
	
	@Test
	public void edge1() {
		String input = "happoie";
		String output = "heppioa";
		swapVowelsUsingStringBuider(input);
	}
	

	@Test
	public void negative() {
		String input = "wt s th prb";
		String output = "wt s th prb";
		swapVowelsUsingStringBuider(input);
	}
	
	@Test
	public void negative1() {
		String input = "";
		String output = "";
		swapVowelsUsingStringBuider(input);
	}

	/* Convert the input string into character array
	 * assign left pointer for 0th index assign right pointer for last index 
	 * loop till left pointer is greater than or equal to right pointer 
	 * 	Check whether left pointer value and right pointer values is equal to vowel 
	 *   If yes ---> swap both the values and move left and right pointer 
	 *  If No, Check if left is not a vowel 
	 *  	If yes ---> move left ++; 
	 *  If No, Check if right is not a vowel
	 * 		If yes ---> move right --;
	 */

	//Time complexity --> O(n/2) => O(n)
	//Space complexity --> O(n)+O(1)+O(1)+O(1)+O(1) =>O(n)
	private void swapVowelsUsingCharArray(String input) {
		char[] arr = input.toCharArray();//O(n)
		int left=0; //O(1)
		int right=arr.length-1; //O(1)
		char temp;//O(1)
		
		while(left<=right) {//O(n/2)
			if(isVowel(arr[left]) && isVowel(arr[right])) {
				temp=arr[left];
				arr[left++]=arr[right];
				arr[right--]=temp;
			}
			else if(!isVowel(arr[left])) {
				left++;
			}
			else if(!isVowel(arr[right])) {
				right--;
			}
		}
		String output=new String(arr);//O(1)
		System.out.println(output);

	}

	private boolean isVowel(char c) {
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
			return true;
		}
		
		return false;
		
	}
	
	/* Convert the input string into StringBuiler array (Note: Using setCharAt() method)
	 * assign left pointer for 0th index assign right pointer for last index 
	 * loop till left pointer is greater than or equal to right pointer 
	 * 	Check whether left pointer value and right pointer values is equal to vowel 
	 *   If yes ---> swap both the values and move left and right pointer 
	 *  If No, Check if left is not a vowel 
	 *  	If yes ---> move left ++; 
	 *  If No, Check if right is not a vowel
	 * 		If yes ---> move right --;
	 */
	
	private void swapVowelsUsingStringBuider(String input) {
		StringBuilder sb=new StringBuilder(input);//o(n)
		int left=0;
		int right=input.length()-1;
		char temp;
		while(left<=right) {
			if(isVowel(sb.charAt(left)) && isVowel(sb.charAt(right))) {
				temp=sb.charAt(left);
				sb.setCharAt(left++, sb.charAt(right));
				sb.setCharAt(right--, temp);
			}
			else if(!isVowel(sb.charAt(left))) {
				left++;
			}
			else if(!isVowel(sb.charAt(right))) {
				right--;
			}
		}
		System.out.println(sb);
	}
}
