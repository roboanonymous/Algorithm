//Selection Sort
//Time Complexity O(n^2)


import java.util.Scanner;

public class Selection_Sort {
	public static void Selection_sort(int[] arr, int n )
	{
		int small;
		for(int j=0;j<n;j++)
		{
			small = j;
			for(int l=j+1; l<n; l++)
			{
				if(arr[l]<arr[small])
				{
					small = l;
				}
			}
			int temp = arr[small];
			arr[small] = arr[j];
			arr[j] = temp;
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
		
		Selection_sort(arr,n);
		
		// Give OUTPUT
		for(int k=0;k<n;k++)
		{
			System.out.println(arr[k]);
		}

	}

}
