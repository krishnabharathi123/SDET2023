package week3.day1;

import java.util.Arrays;

import org.junit.Test;

public class MergeArrays {
	@Test
	public void example1() {
		int[] arr1 = { 1, 3, 5, 7, 9 };
		int[] arr2 = { 2, 8 };
		mergeArrays1(arr1, arr2);
	}

	@Test
	public void example2() {
		int[] arr1 = { 1, 2 };
		int[] arr2 = { 2, 3, 4, 5, 6 };
		mergeArrays1(arr1, arr2);
	}

	private void mergeArrays(int[] arr1, int[] arr2) {
		int left = 0;
		int right = 0;
		int[] num3 = new int[arr1.length + arr2.length];// 7
		for (int i = 0; i < num3.length; i++) {
			if (left < arr1.length && right < arr2.length) {
				if (arr1[left] < arr2[right]) {
					num3[i] = arr1[left++];

				} else {
					num3[i] = arr2[right++];

				}
			} else if (left >= arr1.length)
				num3[i] = arr2[right++];
			else
				num3[i] = arr1[left++];
		}
		System.out.println(Arrays.toString(num3));

	}

	private void mergeArrays1(int[] arr1, int[] arr2) {
		int left = 0;
		int right = 0;
		int i = 0;
		int[] num3 = new int[arr1.length + arr2.length];// 7

		while (left < arr1.length && right < arr2.length) {
			if (arr1[left] < arr2[right]) {
				num3[i++] = arr1[left++];

			} else {
				num3[i++] = arr2[right++];

			}
		}
		while (right < arr2.length)
			num3[i++] = arr2[right++];
		while (left < arr1.length)
			num3[i++] = arr1[left++];

		System.out.println(Arrays.toString(num3));

	}
}
