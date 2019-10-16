package org.java;

import java.util.Scanner;

public class SumOddEven {
	public static void main(String[] args) {
		int odd=0,even=0;
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		for(int i=0;i<num;i++) {
			int n= scan.nextInt();
		
		if(n%2==0) {
			even=n+even;
		}
		else {
			odd=n+odd;
		}
		}
		System.out.println("odd"+odd+"  ,  "+"even"+even);
	}
	

}
