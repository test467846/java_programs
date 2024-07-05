class SecondLargestElementInArray
{

	public static void main(String[] args)
	{
		System.out.println(secondLargest(new int[] {10,13,20,17,25,12,19}));
		System.out.println(secondLargest(new int[] {17,43,29,18,25,12,49}));
		System.out.println(secondLargest(new int[] {51,43,28,47,25,63,55}));
		
	}
	
	static int secondLargest(int[] arr)
	{
		int firstLargest , secondLargest;

		if(arr[0]> arr[1])
		{
			firstLargest= arr[0];
			secondLargest= arr[1];
		}
		else
		{
			firstLargest = arr[1];
			secondLargest= arr[0];
		}

		
		for(int i=2;i<arr.length;i++)
		{
			if(arr[i] > firstLargest)
			{
				secondLargest = firstLargest;
				firstLargest = arr[i];

			}

			else if(arr[i] < firstLargest && arr[i] > secondLargest)
			{
				secondLargest = arr[i];
			}
		}
		return secondLargest;
	}

}