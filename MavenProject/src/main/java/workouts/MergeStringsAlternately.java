package workouts;

import org.junit.Test;

public class MergeStringsAlternately {

	@Test
	public void example1() {
		String word1 ="abc";
		String word2="pqr";
		mergeAlternate(word1,word2);
	}
	

	@Test
	public void example2() {
		String word1 ="ab";
		String word2="pqrs";
		mergeAlternate(word1,word2);
	}
	
	@Test
	public void example3() {
		String word1 ="abcd";
		String word2="pq";
		mergeAlternate(word1,word2);
	}
	/*
	 * 2 Pointer approach
	 * Check if left<word1.length() && right<word2.length() 
	 * If yes, add the characters from both the given string alternatively to the output string
	 * If the 1st loop comes out, check whether other word is pending
	 * If yes, append the remaining words in the output string
	 */
	private void mergeAlternate(String word1, String word2) {
		int left=0;
		int right=0;
		String output="";
		while(left<word1.length() && right<word2.length()) {
			output=output+word1.charAt(left++)+word2.charAt(right++);
		}
		while(left<word1.length()) output=output+word1.charAt(left++);
		while(right<word2.length()) output=output+word2.charAt(right++);
		
		System.out.println(output);
		
	}
}
