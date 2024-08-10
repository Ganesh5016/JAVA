package javaprogram;
import java.io.*;
public class Printvowel {
	public static void main(String[] args)
		throws IOException
	{
		String str = "konda";
		str = str.toLowerCase();
		System.out.println("vowels:");
		for (int i = 0; i < str.length(); i++) 
		{
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e'
				|| str.charAt(i) == 'i'
				|| str.charAt(i) == 'o'
				|| str.charAt(i) == 'u') 
			{
				System.out.println(str.charAt(i));
			}
		}
		System.out.println("consonent:");
		for (int i = 0; i < str.length(); i++) 
		{
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e'
				|| str.charAt(i) == 'i'
				|| str.charAt(i) == 'o'
				|| str.charAt(i) == 'u') 
			{
				continue;
			}
			else
			{
				System.out.println(str.charAt(i));
			}
		}
	}
}
