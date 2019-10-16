package org.java;

public class LowUpDigSpl {
	public static void main(String[] args) {
		String str="Welcome To JAVA Clas @ 12345";
		int lc=0,up=0,dig=0,spl=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isLowerCase(ch)) {
				lc++;
			}
			else if(Character.isUpperCase(ch)) {
				up++;
			}
			else if(Character.isDigit(ch)) {
				dig++;
			}
			else {
				spl++;
			}
		}
		System.out.println("lc"+lc);
		System.out.println("up"+up);
		System.out.println("dig"+dig);
		System.out.println("spl"+spl);
		
		
		
		
		
	}

}
