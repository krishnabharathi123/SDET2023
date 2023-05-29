package classroom.week1.day5;

import java.util.Arrays;

import org.junit.Test;

public class TwoSum {

	@Test
	public void example1() {
		int[] nums = {2,7,11,15};
		int target=9;
		System.out.println(twoSum2(nums,target));
	}
	

	@Test
	public void example2() {
		int[] nums = {2,7,9,10,30};
		int target=12;
		System.out.println(twoSum2(nums,target));
	}
	
	@Test
	public void example4() {
		int[] nums = {2,7,10,10,11,15,30};
		int target=25;
		System.out.println(twoSum2(nums,target));
	}
	
	


	@Test
	public void example3() {
		int[] nums = {3,3};
		int target=6;
		System.out.println(twoSum2(nums,target));
	}
	
	@Test
	public void negative() {
		int[] nums = {3,3,8,9};
		int target=100;
		System.out.println(twoSum2(nums,target));
	}
	/*
	 * 2pointer --> opposite direction
	 * loop until left pointer crosses right pointer
	 * check whether the sum of left and right values are equal to target.
	 * --> If yes, print the left and right index
	 * else if check whether sum of left and right is greater than target.
	 * --> If yes, decrement right
	 * else increment left
	 * return the left and right
	 */
	
	//Time Complexity --> O(n)
	//Space Complexity --> O(n)
	
	private void twoSum(int[] nums, int target) {
		int[] output = new int[2];//O(n)
		int left=0;
		int right=nums.length-1;
		while(left<=right) {
			if((nums[left]+nums[right])==target) {
				output[0]=left;
				output[1]=right;
				break;
			}
			else if(nums[left]+nums[right]>target) right--;
			else left++;
		}
		System.out.println(Arrays.toString(output));
		
	}
	/*
	 * Brute Force
	 * Use Outer loop and inner loop to compare all the elements
	 * return the index and break the loop if sum of value matches the target
	 */
	//Time Complexity --> O(n^2)
	//Space Complexity --> O(n)
	private void twoSum1(int[] nums, int target) {
		int[] output = new int[2];//O(n)
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]+nums[j]==target) {
					output[0]=i;
					output[1]=j;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(output));
	}
	/*
	 * 2 pointer -->equividirectional to find the first occurance 
	 * Considering sorted array
	 * left=0, right=1
	 * loop till right reaches the nums length
	 * check if left+right==target -> If yes, print the left and right index
	 * else left+right<target -> move both left and right
	 * check if left+right>target -> left-- 
	 */
	private String twoSum2(int[] nums, int target) {
		int left=0;
		int right=1;
		while(right<nums.length) {
			if(nums[left]+nums[right]==target) {
				String output=left+" "+right;
				return output;
				
			}
			else if(nums[left]+nums[right]<target) {
				left++;
				right++;
			}
			else
				left--;
		}
		return "no match";
		
	}
	
	
}
