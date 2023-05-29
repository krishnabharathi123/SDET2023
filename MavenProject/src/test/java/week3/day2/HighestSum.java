package week3.day2;

import org.junit.Test;

public class HighestSum {
/*
 * Given an array of integers and a number k.
	Return the highest sum of any k consecutive elements in the array.
 */
	@Test
	public void positive() {
		int[] num= {1,5,2,3,7,1};
		int k=3;
		highestSumArray1(num,k);
	}
	
	@Test
	public void negative() {
		int[] num= {1,5,2,10,60,78};
		int k=3;
		highestSumArray1(num,k);
	}

	/*
	 * loop from 0 till num.length-k
	 * int left=i; and right=k-1+left
	 * sum=sum+num[i-1]+num[r+1]
	 * Find the greatest sum value
	 */
	private void highestSumArray(int[] num , int k) {
	
		int sum=0;
		int max=0;
		int[] out=new int[k];
		for(int i=0;i<=num.length-k;i++) {
			int left=i;//1
			int right=k-1+left;//3-1+1
			if(i==0) {
				sum=num[left]+num[left+1]+num[right];
			}
			else {
				sum=sum-num[left-1]+num[right];
			}
			if(max<sum) {
				max=sum;
			}
			
		}
		System.out.println(max);
		
}
	private void highestSumArray1(int[] num , int k) {
		
		int sum=0;
		int max=0;
		int[] out=new int[k];
		for(int i=0;i<=num.length-k;i++) {
			int left=i;//1
			int right=k-1+left;//3-1+1
			if(i==0) {
			for(int j=0;j<k;j++) {
				sum=sum + num[j];
			}
			}
			else
				sum=sum-num[left-1]+num[right];
		
			if(max<sum) {
				max=sum;
			}
			
		}
		System.out.println(max);
		
}
}
