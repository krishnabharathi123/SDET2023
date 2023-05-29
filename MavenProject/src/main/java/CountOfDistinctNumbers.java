	
public class CountOfDistinctNumbers {
/*
 * Write a program to find the number of distinct numbers in a sorted array.
	Find the time complexity of this code.
 */
	public static void main(String[] args) {
	
		int arr[]= {0,1,1,2,3,3,4,5};
		int i=1;
		int left =0;
		int right =1;
		
		System.out.println(arr[left]);
		while(right<arr.length) {    //O(n)
			
			if(arr[left]!=arr[right]) {
				i++;
				//System.out.println(arr[left]);
				System.out.println(arr[right]);
			}
			left++;
			right++;
		}
		System.out.println("number of distinict numbers: "+i);
		
		//other solution ----> use hashset ---> but it is an inbuilt function
	}

}
