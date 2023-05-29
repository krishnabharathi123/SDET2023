package classroom.week1.day5;

import java.util.Arrays;

import org.junit.Test;

public class RemoveElement {

	@Test
	public void positive() {
		int[] nums = { 3, 2, 2, 3 };
		int val = 3;
		removeElement1(nums, val);

	}

	@Test
	public void edge() {
		int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };
		int val = 2;
		removeElement1(nums, val);
	}

	@Test
	public void negative() {
		int[] nums = { 0,1,2,4,5 };
		int val = 6;
		removeElement1(nums, val);

	}
	 public void removeElement(int[] nums, int val) {
	        int left = 0;
			int right = nums.length - 1;
			int temp;
			while (left <= right) {
				if (nums[left] == val && nums[right] != val) {
					
					nums[left++] = nums[right--];
					
				} else if (nums[left] != val && nums[right] == val) {
					left++;
					right--;
				} else if (nums[left] != val)
					left++;
				else
					right--;
			}
			System.out.println(left);
			System.out.println(Arrays.toString(nums));
	    }
	 
	 public void removeElement1(int[] nums, int val) {
	        int left = 0;
			int right = nums.length - 1;
			int temp;
			while (left <= right) {
				if (nums[left] == val && nums[right] != val) {
					nums[left++] = nums[right--];
				}
				else if(nums[left] != val) left++;
				else right --;
			}
			System.out.println(left);
			System.out.println(Arrays.toString(nums));
	    }
	
}
