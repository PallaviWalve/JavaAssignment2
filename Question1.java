//Find the Fibonacci Series up to Nth Term in Java Language
//a. Method 1: Using Iteration (Using Three variables)
//b. Method 2: Using Recursion
//c. Method 3: Using Formula a[i]=a[i-1]+a[i-2] (Using Array)

package assignment2;

public class Question1 {

		public static void main(String[] args) {
			int arr[],c;
			
			arr=new int[8];
			arr[0]=0;
			arr[1]=1;
			
			System.out.print(arr[0]+" "+arr[1]);
			for(int i=2;i<8;i++)
			{
				arr[i]=arr[i-1]+arr[i-2];
			   System.out.print(" "+ arr[i]);
						
			}

		}

	

	}


