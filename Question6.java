package javaassignment2;

public class Question6 {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
        int n = arr.length;
        int k = 3;
        
        int[] temp;
         
        temp =  new int[n];
        
        for(int i=0;i<5;i++)
        {
        	System.out.print(arr[i] +" ");
        }
        
        System.out.println();
        
        for(int i=0; i<k; i++)
            temp[i] = arr[i];
    
        int x = k;
        for(int i=0; x < n; i++)
        {
            arr[i] = arr[x++];
        }
        
        x = 0;
    
        for(int i=n-k; i<n; i++)
            arr[i] = temp[x++];
    
   
        for (int i = 0; i < 7; i++)
            System.out.print(arr[i] + " ");
    }
}