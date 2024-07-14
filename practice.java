package week03;

import java.util.Arrays;

public class practice {

	public static void main(String[] args) {
	//	int length = 5;
	//	int width = 10;
	//	int perimeter = ((length + width) *2) ;
	//	System.out.println(perimeter);
		
	//	int[] arr = new int[5];
	//	for ( int i = 1; i <= 5; i++){
	//	    arr[i - 1] = i;
	//	}
	//	System.out.println(arr[2]);
		
		//int[] arr1 = {-11, 43, 901, 43, -5};

		//arr1[arr1.length - 2] = 0;

		//for (int n : arr1){
		//    System.out.print(n + " ");
		    
	//	    int[] arr1 = { -11, 43, 901, 72, -5};
	//	    int[] arr2 = arr1.clone();

	//	    System.out.println(arr2[3]);
		    
		    System.out.println("Question 19");
		    
		    int a = 3;
		    int b = 4;
		    
		    if (a > 2 && b > 2) {
		    	int [][] arr = new int [a] [b];
				for ( int row = 0; row < a; row++ ) {
					for(int col = 0; col < b; col++ ) {
						arr[row][col]=col;
					} 
					System.out.println(arr[0][arr[0].length - 1]);
					}	
		    } else {
		    	System.out.println("Both numbers need to be greater than 2.");
		    }
	}
		    

	

     	    
	 			
			
	    }
		



	

