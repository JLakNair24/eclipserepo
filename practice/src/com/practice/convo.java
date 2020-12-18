package com.practice;

import java.util.Scanner;

public class convo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int a;
   String s;
   Scanner scan=new Scanner(System.in);
   System.out.println("Enter a num:");
   a = scan.nextInt();
   s=Integer.toBinaryString(a);
   System.out.println(a);
	}

}
