package internalAssessment;

import org.junit.Test;

public class ReverseStrings {
	@Test
	public void example1(){

	String str="hello";
	reverseVowels(str);
	}

	@Test
	public void example2(){

	String str="lEetcode";
	reverseVowels(str);
	}

	@Test
	public void example3(){

	String str="abcd";
	reverseVowels(str);
	}

	@Test
	public void example4(){

	String str="AeIoU";
	reverseVowels(str);
	}

	@Test
	public void example5(){

	String str="XYZ";
	reverseVowels(str);
	}

	//Time Complexity --> O(n/2)-->O(n)
	//Space Complexity --> O(n)
	public String reverseVowels(String str){
	
	int left=0;
	int right=str.length()-1;
	char temp;
	StringBuilder sb = new StringBuilder(str);
	
	while(left<=right){
	
	if(isVowel(sb.charAt(left)) && isVowel(sb.charAt(right))){
		
		temp=sb.charAt(right);
		sb.setCharAt(right--,sb.charAt(left));
		sb.setCharAt(left++,temp);
		
	}
	else if(!isVowel(sb.charAt(left))){
		left++;
	}
	else if(!isVowel(sb.charAt(right))){
		right--;
	}
	}
	
	System.out.println(sb.toString());
	return sb.toString();

}

	public boolean isVowel(char ch){
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
		return true;
	}
	
	return false;
}
}
