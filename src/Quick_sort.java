//Quick Sort
//Time Complexity average O(n*log n).
//Time Complexity worst O(n^2)
import java.util.Scanner;

public class Quick_sort {
	
	public static int partition(int[] arr, int low, int high)
	{
		int pivot = arr[high];
		int i = low-1;
		
		for(int j=low;j<high;j++)
		{
			if(arr[j] < pivot)
			{
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		i++;
		int temp = arr[i];
		arr[i] = arr[high];
		arr[high] = temp;
		return i;
	}
	
	public static void quick_sort(int[] arr, int low, int high)
	{
		if(low<high)
		{
			int pidx = partition(arr, low, high);
			quick_sort(arr, low, pidx-1);
			quick_sort(arr,pidx+1,high);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = sc.nextInt();
		int[] arr;
		arr = new int [n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		quick_sort(arr,0,n-1);
		
		
		// Give OUTPUT
		for(int k=0;k<n;k++)
		{
			System.out.println(arr[k]);
		}


	}

}
