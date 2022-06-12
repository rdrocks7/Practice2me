// Write a program to find trailing zero in factorial of a  given number n

import java.util.Scanner;
public class Factorial {
	static int count = 0;
	public static void main (String [] args)
	{
		System.out.println("Enter the number:\t");
		Scanner sc= new Scanner (System.in);
		int n = sc.nextInt();
		int sum =1;
		for(int i=n; i>0; i--)
		{
			sum = sum *i;
		}
		int rd = count_digit(sum);
		System.out.println("factorial =" + sum);
		/*for (int j = 0; j<rd; j++)
		{
			if (sum%10 ==0)
				count++;
			sum = sum/10;				
		}*/
		int arr[] = new int [rd];
		for (int j = 0; j<rd; j++)
		{
			arr[j] = sum%10;
			sum = sum/10;
		}
		for(int z=0; z<arr.length;z++)
		{
			if (arr[z]==0)
				count++;
			else
				break;
		}
			
		System.out.println("Number of zeros = "+ count);
	}
	
	public static int count_digit(int m)
	{
		String num = Integer.toString(m);
		int x = num.length();
		return x;
	}
}
