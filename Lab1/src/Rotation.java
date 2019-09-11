import java.util.Scanner;

/*Mercy Salome Jemutai
 * Lab 1
 * MW 12:30-1.45PM 
 * CSC 172
 */
public class Rotation {

	
	//isRotation which takes two strings as input and decides if one string is a rotation of the other.
	//For example, ‘cdeab’ is a rotation of ‘abcde’.
	
	public static boolean iSRotation(String x, String y) {
		
		//of course length has to be same
		if(x.length()==y.length()) {
			
			//if same length check if substring (two) exists in concatenated string
			//concatenated string
			String concat= x+x;
			if (concat.indexOf(y) != -1) {
				
				return true; 
				
			}	
		
			
		}
		
		
		
		
		
		return false;
			
	}

	public static void main(String[] args) {
		System.out.println("Enter two strings to check if rotations of each other");
		Scanner in = new Scanner(System.in);
		
		//takes two string as input from the user and prints whether one string is the rotation of the other.

		String m = in.next();
		String n = in.next();
		
		if(iSRotation(m,n)) {
			System.out.println("The strings are a rotation of each other");
		}
		else {
			System.out.println("The strings are NOT a rotation of each other");
			
		}
		
		
		in.close();

	}

}