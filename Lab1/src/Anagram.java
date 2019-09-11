import java.util.Arrays;
import java.util.Scanner;

/*Mercy Salome Jemutai
 * Lab 1
 * MW 12:30-1.45PM 
 * CSC 172
 */
public class Anagram {

	//takes two strings as input and decides if those strings are anagrams or not.
	//An anagram is a word, phrase, or name formed by rearranging the letters of another, 
	//such as “cinema“, formed from “iceman“.

	
	
	
	public static boolean  isAnagram(String x, String y) {
	///Have to be same length
		if(x.length()!=y.length()) 
			//check letters if same
			//change to a character array then sort and compare
			return false;




		char [] x1 = x.toCharArray();
		char[] y1=y.toCharArray();


		Arrays.sort(x1);
		Arrays.sort(y1);

		for(int i=0;i<x.length();i++) {
			if(x1[i]!=y1[i]) {
				return false;
			}

		}



		return true;



	}
	public static void main(String[] args) {
		//Implement the main method which takes two string as input from the user and 
		//prints whether the strings are anagrams
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter two strings to check if they are anagrams");
		String m = in.next();
		String n = in.next();
		
		if(isAnagram(m,n)) {
			System.out.println("Are anagrams");
		}
		else {
			System.out.println("They are not anagrams");
		}
		
in.close();
	}

}