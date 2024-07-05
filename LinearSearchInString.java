class LinearSearchInString
{
	public static void main(String[] args)
	{
		String name="yasirajmal";
		char target='i';
		boolean ans=searchByForLoop(name,target);
		System.out.println(ans);
	}


	static boolean searchByForLoop(String name,char target)
	{
		//if length of string is zero then return false
		if(name.length()==0)
		{
			System.out.println("Length of the string is zero that's why returning false");
			return false;
		}

		char[] ch=name.toCharArray();
		int length=ch.length;
		for(int i=0;i<length;i++)
		{
			if(target==ch[i])
			{
				System.out.println("Character is found that's why returning true");
				return true;
			}
		}

			
		// if character not found then return false
		System.out.println("Character not found that's why returning false");
		return false;
	}
}