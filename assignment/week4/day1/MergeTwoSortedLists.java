package assignment.week4.day1;

import org.junit.Test;

import linkedListImplementation.LinkedList;
import linkedListImplementation.Node;

public class MergeTwoSortedLists {

	@Test
	public void example1() {
		
		LinkedList ls1= new LinkedList();
		ls1.insert(1);
		ls1.insert(2);
		ls1.insert(4);
		//ls1.displayInString();

		LinkedList ls2= new LinkedList();
		ls2.insert(1);
		ls2.insert(3);
		ls2.insert(4);
		//ls2.displayInString();

		mergeSortedList(ls1,ls2);
	}
	
	@Test
	public void example2() {
		
		LinkedList ls1= new LinkedList();
		
		//ls1.displayInString();

		LinkedList ls2= new LinkedList();
		
		//ls2.displayInString();

		mergeSortedList(ls1,ls2);
	}
	
	@Test
	public void example3() {
		
		LinkedList ls1= new LinkedList();
		
		//ls1.displayInString();

		LinkedList ls2= new LinkedList();
		ls2.insert(0);
		//ls2.displayInString();

		mergeSortedList(ls1,ls2);
	}
	
	@Test
	public void example4() {
		
		LinkedList ls1= new LinkedList();
		ls1.insert(0);
		//ls1.displayInString();

		LinkedList ls2= new LinkedList();
		
		//ls2.displayInString();

		mergeSortedList(ls1,ls2);
	}
	
	@Test
	public void example5() {
		
		LinkedList ls1= new LinkedList();
		ls1.insert(1);
		ls1.insert(2);
		ls1.insert(4);

		LinkedList ls2= new LinkedList();
		
		ls2.insert(3);

		mergeSortedList(ls1,ls2);
	}

	public class ListNode {
		     int val;
		     ListNode next;
		     ListNode() {}
		     ListNode(int val) { this.val = val; }
		     ListNode(int val, ListNode next) { this.val = val; this.next = next; 
		 }
		 }
	
	private Node mergeSortedList(LinkedList ls1, LinkedList ls2) {
		LinkedList ls3= new LinkedList();
		int left=0;
		int right=0;
		int lSize=ls1.size();
		int rSize=ls2.size();
		
		while(left<lSize && right<rSize) {
			if(ls1.get(left)<=ls2.get(right)) {
				ls3.insert(ls1.get(left++));
				//ls3.insert(ls2.get(right++));
			}
			else {
				ls3.insert(ls2.get(right++));
				//ls3.insert(ls1.get(left++));
			}
		}
		
		while(left<lSize) {
			ls3.insert(ls1.get(left++));
		}
		while(right<rSize) {
			ls3.insert(ls2.get(right++));
		}
		ls3.displayInString();
		
		Node headNode=ls3.getHeadNode(ls3.get(0));		
		return headNode;
		
		//return 
	}
}
