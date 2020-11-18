
/**
 * Write a description of class P2J2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Set;
import java.util.*;
import java.util.HashSet;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Character;
public class P2J2{
 
    public static String removeDuplicates(String text) {
        StringBuilder str = new StringBuilder();
        char p = 0;
        for (int i = 0;i <text.length();++i){
        char curr = text.charAt(i);
        if (p == 0) {str.append(curr);p = curr; continue;}
        else if (p != curr) {str.append(curr);p = curr;}
        else {p= curr;}
       
        }
       
        //System.out.println(text);
        return str.toString();
    }
    
	public static String uniqueCharacters(String text) {
		Set <Character> mySet = new HashSet<Character>();
		StringBuilder s = new StringBuilder();
		for (int i = 0;i < text.length();++i) {
			char curr = text.charAt(i);
			if (mySet.add(curr)!= false) {s.append(curr);}
			mySet.add(curr);
		}
		//System.out.println(s);
		//System.out.println(mySet);
		String S = s.toString();
		return S; } 

		
	public static int countSafeSquaresRooks (int n, boolean[][] rooks) {
		//Establish my arrays given the lengths
		boolean [] row = new boolean[n];
		boolean [] col = new boolean[n];
		// Fill the array with True Values
		Arrays.fill(row, true );
		Arrays.fill(col, true );
		
		
		// iterate over the number of rows and columns to mark the rook in the our array.
		for (int r = 0; r < n; r++) {
			for (int c = 0;c < n ;c++) {
				if (rooks [r][c]) {row [r] = false; col [c] = false;}
				}
			}
		
		//Creating a int variable to sum all true
		int count = 0;
				
		//iterate to count how many safe positions there are
		for (int r = 0; r < n; r++) {
			for (int c = 0;c < n ;c++) {
				if (row[r] && col[c]) {
					count++;}
				}
			}
		//the count for all the safe space avaliable
		
		return count;
		}
    
    
    
  //public static void main4(String[] args) {
    
    //long total = fallingPower(5,2);
      
    //String a = "hello";
    //char c = a.charAt(0);
    //System.out.println(c);
    //fallingPower(8,8);
    //String a = "";
   // removeDuplicates(a);
    //System.out.println("hello"); 
   // String text = a;
    
    
    //for (int i = 0; (i - 1) < text.length();++i) {
    //  char curr = text.charAt(i);
    //  char next = text.charAt(i+1);
    //  char prev = text.charAt(i-1);
        
    //  System.out.println(curr + next + prev);
   // }
  }
