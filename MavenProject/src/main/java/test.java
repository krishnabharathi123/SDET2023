
public class test {

	public static void main(String[] args) {
		String onesComp="1111";
		 String output = "";
		    boolean carry = true;
		    for (int i = onesComp.length() - 1; i >= 0; i--) {
		      if (!carry) {
		        output = onesComp.charAt(i) + output;
		      } else if (carry && onesComp.charAt(i) == '0') {
		        output = '1' + output;
		        carry = false;
		      } else {
		        output = '0' + output;
		      }
		    }
		    if(carry) {
		      output = '1'+ output;
		    }
		    System.out.println(output);


	}
	
	

}
