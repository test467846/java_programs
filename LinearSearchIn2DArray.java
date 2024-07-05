import java.util.Arrays;
class LinearSearchIn2DArray
{
	public static void main(String[] args)
	{
		int[][] arr={{1,3,5},{2,4,8},{6,9,10}};
		int target=11;
		int[] ans=search(arr,target);
		System.out.println(Arrays.toString(ans));
	}

	static int[] search(int[][]arr,int target)
	{
		if(arr.length==0)
		{
			return new int[]{Integer.MIN_VALUE,Integer.MAX_VALUE};
		}
		
		for(int r=0;r<arr.length;r++)
		{
			for(int c=0;c<arr[r].length;c++)
			{
				if(arr[r][c]==target)
				{
					return new int[]{r,c};
				}
			}
		}
		

		return new int[]{-1,-1};

	}

}