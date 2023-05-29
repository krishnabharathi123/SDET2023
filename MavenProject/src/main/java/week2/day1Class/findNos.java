package week2.day1Class;

import org.junit.Test;

public class findNos {

	@Test
	public void pos() {
		int[] num = { 1, 2, 2, 3, 4, 5, 4 };
		int x = 2;
		int y = 4;
		System.out.println(findNos2(num, x, y));

	}

	@Test
	public void neg() {
		int[] num = { 1, 2, 3, 4, 5, 2 };
		int x = 2;
		int y = 6;
		System.out.println(findNos2(num, x, y));

	}
	
	@Test
	public void edge() {
		int[] num = { 2,2,2,2,6,6,6,6 };
		int x = 2;
		int y = 6;
		System.out.println(findNos2(num, x, y));

	}

	/*
	 * This will not work for int[] num = { 1, 2, 2, 3 };
		int x = 2;
		int y = 4;
		This code will return true since 2 is repeated
	 */
	public boolean findNos(int[] arr, int x, int y) {
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x || arr[i] == y) {
				j++;
			}
			if (j == 2)
				return true;

		}
		return false;
	}

	public boolean findNos1(int[] arr, int x, int y) {
		int j = 0;
		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				j++;// 1
			}
			if (arr[i] == y) {
				k++;// 1
			}

			if (j >= 1 && k >= 1) {
				return true;
			}

		}
		return false;
	}
	
	/*
	 * same as findNos1..but there used incrementer, here used boolean flag
	 */
	public boolean findNos2(int[] arr, int x, int y) {
		boolean isXPrsnt=false;
		boolean isYPrsnt=false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				isXPrsnt=true;
			}
			if (arr[i] == y) {
				isYPrsnt=true;
			}

			if (isXPrsnt && isYPrsnt) {
				return true;
			}

		}
		return false;
	}
}
