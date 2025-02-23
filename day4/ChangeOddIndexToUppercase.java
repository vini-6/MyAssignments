package week1.day4;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "changeme";
		char tst[]=test.toCharArray();
		for(int i=0;i<=tst.length-1;i++) {
			if(i%2!=0) {
				char k=tst[i];
				//char L=;
				System.out.print(Character.toUpperCase(k));
			}
			else if(i%2==0) {
			
			System.out.print(tst[i]);}
			
		}
	
	}

	
	}

