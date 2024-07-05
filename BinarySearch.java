class BinarySearch
{
	public static void main(String[] args)
	{
		int[] arr={-19,-8,0,2,5,6,9,11,14,20,22};
		int target=6;
		int ans= searchNum(arr,target);
		System.out.println("The index of the target element is: "+ans);
	}

	static int searchNum(int[] arr,int target)
	{
		int start=0;
		int end=arr.length;
		
		while(start<end)
		{
			//find middle index
			int mid=start+(end-start)/2;

			if(target == arr[mid])
			{
				return mid;
			}

			if(target < arr[mid])
			{
				end=mid-1;
			}
			else if(target > arr[mid])
			{
				start=mid+1;
			}
		}

		return -1;
	}

}