package internalAssessment;
import java.util.*;

import org.junit.Test;
public class FlipInvertImage {

	@Test
	public void example1(){

		List<List<Integer>> ls = Arrays.asList(Arrays.asList(1,1,0),Arrays.asList(1,0,1),Arrays.asList(0,0,0));
		System.out.println(flipInvertImage(ls));
	}

	@Test
	public void example2(){

		List<List<Integer>> ls = Arrays.asList(Arrays.asList(1,1,0,0),Arrays.asList(1,0,0,1),Arrays.asList(0,1,1,1),Arrays.asList(1,0,1,0));
		System.out.println(flipInvertImage(ls));
	}
	
	@Test
	public void example3(){

		List<List<Integer>> ls = Arrays.asList(Arrays.asList(1,1,1),Arrays.asList(0,0,0),Arrays.asList(1,1,1));
		System.out.println(flipInvertImage(ls));
	}

	@Test
	public void example4(){

		List<List<Integer>> ls = Arrays.asList(Arrays.asList(0),Arrays.asList(0),Arrays.asList(0));
		System.out.println(flipInvertImage(ls));
	}

	//Time Complexity --> O(n*m)
	//Space Complexity --> O(1)

	public List<List<Integer>> flipInvertImage(List<List<Integer>> ls){

		for(int i=0;i<ls.size();i++){
		
			List<Integer> inLs=ls.get(i);
			int left=0;
			int right=inLs.size()-1;
			int temp;

			while(left<right){		

				temp=inLs.get(right);
				inLs.set(right,inLs.get(left));
				inLs.set(left,temp);
				
				if(inLs.get(left)==0) inLs.set(left,1);
				else inLs.set(left,0);

				if(inLs.get(right)==0) inLs.set(right,1);
				else inLs.set(right,0);

				left++;
				right--;
			
			}
			if(left==right){

				if(inLs.get(left)==0) inLs.set(left,1);
				else inLs.set(left,0);
				//return ls;
			}

		}
		
		return ls;

	}
	
	// 2 pointer in opposite direction
	
	//Time Complexity --> O(n)*O(m+m/2)--> O(m*n)
	//Space Complexity --> O(1)
	
	public List<List<Integer>> flipInvertImage1(List<List<Integer>> ls){
		//Looping the outer
		for(int i=0;i<ls.size();i++){
			
			//get the inner loop and store it in a list
			List<Integer> inLs=ls.get(i);
			
			//loop the inner loop to invert
			for(int j=0;j<inLs.size();j++) {
				
				if(inLs.get(j)==0) inLs.set(j,1);
				else inLs.set(j,0);
				
			}
			
			int left=0;
			int right=inLs.size()-1;
			int temp;
			//loop the inner loop to reverse
			while(left<right){		

				temp=inLs.get(right);
				inLs.set(right,inLs.get(left));
				inLs.set(left,temp);

				left++;
				right--;
			
			}

		}
		
		return ls;

	}
}
