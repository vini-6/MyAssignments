package week1.day3;


public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 12;
		if (n >= 1) {
			
			System.out.println(0);
			
			}  
		 if (n >= 2) {
			System.out.println(1);
		} 
		 if (n > 2) {

			for (int i = 0, j = 2; j <= n + 2; j++) {
				j = j - 1;
				int k = i + j;

				System.out.println(k);
				i = j;
				j = k;

			}
		}
	}
}
