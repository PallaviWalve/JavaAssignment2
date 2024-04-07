//Java Program for Sorting first half in Ascending order and second half in
//Descending order
//Example
//Input : arr[6] = [1, 90, 34, 89, 7, 9]
//Output : 1 7 9 90 89 34
package assignment2;
//import java.sql.Array;
import java.util.Arrays;
public class Question4 {

	public static void main(String[] args) {
		int arr[]= {2,4,1,6,5,3},i;
		for(i=0;i<6;i++)
		{
			Arrays.sort(arr);
			int start=arr.length/2;
			int end=arr.length-1;
			while(start<end)
			{
				int temp=arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
				start++;
				end--;
			}
			for(i=0;i<arr.length;i++)
			{
				System.out.print(" "+arr[i]);
			}
			
		}
	}

}
