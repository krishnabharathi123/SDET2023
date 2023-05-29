package week3.day1;

import org.junit.Test;

public class CountTheOnes {

	@Test
	public void example1() {
		int[] num = { 0, 0, 0, 0, 0, 1, 1 };
		countOnes(num);
	}

	@Test
	public void example2() {
		int[] num = { 1, 1, 1, 1, 1, 1 };
		countOnes(num);
	}

	@Test
	public void example3() {
		int[] num = { 0, 0, 0, 0, 0, 0 };
		countOnes(num);
	}

	@Test
	public void example4() {
		int[] num = {};
		countOnes(num);
	}
	
	/*Divide and conquer
	 * left=0 and right=num.length-1
	 * get the mid pointer using left+right/2
	 * check if mid value is equal to 1
	 * --> If yes, check it is the 1st one by using mid-1=0
	 * --> If it is not the 1st one discard the right and assing r=mid-1
	 * If mid value is equal to 0
	 * --> Discard left and assign left=mid+1
	 * 
	 */
	// 0, 0, 0, 0, 0, 1, 1
	
	//Time Complexity ---> O(logn)
	//Space Complexity --> O(1)
	private void countOnes(int[] num) {
		int left=0;
		int right=num.length-1;
		while(left<=right) {
			int mid=(left+right)/2;
			if(num[mid]==1) {
				if( mid==0 || num[mid-1]==0) {
					System.out.println(num.length-mid);
					break;
				} 
				else {
					right=mid-1;
				}
			}
			 
			else {
				left=mid+1;
			}
		}
		
	}
}
