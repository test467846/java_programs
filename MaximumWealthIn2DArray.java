class MaximumWealthIn2DArray
{
	public static void main(String[] args)
	{
		int[][] arr={{1,2,4},{3,4,6},{4,1,3}};
		int max=maxWealth(arr);
		System.out.println(max);
	}


	static int maxWealth(int[][] arr)
	{
		int ans=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			int sum=0;
			for(int j=0;j<arr[i].length;j++)
			{
				sum=sum+arr[i][j];
			}
			System.out.println("The sum of the "+i+"th row is: "+sum);
			if(sum>ans)
			{
				ans=sum;
			}
		}

		return ans;
	}
}
				