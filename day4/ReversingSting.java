package week1.day4;

public class ReversingSting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String companyName = "TestLeaf";
		char arr[] = companyName.toCharArray();
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
	}
	
	
	
}
