package org.java;

public class CountOfVowNonVow {
	public static void main(String[] args) {
		String str="Welcome To corE jAvA";
		String string=str.toLowerCase();
		int vow=0,nonvow=0,c=0;
		for(int i=0;i<string.length();i++) {
			char ch=string.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vow++;
			}
			else if(ch==' '){
				c++;
			}
			else {
				nonvow++;
			}
		}
		System.out.println("vow"+ vow+" , "+"nonvow"+ nonvow);
	}

}
