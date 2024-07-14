package week03;

public class Week03ArraysAndMethodsLab {

	private static Object at2;
	private static Object charAt;


	public static void main(String[] args, Object at) {
		// Arrays:
		//
		
		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
		//int[] array = {1, 5, 2, 8, 13, 6, -5};
	/*	values[0] = 1;
		values[1] = 5;
		values[2] = 2;
		values[3] = 8;
		values[4] = 13;
		values[5] = 6;*/
		
		// 2. Print out the first element in the array
		//System.out.println(array[0]);
			
		// 3. Print out the last element in the array without using the number 5
		//System.out.println(array[array.length-1]);	
		
		// 4. Print out the element in the array at position 6, what happens?
		//System.out.println(array[6]); - out of bounds Array 0-5, 6 > 5
		
		// 5. Print out the element in the array at position -1, what happens?
		//System.out.println(array[-1]); out of bounds Array 0-5, -1 < 0
		
		// 6. Write a traditional for loop that prints out each element in the array
		//for (int i = 0; i < array.length; i++ ) {
		//	System.out.println(array[i]);
		//}
		
		// 7. Write an enhanced for loop that prints out each element in the array
		//for (int number : array) {
		//	System.out.println(number);
		//}		
		// 8. Create a new variable called sum, write a loop that adds 
		//			each element in the array to the sum
		//int sum = 0;
		//for (int number : array){
		//	sum += number;
		//	System.out.println(sum);
		//}			
		// 9. Create a new variable called average and assign the average value of the array to it
		//int average = sum / array.length;
				
		// 10. Write an enhanced for loop that prints out each number in the array 
		//			only if the number is odd
		//for (int number : array) {
		//	sum += number;
		//	if (number % 2 == 1) {
		//		System.out.println(number + "!");
		//	}
		//}
		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
		String[] names = {"Sam", "Sally", "Thomas", "Robert"};
		
		// 12. Calculate the sum of all the letters in the new array
		int sumOfLetters = 0;
		
		for (String firstName : names) {
			sumOfLetters += firstName.length();
		}
		System.out.println(sumOfLetters);
	
		// Methods:
			
		// 13. Write and test a method that takes a String name and prints out a greeting. 
		//			This method returns nothing.
		greet("Lisa");	
		
		
		// 14. Write and test a method that takes a String name and  
		//			returns a greeting.  Do not print in the method.
		System.out.println(greet2("Nick"));
		
		// Compare method 13 and method 14:  
		//		a. Analyze the difference between these two methods.
		//		b. What do you find? 
		//		c. How are they different?
			
		// 15. Write and test a method that takes a String and an int and 
		//			returns true if the number of letters in the string is greater than the int
		System.out.println(isStringLongerThanNumber("Hello", 3));	
		
		// 16. Write and test a method that takes an array of string and a string and 
		//			returns true if the string passed in exists in the array
		System.out.println(doesArrayContainString(names, "Sam"));
		
		// 17. Write and test a method that takes an array of int and 
		//			returns the smallest number in the array
		//System.out.println(findSmallestNumber(array));
	
		
		// 18. Write and test a method that takes an array of double and 
		//			returns the average
		double [] doubles = { 1.50, 2.75, 2.25, 3.00, 0.50};
		System.out.println(findAverage(doubles));
		

		// 19. Write and test a method that takes an array of Strings and 
		//			returns an array of int where each element
		//			matches the length of the string at that position
		int[] nameLengths = extractStringLengths(names);
		for (int number : nameLengths) {
			System.out.println(number);
		}
		
		// 20. Write and test a method that takes an array of strings and 
		//			returns true if the sum of letters for all strings with an even amount of letters
		//			is greater than the sum of those with an odd amount of letters.
		System.out.println(hasMoreEvenWordCharacters(names));

	
		// 21. Write and test a method that takes a string and 
		//			returns true if the string is a palindrome
			System.out.println(isPalindrome("wow"));
	}
	//method 13
	public static void greet(String name) {
		System.out.println("Hello, " + name + "!");
	}
	//method14
	public static String greet2(String name) {
		return "Hola, " + name + "!";
	}
	//method 15
	public static boolean isStringLongerThanNumber(String string, int number) {
		return (string.length() > number) ;
	}
	//method 16
	public static boolean doesArrayContainString(String[] array, String string) {
		for (String str : array) {
			if (str.equals(string)) {
				return true;
			}
		}
		return false;
	}
	//method 17
	public static int findSmallestNumber(int[] numbers) {
		int smallest = numbers[0];
		for (int number : numbers) {
			if (number < smallest) {
				smallest = number;
			}
			}
		return smallest;
	}
	//method 18c
	public static double findAverage(double[] array) {
		double sum =0;
		for (double number : array) {
			sum += number;
		}
		return sum / array.length;
	}
	
	public static int[] extractStringLengths(String[] strings) {
		int[] results = new int[strings.length];
		for (int i = 0; i <strings.length; i++) {
			results[i] = strings[i].length();
		}
		return results;
	}
	public static boolean hasMoreEvenWordCharacters(String[]array) {
		int evenLetters = 0;
		int oddLetters = 0;
		for (String string : array) {
			if (string.length() % 2 == 0 ) {
				evenLetters += string.length();
		}	else {
			oddLetters += string.length();
		}
		}
		return evenLetters > oddLetters;
	}

	
	public static boolean isPalindrome(String string) {
		for (int i = 0; i < string.length() / 2; i++) {
			if (string.charAt(i) != string.charAt(string.length() -i -1)) {
				return false;
			}
		}
		return true;
	}
	
      
	
	
	
	
	}
	
	
	


