package firstPackage;

/*
 * This application gives the user 4 choices to perform 4 different
 * operations on a given string. 
 * 1.Add the given string to itself
 * 2.Add * at every alternate positions
 * 3.Remove the duplicate characters
 * 4.Capitalize every alternate character
 */

import java.util.Scanner;

public class StringOperations {

	public String stringOperations(String s, int op)
	{
		String r = "";
		switch(op)
		{
			case 1:
				r = s+s;
				break;
			case 2:
				for(int i=0;i<s.length();i++)
				{
					if(i%2!=0)
					{
						r=r+"*";
					}
					else
					{
						r+=s.charAt(i);
					}
				}
				break;
			case 3:
				int count=0;
				for(int i=0;i<s.length();i++)
				{
					count=0;
					for(int j=0;j<s.length();j++)
					{
						if(s.charAt(i)==s.charAt(j))
							count++;
					}
					if(count==1)
						r += s.charAt(i);
				}
				break;
			case 4:
				for(int i=0;i<s.length();i++)
				{
					if(i%2==0)
					{
						if(s.charAt(i)<='z' && s.charAt(i)>='a')
						{
							r+= (char)(s.charAt(i)-32);
						}
						else
							r+=s.charAt(i);
					}
					else
					{
						r+= s.charAt(i);
					}
				}
				break;
			default:
				r="Invalid Input";
		}
		return r;
	}
	
	public static void main(String[] args) {
		
		StringOperations so = new StringOperations();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String inputString = s.nextLine();
		System.out.println("Choose an option\n1.Add the given string to itself\n"
						 + "2.Add * at alternate positions\n"
						 + "3.Remove the duplicate characters\n"
						 + "4.Capitalize alternate character");
		int option = Integer.parseInt(s.nextLine());
		System.out.println(so.stringOperations(inputString, option));
		s.close();
	}
}


