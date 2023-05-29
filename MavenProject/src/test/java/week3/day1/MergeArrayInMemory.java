package week3.day1;

import java.util.Arrays;

import org.junit.Test;

public class MergeArrayInMemory {
	@Test
	public void example1() {
		int[] nums1 = { 2, 2, 3, 0, 0, 0 };
		int[] nums2 = { 1, 5, 6 };
		int m = 3;
		int n = 3;
		mergeSortedArray(nums1, nums2, m, n);

	}

	@Test
	public void example2() {
		int[] nums1 = { 1 };
		int[] nums2 = {};
		int m = 1;
		int n = 0;
		mergeSortedArray(nums1, nums2, m, n);
	}

	@Test
	public void example3() {
		int[] nums1 = { 0 };
		int[] nums2 = { 1 };
		int m = 0;
		int n = 1;
		mergeSortedArray(nums1, nums2, m, n);
	}

	//int[] nums1 = {2, 2, 3, 0, 0, 0 };//1,2,3,
	//int[] nums2 = {1, 5, 6 };
	private void mergeSortedArray(int[] nums1, int[] nums2, int m, int n) {

		int left=0;
		int right=0;
		while(left<m && right<n) {
			if(nums1[left]<nums2[right]) {
				left++;
			}
			else if(nums1[left]>nums2[right]) {
				for(int i=nums1.length-1;i>left;i--) {
					nums1[i]=nums1[i-1];
				}
				nums1[left++]=nums2[right++];
			}
			/*
			 * else if(nums1[left]<nums2[right]) { nums1[left++]=nums2[right++]; //left++; }
			 */
			}
		//while(right<nums2.length) nums1[left++]=nums2[right++];
 
		System.out.println(Arrays.toString(nums1));
		}
		
	
}
