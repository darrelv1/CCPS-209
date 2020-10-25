package labbing;
import java.util.*;

public class Lab0 {
	
	  public static int[] everyOther(int[]arr){
		int [] arrN  = new int [0];
		for (int i  = 0; i <= arr.length; ++i){
		float var = i%2; 

		if (var == 0 ){
		  arrN  = Arrays.copyOf(arrN, arrN.length+1);
		  arrN[i] = arr[i];
		}
		 else {
			continue;
		}
		}Arrays.toString(arrN);return arrN;
		}
	  	
	 	public static void main (String[] args) {
			int [] random = {1,2,3,4,5,6,7,8,9,10};
			Lab0.everyOther(random);}

	

}
