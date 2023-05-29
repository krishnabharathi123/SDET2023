package assignment.week4.day1;
import java.util.LinkedList;
import java.util.List;
import stackImplementation.StackInt;
import org.junit.Test;

public class BaseBallGame {
	@Test
	public void example1() {
		String[] ops= {"5","2","C","D","+"};
		baseBallUsingStack(ops);
	}

	
	public void example2() {
		String[] ops= {"5","-2","4","C","D","9","+","+"};
		baseBallUsingStack(ops);
	}

	//@Test
	public void example3() {
		String[] ops= {"1","C"};
		baseBallUsingStack(ops);
	}
	//"5","-2","4","C","D","9","+","+"
	//Not working because -2 is not considerd as a digit
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
	//Using Linkedlist inbuild function with try catch block and switch Statement
	/*
	 * Add the values in the list when the value is a number
	 * else if value is 'C' remove previous value from the list
	 * else if value is 'D' add 2*previous value and store it in the list
	 * else if value is '+' add last index value and last index-1 value in the list
	 * Add all the values in the list and return the output
	 */
	//Time Complexity --> O(n)
	//Space Complexity --> O(n)
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
	//"5","2","C","D","+"
	private void baseBallUsingStack(String[] ops) {
		StackInt st=new StackInt();
		int val;
		int size=-1;
		int sum=0;
		for(int i=0;i<ops.length;i++) {
			//If you find the character of string as number, push into the stack
			try {
			int num=Integer.parseInt(ops[i]);
			System.out.println(num);
			st.push(num);
				//ls.add(Integer.parseInt(ops[i]));
				size++;
			}
			
			
			
		catch(NumberFormatException e) {
				char charAt = ops[i].charAt(0);
				switch(charAt) {
				//If you find the character 'C', pop from the stack
				  case 'C':
					  st.pop();
					  //ls.remove(size);
						size--;
				    break;
				 //If you find the character 'D' peek the last value and multiply by 2 and push it into the stack
				  case 'D':
					  val=2*(st.peek(1));
					  //val=2*(ls.get(size));
					  st.push(val);
						//ls.add(val);
						size++;
				    break;
				    //If you find the character '+' peek the last and last-1 value and add it and push it into the stack
				  case '+':
					val= st.peek(0)+st.peek(1);
					 // val=ls.get(size)+ls.get(size-1);
					 st.push(val);
						//ls.add(val);
						size++;
				}
			}
			
		}
		/*for (Integer in : ls) {
			sum=sum+in;
		}*/
		for(int i=st.size();i>0;i--) {
			//sum=sum+st.pop();
			System.out.println(st.peek(2));
		}
		//System.out.println(sum);
		
	}
}
