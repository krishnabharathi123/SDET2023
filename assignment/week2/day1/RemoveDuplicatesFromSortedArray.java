package assignment.week2.day1;

import java.util.Arrays;

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

	/*
	 * @Test public void edge1() { int[] nums = { 0, 0, 0, 0, 0, 1, 2, 3, 4 };
	 * moveZeroToRight(nums); }
	 */
	@Test
	public void negative() {
		int[] nums = { 1, 2, 3, 4 };
		removeDuplicates(nums);
	}
	//Time Taken -30m
	/*
	 * Assign left pointer to the 0th index
	 * Assign right pointer to the 1st index
	 * Initialize the count variable as 0
	 * Create a new array with the length as same as input array length
	 * loop till the right pointer crosses the length of the array
	 * ->check whether the left pointer value and right pointer values are not equal.
	 * --> If yes, increment the count +1 and add the left value to the new array
	 * -->increment both left and right pointer
	 * Add the last value of input array by default
	 * Print the count value
	 * Loop from 0 till count-1 and assign the newarray value to input array
	 * Loop from count till array length and assign -1 to input array
	 */
	//Time Taken -20m
	private void removeDuplicates(int[] nums) {
		int left =0;
		int right =1;
		int count =0;
		int[] newArr= new int[nums.length];
		while(right<nums.length) {
			//{1,1,2,2,3,3,4,4,5 }
			if(nums[left]!=nums[right]) {
				newArr[count++]=nums[left];//1,2,3,4
			}
			left++;
			right++;
		}
		newArr[count]=nums[left];
		count=count+1;
		System.out.println(count);
		
		for(int i=0;i<=count-1;i++) {
			nums[i]=newArr[i];
		}
		for(int i=count;i<nums.length;i++) {
			nums[i]=-1;
		}
		
		System.out.println(Arrays.toString(nums));
	}
}
