package workouts;

import org.junit.Test;

public class Test1 {
	
	/*
	 * @Test public void example1() { int[] nums= {4,3,2,1};
	 * System.out.println(arrayProduct(nums));
	 * 
	 * }
	 */
	public static void main(String[] args)
	{
		int[] nums= {4,3,2,1};
		int num1=Integer.MIN_VALUE;//0
		int num2=Integer.MIN_VALUE;//0
		for (int i = 0; i < nums.length; i++) 
		{
			if (nums[i]>num1)
			{
				num1=nums[i];
			}else if (nums[i]>num2) 
			{
				num2=nums[i];
			}
			}
		
		System.out.println((num1-1) * (num2-1));

	}

}
