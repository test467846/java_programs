class MaxInArray
{
	public static void main(String[] args)
	{
		int[]arr={12,14,15,19,4,31,5,9};
		int max=searchMax(arr);
		System.out.println("Maximum Number in the given array is: "+max);
	}

	static int searchMax(int[] a)
	{
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		return max;
	}
}