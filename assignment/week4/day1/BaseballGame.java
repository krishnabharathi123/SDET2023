package week4.day1;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class BaseballGame {

	@Test
	public void example1() {
		String[] ops= {"5","2","C","D","+"};
		baseBall2(ops);
	}

	@Test
	public void example2() {
		String[] ops= {"5","-2","4","C","D","9","+","+"};
		baseBall2(ops);
	}

	@Test
	public void example3() {
		String[] ops= {"1","C"};
		baseBall2(ops);
	}
	//"5","-2","4","C","D","9","+","+"
	private void baseBall(String[] ops) {
		List<Integer> ls=new LinkedList<Integer>();
		int val;
		int size=-1;
		for(int i=0;i<ops.length;i++) {
			char charAt = ops[i].charAt(0);
			int num=Integer.parseInt(ops[i]);
			System.out.println(num);
			if(Character.isDigit(charAt)) {
				
				ls.add(Integer.parseInt(ops[i]));
				size++;
			}
			/*else if(charAt=='C') {
				//ls.remove(i-1);
				ls.remove(size);
				size--;
			}
			else if(charAt=='D') {
				val=2*(ls.get(size));
				ls.add(val);
				size++;
				
			}
			else if(charAt=='+') {
				val=ls.get(size)+ls.get(size-1);
				ls.add(val);
				size++;
			}*/
		}
		System.out.println(ls);
	}
	/*
	 * Using Linkedlist inbuild function with try catch block
	 */
	private void baseBall1(String[] ops) {
		List<Integer> ls=new LinkedList<Integer>();
		int val;
		int size=-1;
		int sum=0;
		for(int i=0;i<ops.length;i++) {
			
			try {
			int num=Integer.parseInt(ops[i]);
			//System.out.println(num);
				ls.add(Integer.parseInt(ops[i]));
				size++;
			}
			catch(NumberFormatException e) {
				char charAt = ops[i].charAt(0);
				if(charAt=='C') {
				//ls.remove(i-1);
				ls.remove(size);
				size--;
			}
			else if(charAt=='D') {
				val=2*(ls.get(size));
				ls.add(val);
				size++;
				
			}
			else if(charAt=='+') {
				val=ls.get(size)+ls.get(size-1);
				ls.add(val);
				size++;
			}
			}
			
		}
		for (Integer in : ls) {
			sum=sum+in;
		}
		System.out.println(sum);
	}
	//using switch
	private void baseBall2(String[] ops) {
		List<Integer> ls=new LinkedList<Integer>();
		int val;
		int size=-1;
		int sum=0;
		for(int i=0;i<ops.length;i++) {
			
			try {
			int num=Integer.parseInt(ops[i]);
				ls.add(Integer.parseInt(ops[i]));
				size++;
			}
			catch(NumberFormatException e) {
				char charAt = ops[i].charAt(0);
				switch(charAt) {
				  case 'C':
					  ls.remove(size);
						size--;
				    break;
				  case 'D':
					  val=2*(ls.get(size));
						ls.add(val);
						size++;
				    break;
				  case '+':
					  val=ls.get(size)+ls.get(size-1);
						ls.add(val);
						size++;
				}
			}
			
		}
		for (Integer in : ls) {
			sum=sum+in;
		}
		System.out.println(sum);
	}
}
