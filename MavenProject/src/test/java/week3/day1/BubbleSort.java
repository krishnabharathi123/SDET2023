package week3.day1;

import java.util.Arrays;

import org.junit.Test;

public class BubbleSort {

	@Test
	public void positive() {
		int[] num = { 11,4,17,18,2,22,1,8};
		bubbleSortArr(num);
	}

/*
 * bubble sort-->moving heavy elements to the right
 * outer loop has to be executed num.length-1 times
 * inner loop has to be executed to compare the bubble and take the heavy element to the right.
 * inner loop should start from 0 and end with nums.length-1-i ==> -1 Ex:for 3 elements 2 swapping. 
 * -i==> bcz once heavy element is moved to right..from the next iteration no need to compare the moved element
 * 
 */
	private void bubbleSortArr(int[] num) {
		int max=num.length-1;//8
		for(int i=0;i<=max;i++) {
			//int left=i;
			//int right=i+1;
			int temp;
			for(int j=0;j<=max-1-i;j++) {
				if(num[j]>num[j+1]) {
					temp=num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
				}
			}
			
		}
		System.out.println(Arrays.toString(num));
		
	}
	public void bubbleSort(int[] num) {
		for (int i = 0; i < num.length; i++) {
		      System.out.print(num[i] + ", ");
		    }
		    System.out.println();
	}
}
