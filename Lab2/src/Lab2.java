import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * 
 * JAVA GENERICS AND HOW TO CONVERT ANY NON - GENERIC METHOD INTO A GENERIC ONE
 */


public class Lab2 {

	//1. A static printArrayNonGen() method with an array of Objects as parameter.
	public static void printArrayNonGen(Object[] obj) {

		System.out.print("{");

		//if an item exists in the array print the first
		if(obj.length>=1) {
			System.out.print(obj[0]);
		}

		for(int i=1;i<obj.length;i++) {

			System.out.print(","+obj[i]);


		}

		System.out.print("}");
		System.out.println();
	}

	//2.  static printArray() method using method overloading. Implement four versions of printArray(), 
	//one for each array type.
	public static void printArray(Integer[] intArr) {
		System.out.print("{");


		if(intArr.length>=1) {
			System.out.print(intArr[0]);
		}

		for(int i=1;i<intArr.length;i++) {

			System.out.print(","+intArr[i]);


		}

		System.out.print("}");
		System.out.println();


	}
	public static void printArray(Double[] doubArr) {
		System.out.print("{");


		if(doubArr.length>=1) {
			System.out.print(doubArr[0]);
		}

		for(int i=1;i<doubArr.length;i++) {

			System.out.print(","+doubArr[i]);


		}

		System.out.print("}");
		System.out.println();


	}
	public static void printArray(Character[] charArr) {

		System.out.print("{");


		if(charArr.length>=1) {
			System.out.print(charArr[0]);
		}

		for(int i=1;i<charArr.length;i++) {

			System.out.print(","+charArr[i]);


		}

		System.out.print("}");
		System.out.println();

	}
	public static void printArray(String[] strArr) {



	}

	//3. Implement a single static method printArrayGen() that uses the generic
	//programming technique to support all 4 array types and maintain type safety.

	public static<T> void printArrayGen(T[] t) {
		System.out.print("{");


		if(t.length>=1) {
			System.out.print(t[0]);
		}

		for(int i=1;i<t.length;i++) {

			System.out.print(","+t[i]);


		}

		System.out.print("}");
		System.out.println();

	}
	//4. Using non-generic techniques, implement a static method getMax() that takes an
	//array of type Comparable and returns the maximum element in the array.

	public static Comparable  getMax(Comparable[] arr) {
		//set a temporary max
		Comparable max = arr[0];

		for(int i=1;i<arr.length;i++) {
			//if max is greater than next , return max, else keep comparing by setting max to ith element
			if(arr[i].compareTo(max) >0)
				max =arr[i];

		}

		return max;


	}

	//5. Using the generic techniques to specify super-class relationships, implement a type
	//safe version of the method in 4 named getMaxGen().

	public static <T extends Comparable<T>> T getMaxGen(T[] arr){
		T max = arr[0];
		for(T type:arr) {
			if(type.compareTo(max)>0)
				max = type;
		}


		return max;



	}

	public static void main(String[] args) throws FileNotFoundException {
		//https://stackabuse.com/reading-a-file-line-by-line-in-java/

		//read file
		Scanner scanner = new Scanner(new File("data.txt"));


		//create arrayList to store each line of the file separately
		ArrayList<String> list = new ArrayList<String>();


		//while there is a next line
		while(scanner.hasNextLine()) {


			list.add(scanner.nextLine());



		}

		//String[] arrA = scanner.nextLine().split("\\s");

		//get line then split at the space
		String[] arrA  = list.get(0).split("\\s");
		String[] arrB  = list.get(1).split("\\s");
		String[] arrC  = list.get(2).split("\\s");
		String[] arrD  = list.get(3).split("\\s");



		scanner.close();

		//Initialize array  of the types Integer, Character... etc of given size
		Integer[] intArray = new Integer[arrA.length];
		Double[] doubArray = new Double[arrB.length];
		Character[] charArray = new Character[arrC.length];
		String[] strArray = new String[arrD.length];


		//input the items into their respective array, while converting to their specific types
		for(int i=0;i<arrA.length;i++){intArray[i] = Integer.parseInt(arrA[i]);}
		for(int i=0;i<arrB.length;i++){doubArray[i] = Double.parseDouble(arrB[i]);}
		for(int i=0;i<arrC.length;i++){charArray[i]=arrC[i].charAt(0);}
		for(int i=0;i<arrD.length;i++){strArray[i]=arrD[i];}




		//Integer [] intArray = {1, 2, 3, 4, 5 };
		//Double [] doubArray = {1.1, 2.2, 3.3, 4.4};
		//Character [] charArray = {'H','E','L', 'L', 'O' };
		//String [] strArray = {"once", "upon", "a", "time" };


		printArrayNonGen(intArray);
		printArrayNonGen(doubArray);
		printArrayNonGen(charArray);
		printArrayNonGen(strArray);

		printArray(intArray);
		printArray(doubArray);
		printArray(charArray);
		printArray(strArray);


		printArrayGen(intArray);
		printArrayGen(doubArray);
		printArrayGen(charArray);
		printArrayGen(strArray);

		System.out.println(getMax(intArray));
		System.out.println(getMax(doubArray));
		System.out.println(getMax(charArray));
		System.out.println(getMax(strArray));

		System.out.println(getMaxGen(intArray));
		System.out.println(getMaxGen(doubArray));
		System.out.println(getMaxGen(charArray));
		System.out.println(getMaxGen(strArray));
	}

}
