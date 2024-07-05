class SearchInRange
{
	public static void main(String[] args)
	{
		int[] arr={12,1,15,19,4,8};
		int target=12;
		int ans= search(arr,target,1,4);
		System.out.println(ans);
	}

	
	static int search(int[] arr,int target,int start,int end)
	{
		if(arr.length==0)
		{
			return Integer.MIN_VALUE;
		}
		
		for(int i=start;i<=end;i++)
		{
			if(arr[i]==target)
			{
				return i;
			}
		}
		return -1;
	}
}