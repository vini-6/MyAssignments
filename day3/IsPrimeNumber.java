package week1.day3;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = -12;
		if (n > 0) {
			for (int i = 1; i < n; i++) {
				System.out.println("The number is a n");
				System.out.println(n);
				System.out.println(i);
				if (n % i == 0) {

					System.out.println("The number is a non prime Number-->" + n);
					break;
				} else {
					System.out.println("The number is a prime Number-->" + n);
				}

			}
		} else {
			System.out.println("The number is a Negative Number-->" + n);
		}
	}
}
