class SubArrayWhoseSumIsNumber
{
	public static void main(String[] args)
	{
		findSubArray(new int[] { 42, 26, 12, 8, 6,15,5,6}, 26);
		findSubArray(new int[] { 12, 5, 31, 13, 21, 8 }, 49);
		findSubArray(new int[] { 15, 51, 7, 81, 5, 11, 25 }, 41);
	}

	static void findSubArray(int[] arr, int n)
	{
		int sum=arr[0];
		int start=0;

		for(int i=1;i<arr.length;i++)
		{
			sum=sum+arr[i];
			
			while(sum > n && start<=i)
			{
				sum=sum-arr[start];
				start++;
			}
			if(sum == n)
			{
				System.out.println("The continuous sub array whose sum is " + n + " is: ");

				for(int j=start; j<=i;j++)
				{
					System.out.print(arr[j]+ " ");
				}
				System.out.println();
			}
		}
	}


}