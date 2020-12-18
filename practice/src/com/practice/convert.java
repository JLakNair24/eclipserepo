package com.practice;

public class convert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
			int a;
			String s;
			System.out.println("Enter a Number:");
			a=Integer.parseInt(args[0]);
			s=Integer.toBinaryString(a);
			System.out.println(s);
			s=Integer.toOctalString(a);
			System.out.println(s);
			s=Integer.toHexString(a);
			System.out.println(s);
			}
		}


