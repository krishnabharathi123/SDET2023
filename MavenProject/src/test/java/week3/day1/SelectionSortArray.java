package week3.day1;

import java.util.Arrays;

import org.junit.Test;

public class SelectionSortArray {

	@Test
	public void positive() {
		int[] num = { 11,4,17,18,2,22,1,8};
		selectionSortArr1(num);
	}
	@Test
	public void positive1() {
		int[] num = { 10000,600,500,45,23,7890};
		selectionSortArr1(num);
	}
	
	@Test
	public void edge() {
		int[] num = { 4,4,4,4,4,4,4,4};
		selectionSortArr1(num);
	}

	@Test
	public void negative() {
		int[] num = { 1,2,3,4,5,6};
		selectionSortArr1(num);
	}
	@Test
	public void negative1() {
		int[] num = { };
		selectionSortArr1(num);
	}
	/*
	 * Selection sort
	 * Finding position ---> outer loop ---> 0 to num.length-2 since we will not swap the last index with anything
	 * Finding value to fit in position ---> inner loop --> from i+1 till num.length-1 
	 * Find the minimum value and swap it with the current position.
	 */
	// Time complexity --> O(n^2)
	// Space Complexity --> O(1)
	private void selectionSortArr(int[] num) {
		int temp;
		//int min=0;
		//loop to pick the pivot(position)
		for(int i=0;i<=num.length-2;i++) {
			for(int j=i+1;j<=num.length-1;j++) {
				//min=num[i];
				if(num[i]>num[j]) {
					temp=num[i];//2
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(num));
		
	}
	// 11,4,17,18,2,22,1,8
	private void selectionSortArr1(int[] num) {
		int temp;
		int min=0;
		//loop to pick the pivot(position)--> last index will be sorted automatically
		for(int i=0;i<=num.length-2;i++) {
			min=i;//0
			for(int j=i+1;j<=num.length-1;j++) {
				if(num[min]>num[j]) {
					min=j;//6
				}
			}
			temp=num[i];
			num[i]=num[min];
			num[min]=temp;
		}
		System.out.println(Arrays.toString(num));
		
	}
}
