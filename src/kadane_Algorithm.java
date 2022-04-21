import java.util.Scanner;

public class kadane_Algorithm {
	public static void kadanealgo(int[] arr ,int n)
	{ 
		int a,b,sum=0;
		int max = 0;
		for(a=0;a<n;a++)
		{ 
			sum = sum+arr[a];
			if(sum > max)
			{
				max = sum;
			}
			
			if(sum<0)
			{
				sum = 0;
			}
				
		}
		System.out.println(max);

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
		
		
		kadanealgo(arr,n);
		

	}

}
