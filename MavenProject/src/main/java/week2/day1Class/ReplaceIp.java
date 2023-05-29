package week2.day1Class;

public class ReplaceIp {

	public static void main(String[] args) {
		/*
		 * Given a valid IP address, return a defanged version of that IP address. A
		 * defanged IP address replaces every period "." with "[.]". Do Not Use the
		 * replaceAll() Example 1: Input: address = "1.1.1.1" Output: "1[.]1[.]1[.]1"
		 */

		// input="1.1.1.1";
		// output="1[.]1[.]1[.]1";

		// ***************************************************************
		// solution 1 ---> using replace
		String address = "1.1.1.1";
		address = address.replace(".", "[.]");
		System.out.println(address);

		// ***************************************************************
		// solution 2---> using split , traversing array and concatenating
		String address1 = "1.1.1.1";
		String add = "";
		String[] split = address1.split("\\.");

		for (int i = 0; i < split.length; i++) {
			add = add + (split[i] + "[.]");
		}
		System.out.println(add);

		// ****************************************************************************************
		// solution 3 ---> using loop

		String address2 = "1.1.1.1";
		String output = "";
		for (int i = 0; i < address2.length(); i++) {
			if (address2.charAt(i) == '.') {
				// System.out.println("true");
				output = output + "[.]";
				continue;
			} else {
				output = output + address2.charAt(i);
			}

		}
		address2 = output;
		System.out.println(address2);

	}

}
