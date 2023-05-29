package workouts;

import java.util.Arrays;

import org.junit.Test;

public class MergeArrays {

	@Test
	public void positive() {
		int[] nums1 = { 1, 2, 3, 4, 5 };
		int[] nums2 = { 6, 7, 8, 9, 10, 11 };
		mergeArrays1(nums1, nums2);
	}

	@Test
	public void positive1() {
		int[] nums1 = { 1, 2, 3, 4, 5 };
		int[] nums2 = { 6, 7, 8 };
		mergeArrays1(nums1, nums2);
	}

	@Test
	public void edge() {
		int[] nums1 = { 1 };
		int[] nums2 = { 6, 7, 8, 9, 10, 50 };
		mergeArrays1(nums1, nums2);
	}
	
	@Test
	public void negative() {
		int[] nums1 = {  };
		int[] nums2 = { 	 };
		mergeArrays1(nums1, nums2);
	}

	// Time complexity ---> O(n)
	// Space Complexity ---> O(n)
	public static void mergeArrays(int[] nums1, int[] nums2) {
		int left = 0;
		int right = 0;
		int k = 0;
		int[] nums3 = new int[nums1.length + nums2.length];// O(n)
		
		if (nums1.length >= nums2.length) {
			while (left < nums1.length) {// O(n)
				if (right < nums2.length) {
					nums3[k++] = nums1[left++];
					nums3[k++] = nums2[right++];
				} else {
					nums3[k++] = nums1[left++];
				}
			}

		} else {
			while (right < nums2.length) {// O(n)
				if (left < nums1.length) {
					nums3[k++] = nums1[left++];
					nums3[k++] = nums2[right++];
				} else {
					nums3[k++] = nums2[right++];
				}

			}

		}
		System.out.println(Arrays.toString(nums3));
	}
	
	public static void mergeArrays1(int[] nums1, int[] nums2) {
		int left = 0;
		int right = 0;
		int k = 0;
		int[] nums3 = new int[nums1.length + nums2.length];// O(n)
		//int[] nums1 = { 1, 2, 3, 4, 5 };
		//int[] nums2 = { 6, 7, 8, 9, 10, 11 };
		//if (nums1.length >= nums2.length) {
			while (left < nums1.length && right<nums2.length) {// O(n)
				
				nums3[k++] = nums1[left++];
				nums3[k++] = nums2[right++];
				
			}
			while(right<nums2.length) {
				nums3[k++] = nums2[right++];
			}
			while(left < nums1.length){
				nums3[k++] = nums1[left++];
				
			}
			System.out.println(Arrays.toString(nums3));
			}
}

		
		

