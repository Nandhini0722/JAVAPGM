package org.java;

public class RemoveDuplicateFromArray {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,6,4,3,1};
		int[] empty = {};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
					break;
				}
				else {
					empty[i]=arr[i];
				}
			}
			System.out.println(empty);
		}
	}

}
