package workouts;

import org.junit.Test;
import java.util.*;

public class testing {

	@Test
	public void example1() {
		List<Integer> arr=new ArrayList<Integer>();
		arr.add(9);
		arr.add(8);
		arr.add(7);
		arr.add(6);
		arr.add(5);
		arr.add(4);
		arr.add(3);
		arr.add(2);
		arr.add(1);
		arr.add(0);
		
		//List<List<Integer>> operations = new ArrayList<List<Integer>>();
		//operations.add(new ArrayList{0,9});
		
		List<List<Integer>> operations = Arrays.asList(Arrays.asList(0,9),
                 Arrays.asList(4, 5),
                 Arrays.asList(3,6),
                 Arrays.asList(2,7),
                 Arrays.asList(1,8),
                 Arrays.asList(0,9));
		
		List<Integer> out=performOperations(arr,operations);
		System.out.println(out);
		

	}
	
	
	 public static List<Integer> performOperations(List<Integer> arr, List<List<Integer>> operations) {
	        int left=0;
	        int right=0;
	        int temp=0;
	        for(int i=0;i<operations.size();i++){
	            
	           List<Integer> lsop= operations.get(i);//4,5
	           System.out.println(lsop);
	           
	           left=lsop.get(0);
	           right=lsop.get(1);
	          //lsop.remove(right);
	          System.out.println(left);
	          System.out.println(right);
	          while(left<=right){
	              temp=arr.get(right);//0
	              arr.set(right,arr.get(left));//9
	              arr.set(left,temp);//0
	              left++;
	              right--;
	              
	          }
	          System.out.println(arr);
	          
	       //lsop.clear();
	        }
	       
	        
	        return arr;
	        

	    }
}
