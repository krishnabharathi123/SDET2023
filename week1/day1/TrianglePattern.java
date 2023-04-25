package week1.day1;

public class TrianglePattern {

	public static void main(String[] args) {

		int n = 5;
		int m = 9;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				
				if((i==0&&j==n/2)|| 
						(i==1 && (j==n/2-i  || j==n/2+i))|| (i==2 && (j==n/2   || j==n/2-i || j==n/2+i))||
						(i==3 && (j==n/2-i || j==n/2+1 || j==n/2+i || j==n/2-1)))				{
				
					System.out.print("*");
				}
				else if(i==4 && j==n/2   && j==n/2-2 && j==n/2+2  && j==n/2-i && j==n/2+i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}

	}

}
