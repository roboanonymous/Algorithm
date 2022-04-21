import java.util.Scanner;

public class Bubble_Sort {
	public static void Bubble_sort(int[] arr , int n)
	{
		for(int j= 0;j<n-1;j++)
		{
			for(int l=0;l<n-j-1;l++)
			{
				if(arr[l]>arr[l+1])
				{
					int temp = arr[l];
					arr[l] = arr[l+1];
					arr[l+1] = temp;
				}
			}
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
		
		Bubble_sort(arr,n);
		
		// Give OUTPUT
		for(int k=0;k<n;k++)
		{
			System.out.println(arr[k]);
		}
		

	}

}
