package anotherone;

import java.util.Arrays;



public class main {

	  public static int[] everyOther(int[]arr){
		int [] arrN  = new int [0];
		int counter = 0;
		for (int i  = 0; i < arr.length; i++){
		float var = i % 2; 

		if (var == 0 ){
		 
		  arrN  = Arrays.copyOf(arrN, arrN.length+1);
		  arrN[counter] = arr[i];
		  counter +=1;
		  
		}
		 else {
			continue;
		}
		}Arrays.toString(arrN);return arrN;
		}
	  
	  public static int[][] createZigZag(int rows,int cols,int start){
		  int [][] arr = new int[rows][cols];
		  int value = start -1;
		  for (int row = 0; row < rows ;++row) {
			  System.out.println("value inside outer loop:  " + value);
			  System.out.println("row inside outer loop:  " + row);
			  float odd = row % 2;
			  if (odd == 0){
			  for (int col = 0 ;col < cols; col++) {
					  value += 1;
					  arr[row][col]= value;
					  System.out.println("value inside nested loop:  " + value);
					  System.out.println("column inside nested loop:  " + col);
				  } 
			  }
			  else if (odd != 0) {
				  for (int col = (cols -1) ;col >= 0 ; col--) {	
					  System.out.println("value inside ELSE IF  " + value);
					  System.out.println("column inside ELSE IF  " + col);
					  System.out.println("ROW inside ELSE IF  " + row);
					  value += 1;
					  arr[row][col]= value;

				   }
				  }
		  }
		return arr;
		
			  
			  }
	
	  	public static int countInversions(int[] arr) {
	  		int n = arr.length;
	  		int countinv = 0;
	  		for (int i = 0 ; i < n-1; i++) {
	  			for(int y = i +1; y < n;y++) {
	  				if (arr[i] > arr[y]) {countinv += 1;}
	  			}
	  		}return countinv;
	  		
	  		
	  		
	  	}
	  	
	  
	  
	  
	 	public static void main (String[] args) {
			System.out.println("Hello World!");
			int [] random = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
			int [] rrr = {8,4,2,1};
			
			System.out.println(Arrays.toString(main.everyOther(random)));
			System.out.println(main.everyOther(random).length);
			System.out.println(Arrays.deepToString((main.createZigZag(4, 5, 4))));
			System.out.println(2%2);
			System.out.println(countInversions(rrr));
			
}
}