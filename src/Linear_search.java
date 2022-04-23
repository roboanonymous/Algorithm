// Linear Search
//Time Complexity: O(N) - Since in linear search, we traverse through the array to check if any element matches the key. In the worst-case scenario, the element will be present at the end of the array so we have to traverse through the end, and hence the time complexity will be O(N) where N is the total number of array elements.
//2. Space Complexity: O(1) - We are not using any extra space so the space complexity will be O(1).
import java.util.Scanner;

public class Linear_search {
	
	public static int linear_search(int[] arr, int n, int k)
	{
		for(int j=0;j<n;j++)
		{
			if(arr[j] == k)
			{
				return j+1;
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
		
		int number = linear_search(arr,n,k);
		
		System.out.println(number);
		

	}

}
