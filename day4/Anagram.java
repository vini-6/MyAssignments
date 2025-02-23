package week1.day4;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = "stops";
		String text2 = "potss";
		char txt1[]=text1.toCharArray();
		char txt2[]=text2.toCharArray();

		Arrays.sort(txt1);
		Arrays.sort(txt2);
		
		if(txt1.length==txt2.length) {
			
			for(int i=0,j=0;i<=txt1.length-1&&j<=txt1.length-1;i++,j++) {
				txt1[i]=txt2[j];
			}
			System.out.println("The given two numbers are Anagram");
			
		}
		else {
			System.out.println("The given two numbers are not an Anagram");
		}
	}

}
