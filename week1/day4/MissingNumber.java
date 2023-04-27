package week1.day4;

import java.util.Arrays;

import org.junit.Test;

public class MissingNumber {

	@Test
	public void positive() {
		int[] num = { 3, 0, 1 };
		missingNo(num);
	}

	@Test
	public void negative() {
		int[] num = { 0, 2, 1, 3 };
		missingNo(num);
	}

	@Test
	public void edge() {
		int[] num = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
		missingNo(num);

	}

	private void missingNo(int[] num) {

		Arrays.sort(num);
		int count = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] != i) {
				System.out.println(i);
				count++;
			}

		}
		if (count != 1) {
			System.out.println(num[num.length - 1] + 1);
		}

	}
}
