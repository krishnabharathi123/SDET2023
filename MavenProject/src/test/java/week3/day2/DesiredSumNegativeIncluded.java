package week3.day2;

import org.junit.Test;
import java.util.HashMap;

public class DesiredSumNegativeIncluded {

	@Test
	public void positive() {
		int[] num = { 10, 15, -5, 15, -10, 0 };
		int desiredSum = 5;
		desiredSumUsingHashMap(num, desiredSum);
	}

	@Test
	public void positive1() {
		int[] num = { 10, 15, -5, 15, -13, 0 };
		int desiredSum = 10;
		desiredSumUsingHashMap(num, desiredSum);
	}
	
	@Test
	public void positive2() {
		int[] num = { 10, 15, 0, 15, -13, 0 };
		int desiredSum = 30;
		desiredSumUsingHashMap(num, desiredSum);
	}

	/*
	 * Sliding window using hashmap
	 * key - sum and value - index
	 * Forcefully adding 1st sum and index to hashmap
	 * loop from i=0 till i<num.length
	 * adding the sum and index to hashmap
	 * checking whether the sum-desiredSum is already available in hashmap
	 * if yes, print the value range from sum-desiredsum+1 till i and break the loop
	 */
	private void desiredSumUsingHashMap(int[] num, int desiredSum) {
		int sum = num[0];
		int key;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(sum, 0);
		if (sum == desiredSum) {
			System.out.println(map.get(sum));
		} else {
			for (int i = 1; i < num.length; i++) {

				sum = sum + num[i];// 25-5//20
				map.put(sum, i);
				key = sum - desiredSum;// 25-5//20
				if (map.containsKey(key)) {
					// System.out.println(map.get(val));
					for (int j = map.get(key) + 1; j <= i; j++) {
						System.out.print(j + ",");
					}

					break;
				}

			}
		}
		System.out.println();
	}
}
