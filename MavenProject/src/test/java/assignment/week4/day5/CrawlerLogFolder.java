package assignment.week4.day5;

import org.junit.Test;
import stackImplementation.StackInt;

public class CrawlerLogFolder extends StackInt{

	@Test
	public void example1() {
		String[] logs = {"d1/","d2/","../","d21/","./"};
		System.out.println(minOperations(logs));
	}
	
	@Test
	public void example2() {
		String[] logs = {"d1/","d2/","./","d3/","../","d31/"};
		System.out.println(minOperations(logs));
	}
	
	@Test
	public void example3() {
		String[] logs = {"d1/","../","../","../"};
		System.out.println(minOperations(logs));
	}
	//stop if u are already in main folder i.e top==0
	private int minOperations(String[] logs) {
		StackInt st=new StackInt();
		
		for(int i=0;i<logs.length;i++) {
		 //if(top!=0) {
			if(logs[i]=="./") {
				
			}
			else if(logs[i].equals("../") && st.size!=0) {
				st.pop();
			}
			//can push anything
			else {
				st.push(1);
			}
		}
		//}
	//	System.out.println(st.size());
		return st.size();
	}
}
