package df;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		fibbonaci(13);
		fibbonaci(10);
		System.out.println(reverseString("teste"));

	}
	
	public static void fibbonaci(int n) {
		int[] inits= {0,1};
		for(int i=0;i<n;i++) {
			int sum=inits[0]+inits[1];
			inits[0]=inits[1];
			inits[1]=sum;
			if(inits[1]==n) {
				System.out.println("O número pertence a sequência");
				return;
			}
		}
		System.out.println("O número não pertence a sequência");
	}
	
	public static String reverseString(String string) {
		char[] charArray = string.toCharArray();
		String newString = "";
		for(int i=charArray.length-1; i>=0;i--) {
			newString+=charArray[i];
		}
		return newString;
	}
}
