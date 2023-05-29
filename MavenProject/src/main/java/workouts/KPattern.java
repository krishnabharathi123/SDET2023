package workouts;

public class KPattern {

	public static void main(String[] args) {
		int n = 3;
		for (int i = 1; i <= n; i++) {
			System.out.print("*");

			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}
		for (int i = n-1; i >=1; i--) {
			System.out.print("*");

			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}

	}

}
