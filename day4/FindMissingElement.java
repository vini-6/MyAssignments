package week1.day4;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Input[] = { 1, 4, 3, 2, 8, 6, 7 };
		Arrays.sort(Input);

		for (int i = 0, j = 1; i <= Input[Input.length - 1] - 1 && j <= Input[Input.length - 1]; i++, j++) {// 6
			System.out.println("The " + j);
			if (Input[i] != j) {
				System.out.println("The missing number is -->" + j);
				break;
			}

		}
	}
}
