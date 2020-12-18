package com.practice;
import java.util.Scanner;

public class Convert1 {
  
	    public static void main(String[] args) 
	    
	    {
	    	int i;
			String s;
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter a Number:");
		    i = sc.nextInt();
			s=Integer.toBinaryString(i);
			System.out.println(s);
			s=Integer.toOctalString(i);
			System.out.println(s);
			s=Integer.toHexString(i);
			System.out.println(i);
			System.out.println("hii");
	    }
	    
}
