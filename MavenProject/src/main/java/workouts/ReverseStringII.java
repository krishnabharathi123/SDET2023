package workouts;

import org.junit.Test;

public class ReverseStringII {
	@Test
	public void positive() {
		String input = "abcdefg";
		int k = 2;
		reverseStrings(input, k);
	}

	@Test
	public void positive1() {
		String input = "abcd";
		int k = 2;
		reverseStrings(input, k);
	}

	@Test
	public void edge() {
		String input = "abcde";
		int k = 5;
		reverseStrings(input, k);
	}

	@Test
	public void edge1() {
		String input = "abc";
		int k = 8;
		reverseStrings(input, k);
	}

	@Test
	public void negative() {
		String input = "";
		int k = 8;
		reverseStrings(input, k);
	}

	//abcdefg
	private String reverseStrings(String input, int k) {
		if (k > input.length()) k = input.length();
		StringBuilder sb = new StringBuilder(input);
		for (int i = 0; i < sb.length(); i = i + k+k) {
			int left=i;
			int right=i+k-1;
			char temp;
			while(left<=right) {
				temp = sb.charAt(left);
				sb.setCharAt(left++, sb.charAt(right));
				sb.setCharAt(right--, temp);
				//System.out.println(sb);
			}
		}
		return sb.toString();

	}
}
