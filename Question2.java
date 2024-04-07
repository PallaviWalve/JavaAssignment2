//Program to check Harshad number or not using Java
//Hint: - Harshad number is a number or an integer in base 10 which is
//completely divisible by sum of its digits.
//Example :
//Suppose a number 24 . Calculate the sum of digits of the number (2 +
//4) = 6 .
//Check whether the number entered by user is completely divisible by
//sum of its digits or not.
package assignment2;
import java.util.Scanner;
public class Question2 {

	public static void main(String[] args) {
		int n;
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Enter the number");
	     n=sc.nextInt();
	     int temp=n;
	     int sum=0;

	     while(temp>0)
	     {
	    	 sum+=temp%10;
	    	 temp=temp/10;
	     }
	  
	     System.out.println(sum);
	   
		if(n%2==0)
		{
			System.out.println("divisible ");
		}
		else
		{
			System.out.println("not divisible");
		}
	}

}
