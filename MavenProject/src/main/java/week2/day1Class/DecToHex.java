package week2.day1Class;

public class DecToHex {

	public static void main(String[] args) {
		int num = -12;
		if (num >= 0) {
			String hexaDecimalValue = convertPositiveNo(num, 16);
			System.out.println(hexaDecimalValue);
		} else {
			String hexaDecimalValue = convertNegativeNo(num);
			System.out.println(hexaDecimalValue);
		}
	}

	private static String convertNegativeNo(int num) {
		// multiplying negative number with -1
		num = num * -1;
		// Convert the no to binary
		String binaryVal = convertPositiveNo(num, 2);
		// Find 2's complement to the number
		TwosComplement(binaryVal);

		return null;
	}

	private static void TwosComplement(String binaryVal) {

		/*
		 * Started form 1 to 28 since 4 numbers already exists for(int i=1;i<=28;i++) {
		 * binaryVal=0+binaryVal; }
		 */

		// Add 0s before the number to make the number of length 32
		for (int i = binaryVal.length(); i <= 32; i++) {
			binaryVal = 0 + binaryVal;
		}

		onesComplement(binaryVal);

	}

	private static void onesComplement(String binaryVal) {
		// Replace all 1 with 0 and 0 with 1
		String onesComp = "";
		for (int i = 0; i < binaryVal.length(); i++) {
			if (binaryVal.charAt(i) == '0') {
				onesComp = onesComp + 1;
			} else {
				onesComp = onesComp + 0;
			}
		}
		//onesComp="1111";
		System.out.println(onesComp);
		addingOne(onesComp);

	}

	private static void addingOne(String onesComp) {
		boolean bVal = true;
		String addOne="";
		for (int j = onesComp.length() - 1; j >= 0; j--) {
			if(bVal && onesComp.charAt(j)=='0') {
				addOne="1"+addOne;
				bVal=false;
			}
			else if(!bVal) {
				addOne=onesComp.charAt(j)+addOne;
			}
			else {
				addOne="0"+addOne;
			}
		}

		System.out.println(addOne);

	}

	public static String convertPositiveNo(int num, int base) {

		int rem;
		String Val = "";

		while (num > 0) {
			rem = num % base;
			num = num / base;
			// appending at the staring
			Val = hex(rem) + Val;
		}
		return Val;

	}

	private static String hex(int rem) {
		switch (rem) {
		case 10:
			return "A";
		case 11:
			return "B";
		case 12:
			return "C";
		case 13:
			return "D";
		case 14:
			return "E";
		case 15:
			return "F";
		// if the remainder is number then u can print number itself but to return as
		// string , appending with ""
		default:
			return rem + "";
		}
	}

}
