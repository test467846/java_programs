class LinearSearch
{
	public static void main(String[] args)
	{
		int[] arr={12,3,4,19,-1,-14,18,20,0};
		//int[] arr={};
		int target=1;
		//int ans=linearSearch(arr,target);
		int ans =linearElement(arr,target);
		//boolean ans=linearBool(arr,target);
		System.out.println(ans);
	}

	//Return true if element present in the array otherwise return false 
	static boolean linearBool(int[]arr,int target)
	{
		if(arr.length==0)
		{
			return false;
		}

		// if element found then return true
		for(int element:arr)
		{
			if(element==target)
			{
				return true;
			}
		}

		// if element not found then return false
		return false;
	}
		

	//Return element value 
	static int linearElement(int[] arr, int target)
	{
		//if length of an array is zero
		if(arr.length==0)
		{
			return Integer.MAX_VALUE;
		}

		//if element found then return element
		for(int element:arr)
		{
			if(element==target)
			{
				return element;
			}
		}

		// if element not found in the given array
		return Integer.MIN_VALUE;
	}
	


	//Return index of the target element 
	static int linearSearch(int[] arr,int target)
	{
		if(arr.length==0)
		{
			return -1;
		}

		for(int i=0;i<arr.length;i++)
		{
			if(target==arr[i])
			{
				return i;
			}
		}
		// if target is not found in the given array then return -1 as -1 is not the index in any array , array index starts from 0
		return -1;
	}
}