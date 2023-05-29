package assignment.week3.day2;


	import java.util.ArrayList;
	import java.util.List;

	import org.junit.Test;

	public class MinimumAbsoluteDifference {

		@Test
		public void example1() {
			int[] arr= {4,2,1,3};
			System.out.println(minAbsDiff(arr));
		}

		@Test
		public void example2() {
			int[] arr= {1,3,6,10,15};
			System.out.println(minAbsDiff(arr));
		}
		@Test
		public void example3() {
			int[] arr= {3,8,-10,23,19,-4,-14,27};
			System.out.println(minAbsDiff(arr));
		}
		/*
		 * Brute Force:
		 * Assign Integer.Max to min variable
		 * Outer loop i --> from 0 to arr.length-1
		 * Inner loop j --> from i+1 to arr.length-1
		 * Get the absolute difference between i and j
		 * If the absolute value is lesser than min val, remove the previously added list and add the current i and j to the list
		 * If the absolute value is equal to the min value, add the i and j to existing list 
		 * Add this list in main list
		 * 
		 */
		private List<List<Integer>> minAbsDiff(int[] arr) {
			int min=Integer.MAX_VALUE;
			int diff=0;
			
			
			List<List<Integer>> lst=new ArrayList<List<Integer>>();
			
			for(int i=0;i<arr.length;i++) {
				for(int j=i+1;j<arr.length;j++) {
					diff=Math.abs(arr[i]-arr[j]);
					//4,2,1,3
				
					 if(diff<min) {
						min=diff;
						System.out.println(diff);
						List<Integer> ls=new ArrayList<Integer>();
						if(lst.size()!=0) {
							
							lst.clear();
							//ls.clear();
							System.out.println(lst);
						}
							ls.add(arr[i]);
							ls.add(arr[j]);
							lst.add(ls);
							//System.out.println(lst);
							//Arrays.asList(new Integer[]{arr[i-1],arr[i]})
							
						}
					else if(diff==min) {
						min=diff;
						System.out.println(diff);
						List<Integer> ls=new ArrayList<Integer>();
						//ls.clear();
						ls.add(arr[i]);
						ls.add(arr[j]);
						
						lst.add(ls);
						//.add(ls.get(1));
						//System.out.println(lst);
						
					}
					
					//lst.add(ls);
					
					}
				//System.out.println(lst);
				}
			return lst;
			
				
			}

			
		}


