package assignments.week1.day2;

public class PyramidPattern {

	public static void main(String[] args) {

		int n = 10;

		/*
		 * if(n/2==0) { m=n/2; } else {
		 * 
		 * }
		 */
		for (int i = 1; i <= (n / 2) + 1; i++) {
			for (int j = 1; j <= (n / 2) + 1 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = n / 2; i >= 1; i--) {
			for (int j = 1; j <= (n / 2) + 1 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
