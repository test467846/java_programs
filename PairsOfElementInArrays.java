import java.util.Arrays;

class PairsOfElementInArrays
{
	public static void main(String[] args)
	{
		findThePairs(new int[] { 4, 6, 5, -10, 8, 5, 20 }, 10);

		findThePairs(new int[] { 4, -5, 9, 11, 25, 13, 12, 8 }, 20);

		findThePairs(new int[] { 12, 13, 10, 15, 8, 40, -15 }, 25);

		findThePairs(new int[] { 12, 23, 10, 41, 15, 38, 27 }, 50);
	}

	static void findThePairs(int[] arr,int n)
	{
		Arrays.sort(arr);

		System.out.println("Pairs of elements whose sum is " + n + " are : ");
		int start=0;
		int end=arr.length-1;
		
		while(start<end)
		{
			if(arr[start] + arr[end] == n)
			{
				System.out.println(arr[start] + " + " + arr[end] + " = " + n);
				start++;
				end--;
			}
			else if(arr[start] + arr[end] < n)
			{
				start++;
			}
			else if(arr[start] + arr[end] > n)
			{
				end--;
			}
		}

	}


}