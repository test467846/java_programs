class MinInArray
{
	public static void main(String[] args)
	{
		int[] arr={12,3,5,9,19,10,4,2};
		int min=searchMin(arr);
		System.out.println("Minimum value in the array is: "+min);
	}


	static int searchMin(int[] arr)
	{
		int min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		return min;

	}

}
