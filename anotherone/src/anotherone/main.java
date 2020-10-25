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
	  	
	 	public static void main (String[] args) {
			System.out.println("Hello World!");
			int [] random = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
			System.out.println(Arrays.toString(main.everyOther(random)));
			System.out.println(main.everyOther(random).length);
			
}
}