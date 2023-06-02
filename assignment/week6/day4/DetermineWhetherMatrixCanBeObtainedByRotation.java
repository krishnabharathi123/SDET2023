package week6.day4;

import java.util.Arrays;

import org.junit.Test;

public class DetermineWhetherMatrixCanBeObtainedByRotation {

	@Test
	public void example1() {
		int mat[][]= {{0,1},{1,0}};
		int target[][]= {{1,0},{0,1}};
		System.out.println(rotationMatrix(mat, target));
	}


	@Test
	public void example2() {
		int mat[][]= {{0,1},{1,1}};
		int target[][]= {{1,0},{0,1}};
		System.out.println(rotationMatrix(mat, target));
	}
	
	@Test
	public void example3() {
		int mat[][]= {{0,0,0},{0,1,0},{1,1,1}};
		int target[][]= {{1,1,1},{0,1,0},{0,0,0}};
		System.out.println(rotationMatrix(mat, target));
	}
	
	private boolean rotationMatrix(int[][] mat, int[][] target) {
		int size=mat.length; //n*n matrix
		int i=0,j=size-1;
		while(i<size) {
			if(Arrays.equals(mat[i], target[j])) {
				i++;
				j--;
			}
			else return false;
					
			}
		return true;
	}
}
