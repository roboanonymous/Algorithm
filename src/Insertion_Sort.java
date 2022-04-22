import java.util.Scanner;

public class Insertion_Sort {
	
	public static void Insertion_sort(int[] arr, int n )
	{
		for(int j=0;j<n;j++)
		{
			int current = arr[j];
			int l = j-1;
			while(l>= 0 && current < arr[l])
			{
				arr[l+1] = arr[l];
				l--;
			}
			
			arr[l+1] = current;
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
		
		Insertion_sort(arr,n);
		
		// Give OUTPUT
		for(int k=0;k<n;k++)
		{
			System.out.println(arr[k]);
		}

	}

}
