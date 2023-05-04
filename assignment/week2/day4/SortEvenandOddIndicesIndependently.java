package assignments.week2.day4;

import java.util.Arrays;

import org.junit.Test;

public class SortEvenandOddIndicesIndependently {
	@Test
	public void positive() {
		int[] num = { 4, 1, 2, 3 };

		sortOddEven(num);
	}

	@Test
	public void negative() {
		int[] num = { 1, 0, 7, 8, 1 };

		sortOddEven(num);
	}

	@Test
	public void edge() {
		int[] num = { 2, 1 };

		sortOddEven(num);
	}

	private void sortOddEven(int[] num) {
		int left = 0;
		int right = 2;
		int temp;
		while (right < num.length) {
			if (num[left] > num[right]) {
				temp = num[left];
				num[left] = num[right];
				num[right] = temp;
				left+=2;
				right+=2;
			}
		}
		left = 1;
		right = 3;
		while (right < num.length) {
			if (num[left] < num[right]) {
				temp = num[left];
				num[left] = num[right];
				num[right] = temp;
				left+=2;
				right+=2;
			}
		}
		System.out.println(Arrays.toString(num));

	}
}
