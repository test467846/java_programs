class OrderAgnosticBinarySearch
{
	public static void main(String[] args)
	{
		//int[] arr={-19,-8,0,2,5,6,9,11,14,20,22};
		int[] arr= {20,18,15,13,10,6,4,2,-11,-16};
		int target=-17;
		int ans= orderAgnosBS(arr,target);
		System.out.println("The index of the target element is: "+ans);
	}


	static int orderAgnosBS(int[] arr,int target)
	{
		int start=0;
		int end=arr.length-1;
		boolean isAsc=arr[start]<arr[end];

		while(start<=end)
		{
			//find mid element
			int mid= start + (end-start)/2;

			if(target == arr[mid])
			{
				return mid;
			}
			if(isAsc)
			{
				if(target < arr[mid])
				{
					end=mid+1;
				}
				else if(target > arr[mid])
				{
					start=mid+1;
				}
			}
			else
			{
				if(target < arr[mid])
				{
					start= mid+1;
				}
				else if(target > arr[mid])
				{
					end= mid-1;
				}
			}
		}
		return -1;
	}


}