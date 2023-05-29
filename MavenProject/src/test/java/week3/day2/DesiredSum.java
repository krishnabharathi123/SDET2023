package week3.day2;

import org.junit.Test;

public class DesiredSum {
/*Given an array of positive integers, find the subarrays that adds up to the given number (k)
 */
	
	@Test
	public void positive() {
		int[] num= {1,2,3,2,1};
		int target=7;
		desiredSum(num,target);
	}
	
	@Test
	public void positive1() {
		int[] num= {44,1,2,3};
		int target=1;
		desiredSum(num,target);
	}
	@Test
	public void positive2() {
		int[] num= {1,5,2,3,7,1};
		int target=3;
		desiredSum(num,target);
	}
	
	@Test
	public void edge() {
		int[] num= {10,2,3,12,7};
		int target=7;
		desiredSum(num,target);
	}
	@Test
	public void edge1() {
		int[] num= {1,2,44,4,3,45};
		int target=45;
		desiredSum(num,target);
	}
	@Test
	public void negative() {
		int[] num= {10,2,3,12,17};
		int target=7;
		desiredSum(num,target);
	}
	@Test
	public void negative1() {
		int[] num= {1, 1, 44, 1, 1, 1};
		int target=3;
		desiredSum(num,target);
	}

	private void desiredSum(int[] num, int target) {

		int sum=num[0];
		int left=0;
		int right=0;
		while(left>=0 && right<num.length) {
			if(sum==target) {
				//System.out.println(left+" "+right);
				for(int k=left;k<=right;k++) {
					System.out.print(k+",");
				}
				System.out.println();
				break;
			}
			else if(sum<target) {
				right++;
				sum=sum+num[right];//8
			}
			else if(sum>target ) {
				sum=sum-num[left++];//8-1//7
			}
		}
		
	}
}
