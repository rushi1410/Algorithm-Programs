package com.bridgelabz;

public class PermutationOfString {
	static int count=0;
	public static void main(String[] args){
		String str = "ABCD";
		int n = str.length();
		PermutationOfString permutation = new PermutationOfString();
		permutation.permutate(str, 0, n-1);
		System.out.println("Number of permutactions for the given string is " + count);
	}

	private void permutate(String str, int firstIndex, int lastIndex){

		if (firstIndex == lastIndex){
			System.out.println(str);
			count++;
		}else{
			for (int i = firstIndex; i <= lastIndex; i++){
				str = swap(str,firstIndex,i);
				permutate(str, firstIndex+1, lastIndex);
				str = swap(str,firstIndex,i);
			}
		}
	}


	public String swap(String a, int i, int j){
		char temp;

		char[] charArray = a.toCharArray();

		temp = charArray[i] ;
		charArray[i] = charArray[j];
		charArray[j] = temp;

		return String.valueOf(charArray);
	}

}
