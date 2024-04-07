//Java program to count numbers of even and odd elements in an array

package javaassignment2;

public class Question5 {

	public static void main(String[] args) {
		int arr[]= {1,5,1,2,6,3};
		int Count1=0;
		int Count2=0;
		
		for(int i=0;i<6;i++)
		{
			if(arr[i]%2==0)
			{
				Count1++;
			}
			else {
				Count2++;
			}
		}
		System.out.println("Even Numbers : "+Count1);
		System.out.println("Odd Numbers : "+Count2);
	}

}
