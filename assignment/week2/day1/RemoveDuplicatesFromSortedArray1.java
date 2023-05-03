package week2.day3;

import org.junit.Test;

public class RemoveDuplicatesFromSortedArray {

	@Test
	public void positive() {
		int[] nums = {0,0,1,1,1,2,2,3,3,4 };
		removeDuplicates(nums);
	}

	@Test
	public void edge() {
		int[] nums = { 5,5,5,5,5,5 };
		removeDuplicates(nums);
	}

	@Test
	public void negative() {
		int[] nums = { 1, 2, 3, 4 };
		removeDuplicates(nums);
	}
	/*
	 * 2 pointer approach ---> equividirectional (need to maintain relative order)
	 * Set the left pointer in 0 and right pointer in 1 initially
	 * Compare whether the left pointer value and right pointer values are equal
	 * If yes, increment the fast pointer (right) to next index
	 * If no, then assign the right pointer value to left+1 pointer
	 * return the left+1 value as index of unique elements
	 */
	private void removeDuplicates(int[] nums) {
		int left=0;
		int right=1;
		for(;right<nums.length;right++) {
			if(nums[left]!=nums[right]) {
				nums[left]=nums[right];
			}
		}
	}

}
