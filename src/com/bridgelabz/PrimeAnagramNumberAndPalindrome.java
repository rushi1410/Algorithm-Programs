package com.bridgelabz;
import java.util.ArrayList;

public class PrimeAnagramNumberAndPalindrome {
	static boolean isPrime(int n)
	{
		int i=2;
		while(i<=n/2)
		{
			if(n%i==0)
				return false;
			i++;
		}
		
		return true;
		
	}
	
	static boolean isPalindrome(String s1)
	{
		String s2="";
		for (int i = 0; i < s1.length(); i++) 
		{
				s2=s1.charAt(i)+s2;
		}
		return s1.equals(s2);
	}
	
	
	private static boolean isAnagram(String str1, String str2)
	{
				if(str1.length()!=str2.length())
				return false;
				else
				{
					str1=sort(str1);
					str2=sort(str2);
				}
		return compare(str1,str2);
	}

	private static boolean compare(String str1, String str2) 
	{
		char array1[]=str1.toCharArray();
		char array2[]=str2.toCharArray();
		
		for (int i = 0; i < array1.length; i++)
		{
				if(array1[i]!=array2[i])
					return false;
		}
		return true;
	}

	private static String sort(String str1) 
	{
		char sort[]=str1.toCharArray();
		for (int i = 0; i < sort.length; i++)
		{
				for (int j = 0; j < sort.length; j++) 
				{
						if(sort[i]>sort[j])
						{
							char temp=sort[i];
							sort[i]=sort[j];
							sort[j]=temp;
						}
				}
		}
		return String.valueOf(sort);
	}
	
	public static void main(String[] args) 
	{
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 2; i < 1000; i++) 
		{
			if (isPrime(i) && isPalindrome(String.valueOf(i)))
				al.add(i);
		}

		System.out.println("Prime and polindrome numbers within 1000 are: ");

		System.out.println(al);

		System.out.println("Prime and polindrome numbers are: ");
		
		
		System.out.println("Prime and polindrome  and Anagram numbers within 1000 are: ");
		int count=0;
		for (int i = 0; i < al.size(); i++) 
		{
			boolean res = false;
			for (int j = 0; j <= 1000; j++) 
			{
					res = isAnagram(al.get(i).toString(), String.valueOf(j));

				if (res)
				{
					System.out.println(al.get(i));
					count++;
					break;
				}// + "-->" + j);
			}
		}
		System.out.println("Count: "+count);
		System.out.println("Total prime numbers: "+al.size());
		 
	
	}

}
