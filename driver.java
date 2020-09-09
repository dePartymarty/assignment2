package assignment2;
import java.util.Scanner;


public class driver 
{
	public static void main(String[] args)
	{
		int count = 0;
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter Book Name: ");
		String s = myObj.nextLine();
		System.out.println("Book Name: " + s);
		for (int i = s.length()-1; i >= 0; i--)
		{
			if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i'|| s.charAt(i) == 'o'|| s.charAt(i) == 'u')
			{
				count++;
			}
		}
		System.out.println(count);
	}
}

