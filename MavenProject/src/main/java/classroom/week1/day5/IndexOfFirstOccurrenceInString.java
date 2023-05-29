package classroom.week1.day5;

import org.junit.Test;

public class IndexOfFirstOccurrenceInString {

	@Test
	public void positive() {
		String haystack = "sadbutsad";
		String needle = "sad";
		System.out.println(indexOfFirstOcc2(haystack, needle));
	}

	@Test
	public void edge() {
		String haystack = "sadbutsad";
		String needle = "but";
		System.out.println(indexOfFirstOcc2(haystack, needle));
	}

	@Test
	public void edge1() {
		String haystack = "mississippi";
		String needle = "issip";
		System.out.println(indexOfFirstOcc2(haystack, needle));
	}

	@Test
	public void negative() {
		String haystack = "leetcode";
		String needle = "leeto";
		System.out.println(indexOfFirstOcc2(haystack, needle));
	}

	/*
	 * 2pointer approach left pointer on haystack and right pointer on needle. Both
	 * starts from 0 loop till left pointer greater than haystack's length and right
	 * pointer greater than needle's length -> check if left pointer value is equal
	 * to right pointer value. If yes, left++ and right++ create a flag and set as
	 * true if comes inside this if if flag = true, return right-left else if check
	 * if(left!=right) do left++ come out of loop and return -1.
	 * 
	 */
	// leetcode-8 //sadbutsad
	// leeto-5 //but
	//not working fro few test cases
	private int indexOfFirstOcc(String haystack, String needle) {
		int left = 0;
		int right = 0;
		boolean flag = false;
		while (left < haystack.length() && right < needle.length()) {
			if (haystack.charAt(left) == needle.charAt(right)) {
				flag = true;
				left++;
				right++;
			} else if (!flag)
				left++;
			else
				break;
		}
		if (flag == true && right == needle.length())
			return left - right;

		return -1;

	}

	// mississippi
	// issip
	private int indexOfFirstOcc1(String haystack, String needle) {

		if (haystack.contains(needle)) {
			return haystack.indexOf(needle);
		}

		return -1;

	}

	//sadbutsad
	//sad
	//equal to sliding window technique
	private int indexOfFirstOcc2(String haystack, String needle) {
		int i=0;
		int j=needle.length();
		while(j<=haystack.length()) {
			
			if(haystack.substring(i,j).equals(needle)) {
				System.out.println(haystack.substring(i,j));
				return i;
			}
			else if (!(haystack.substring(i,j-1).equals(needle))) {
			i++;
			j++;
		}
		
		}
		

		return -1;

	}
}
