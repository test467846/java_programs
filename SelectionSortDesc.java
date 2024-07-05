import java.util.Arrays;

class SelectionSortDesc
{
	public static void main(String[] args)
	{
		int[]arr={3,1,5,4,2};
		selectionDesc(arr);
		System.out.println(Arrays.toString(arr));
	}
	
		
	static void selectionDesc(int[]arr)
	{
		for(int i=arr.length-1;i>=0;i--)
		{
			int last=i;
			int minIndex=getMinIndex(arr,0,last);
			swap(arr,minIndex,last);
		}
	}

	
	static int getMinIndex(int[] arr, int start,int last)
	{
		int min=start;
		for(int i=1;i<=last;i++)
		{
			if(arr[min]>arr[i])
			{
				min=i;
			}
		}
		return min;
	}

	
	static void swap(int[] arr,int first,int second)
	{
		int temp=arr[first];
		arr[first]=arr[second];
		arr[second]=temp;
	}



}