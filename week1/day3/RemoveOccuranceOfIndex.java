package week1.day3;

import java.util.Arrays;

import org.junit.Test;

public class RemoveOccuranceOfIndex {

	@Test
	public void positive() {
		int[] num = { 1, 2, 3, 4, 5, 1 };
		int index = 1;
		removeOcc(num, index);
	}

	@Test
	public void negative() {
		int[] num = { 1, 0, 7, 8, 1 };
		int index = 8;
		removeOcc(num, index);
	}

	@Test
	public void edge() {
		int[] num = { 1, 1, 1, 1, 1 };
		int index = 0;
		removeOcc(num, index);
	}

	private void removeOcc(int[] num, int index) {
		int val = num[index];
		int count=0;
		for(int i=0;i<num.length;i++) {
			if(num[i]==val) {
				count++;
			}
		}
		int[] outArr=new int[num.length-count];
		int j=0;
		for(int i=0;i<num.length;i++) {
			if(num[i]!=val) {
				outArr[j++]=num[i];
			}
		}
		System.out.println(Arrays.toString(outArr));
	}
}
