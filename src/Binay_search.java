//Binary Search
//1. Time Complexity: O(log N) - In Binary Search, the search cuts down to half as we only have to look up to the middle of the array. And we are constantly shortening down our search to the middle of the section where the element is present.
//2. Space Complexity: O(1)
//- We are not using any extra space so the space complexity will be O(1).
import java.util.Scanner;

public class Binay_search {
	
	public static int binary_search(int[] arr,int start, int end, int k)
	{
		if(start<=end)
		{
			int mid = start+ (end-start)/2;
			
			if(k == arr[mid] )
			{
				return mid+1;
			}
			else if (k > arr[mid])
			{
				return binary_search(arr,mid+1,end,k);
			}
			
			else
			{
				return binary_search(arr,start,mid-1,k);
			}
		}
		
		
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = sc.nextInt();
		int[] arr;
		arr = new int [n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter k:");
		int k = sc.nextInt();
		
		int number = binary_search(arr,0,n,k);
		
		System.out.println(number);	

	}

}
