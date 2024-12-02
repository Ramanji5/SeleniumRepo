package dineshjavapractice;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter String value to be reversed :");
		String input=sc.nextLine();
		char[] arr=input.toCharArray();
		String rev="";
		for(int i=input.length()-1;i>=0;i--) 
		{
		rev=rev+input.charAt(i);	
		}
		System.out.println(rev);
	}

}
