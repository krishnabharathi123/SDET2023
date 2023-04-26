package week1.day3;

import org.junit.Test;

public class PowerOfTwo {

	@Test
	public void positive() {
		int num= 128;
		System.out.println(twoPower1(num));
	}
	
	@Test
	public void negative() {
		int num= 15;
		System.out.println(twoPower1(num));

	}
	
	@Test
	public void edge() {
		int num= 168;
		System.out.println(twoPower1(num));

		
	}
	//not working for even non powers
	private boolean twoPower(int num) {
		int val=1, i=0;
		if(num==1) {
			return true;
		}
		
		else if(num%2==0){
			
			while(val!=num) {
				val=val*2;
				i++;
			}
			System.out.println("2 power "+i);
			return true;
		}
		
		return false;
		
	}
	//not working
	public boolean twoPower1(int num) {
		int val=1;
		if(num==0) {
			return true;
		}
		
		else if(num%2==0){
			while(num>0) {
				num=num/2;
				val=num%2;
				if(num==1 && val==1) {
					return false;
				}
				else if(num==1 && val==0) {
					return true;
				}
				
			}
		}
		
		return false;
		
		
	}
	
	
}
