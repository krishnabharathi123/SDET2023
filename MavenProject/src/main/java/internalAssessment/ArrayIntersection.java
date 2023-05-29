package internalAssessment;

import java.util.*;

import org.junit.Test;

public class ArrayIntersection {

	@Test
	public void example1(){

	int[] nums1={1,2,2,1};
	int[] nums2={2,2};
	arrayIntersection(nums1,nums2);

	}

	@Test
	public void example2(){

	int[] nums1={4,9,5};
	int[] nums2={9,4,9,8,4};
	arrayIntersection(nums1,nums2);
	}

	@Test
	public void example3(){

	int[] nums1={1,1,1,1};
	int[] nums2={2,2,2,2};
	arrayIntersection(nums1,nums2);
	}

	@Test
	public void example4(){

	int[] nums1={1,2,3,4};
	int[] nums2={4};
	arrayIntersection(nums1,nums2);
	}

	@Test
	public void example5(){

	int nums1[]={1,1,1,1};
	int nums2[]={1,1,1,1};
	arrayIntersection(nums1,nums2);
	}

//Time Complexity --> O(n)
//Space Complexity --> O(n logn)
public int[] arrayIntersection(int[] nums1,int[] nums2){

	Arrays.sort(nums1);
	Arrays.sort(nums2);
	int left=0;
	int right=0;
	Set<Integer> set=new HashSet<Integer>();

	while(left<nums1.length && right<nums2.length){
		if(nums1[left]==nums2[right]){
			set.add(nums1[left]);
			left++;
			right++;
		}
		else if(nums1[left]>nums2[right]){
			right++;
		}
		else if(nums1[left]<nums2[right]){
			left++;			
		}
		}

	int[] out = new int[set.size()];
	int count=0;
	for(int k:set){
		out[count++]=k;
	}
	System.out.println(Arrays.toString(out));
	return out;

}

}
