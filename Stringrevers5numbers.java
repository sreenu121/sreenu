package com.sreenu.sacanner;
import java.util.*;
public class Stringrevers5numbers {

	public static void main(String[] args) {
		Scanner se= new Scanner(System.in);
		  System.out.print("ENTER THE REVERSE NUMBER:");
		     int num = se.nextInt();
		     
		    int rem = num %10;
		    System.out.print( "the rever of:"+rem);
		    num = num /10;
		    rem = num %10;
		    System.out.print(rem);
		    num = num/10;
		    rem = num%10;
		    System.out.print( rem);
		    num = num/10;
		    rem = num %10;
		    System.out.print(rem);
		     num = num/10;
		     System.out.print(num);
		     
	}

}
