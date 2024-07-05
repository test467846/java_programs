class EqualityCheckArrays
{
	public static void main(String[] args)
	{
		int[] a= {2,3,1,7,4};
		int[] b= {2,3,1,7,4};
		equalityCheck(a,b);
	
	}

	static void equalityCheck(int[] a, int[] b)
	{
		boolean equalOrNot=true;
		if(a.length == b.length)
		{
			for(int i=0;i<a.length;i++)
			{
				if(a[i]!=b[i])
				{
					equalOrNot=false;
				}
			}
		}
		else
		{
			equalOrNot=false;
		}

		if(equalOrNot)
		{
			System.out.println("Arrays are Equal");
		}
		else
		{
			System.out.println("Arrays are not Equal");
		}
	}

					
				
					











}