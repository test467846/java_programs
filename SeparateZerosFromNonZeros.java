import java.util.Arrays;

class SeparateZerosFromNonZeros
{
	public static void main(String[] args)
	{
		moveZerosToEnd(new int[] { 12, 0, 7, 0, 8, 0, 3 });

		moveZerosToEnd(new int[] { 1, -5, 0, 0, 8, 0, 1 });

		moveZerosToEnd(new int[] { 0, 1, 0, 1, -5, 0, 4 });

		moveZerosToEnd(new int[] { -4, 1, 0, 0, 2, 21, 4 });
	}

	static void moveZerosToEnd(int[] arr)
	{
		int start=0;

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] != 0)
			{
				arr[start]=arr[i];
				start++;
			}
		}

		while(start<arr.length)
		{
			arr[start]=0;
			start++;
		}

		System.out.println(Arrays.toString(arr));
	}
}