package week2.day1Class;

import java.util.Arrays;

import org.junit.Test;

/*Write a program to reverse each word in a String
Example:
Input: Welcome To Testleaf
Output: emocleW oT fealtesT
*/
public class SwapVowelsOfWordsInSentence {

	@Test
	public void positive() {
		String input = "Hello Everyone! Welcome to Testleaf";
		String output = "Halle evoryeno! Welcemo te TEstloef";
		swapVowelsInWords(input);
	}

	@Test
	public void edge() {
		String input = "happie happoie";
		String output = "heppia heppioa";
		swapVowelsInWords(input);
	}

	@Test
	public void edge1() {
		String input = "happoie";
		String output = "heppioa";
		swapVowelsInWords(input);
	}

	@Test
	public void negative() {
		String input = "wt s th prb";
		String output = "wt s th prb";
		swapVowelsInWords(input);
	}

	/*
	 * Split the input using space and store it in a String array 
	 * loop till the length of the string array 
	 * -->Consider the 1st array index value for swapping
	 * Loop till the length of the left pointer is gretaer than right
	 * 1st index value Point the left pointer as 0 Point
	 * the right pointer in the length-1 of 1st index string
	 * 
	 */
	private void swapVowelsInWords(String input) {
		String[] arr = input.split(" ");
		String output = "";
		//System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {

			StringBuilder sb = new StringBuilder(arr[i]);

			//System.out.println(sb);

			// Hello
			int left = 0;
			int right = arr[i].length() - 1;
			char temp;
			while (left <= right) {
				if (isVowel(sb.charAt(left)) && isVowel(sb.charAt(right))) {
					temp = sb.charAt(left);
					sb.setCharAt(left++, sb.charAt(right));
					sb.setCharAt(right--, temp);
				} else if (!isVowel(sb.charAt(left))) {
					left++;
				} else if (!isVowel(sb.charAt(right))) {
					right--;
				}

			}
			output = output +sb+" ";
		}
		System.out.println(output);

	}

	private boolean isVowel(char c) {
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
				|| c == 'U') {
			return true;
		}

		return false;

	}
}
