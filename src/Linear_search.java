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
