package org.java;

public class Amstrong {
	public static void main(String[] args) {
		int a,b,count=0;
		//int n=153,rem=0,sum=0,c=0;
		for(int i=1;i<=1000;i++) {
			int c=0,sum=0,rem=0;
			 a=i;
			 b=i;
			 while(a!=0) {
				a/=10;
				c++;
			}
			while(b!=0) {
				rem=b%10;
				sum+=Math.pow(rem, c);
				b/=10;
			}
			if(i==sum) {
				System.out.println(i+"amstrong");
				count++;
			}
	
		}
		System.out.println(count);
	}

}
