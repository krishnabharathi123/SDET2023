package week1.day2;

import java.util.Arrays;

import org.junit.Test;

public class RemoveFirstLastOccurance {

	@Test
	public void positive() {
		int[] arr = { 2, 1, 3, 5, 1, 7, 9, 8 };
		int num = 1;
		removeFrstLstOcc(arr, num);
	}

	@Test
	public void edge() {
		int[] arr = { 1, 1, 1, 1, 1 };
		int num = 1;
		removeFrstLstOcc(arr, num);
	}

	public void edge1() {
		int[] arr = { 0, 0, 1, 0, 0 };
		int num = 1;
		removeFrstLstOcc(arr, num);
	}

	public void negative() {
		int[] arr = { 3, 5, 6, 7, 8 };
		int num = 1;
		removeFrstLstOcc(arr, num);
	}

	/*
	 * Initialize left pointer to 1st index and right pointer to last index
	 * Initialize the incrementer variable for 1st occurrence and last occurrence
	 * Create a new array with length-2 of input array Loop till left pointer is
	 * less than or equal to right pointer Validate whether left pointer value of
	 * input array is equal to target value and also validate whether the
	 * incrementer left value is not equal to zero. If yes, increment the left
	 * incrementer variable as 1 and increment the left pointer. If no, add the
	 * current value in to the new array of index (left-i) Validate whether right
	 * pointer value of input array is equal to target value and also validate
	 * whether the incrementer right value is not equal to zero. If yes, increment
	 * the right incrementer variable as 1 and decrement the right pointer. If no,
	 * add the current value in to the new array of index (right-i)
	 */
	private void removeFrstLstOcc(int[] arr, int num) {
		int left = 0;
		int right = arr.length - 1;
		int l = 0, r = 0;
		
		int[] arr1 = new int[arr.length - 2];
		int k=arr1.length-1;
		while (left <= right) {

			if (arr[left] == num && l != 1) {
				l++;// 1
				left++;
			}

			else {
				arr1[left - l] = arr[left++];
			}
			if (arr[right] == num && r != 1) {
				r++;// 1
				right--;
				k--;

			} else {
				arr1[k -r] = arr[right--];
				k--;
				
			}

		}
		System.out.println(Arrays.toString(arr1));

	}

}
