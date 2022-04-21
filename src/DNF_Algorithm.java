import java.util.Scanner;

public class DNF_Algorithm {

	public static int[] dnf_sort(int[] arr, int n)
	{
		int low = 0,mid = 0,high = n-1;
		while(mid<=high)
		{
			if(arr[mid] == 0)
			{
				int temp = arr[low];
				arr[low] = arr[mid];
				arr[mid] = temp;
				
				mid++;
				low++;
			}
			
			if(arr[mid] == 2)
			{
				int temp = arr[high];
				arr[high] = arr[mid];
				arr[mid] = temp;
				
				mid++ ; 
				high--;
			}
			
			else
			{
				mid++;
			}
			
		}
		
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Take INPUT
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = sc.nextInt();
		int[] arr;
		arr = new int [n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		dnf_sort(arr,n);
		
		// Give OUTPUT
		for(int k=0;k<n;k++)
		{
			System.out.println(arr[k]);
		}
		

	}

}
