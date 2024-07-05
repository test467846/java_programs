import java.util.*;
class ConcurrentModificationExceptionDemo
{
	public static void main(String [] args)
	{
		ArrayList<Integer> l= new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);

		System.out.println(l);

		Iterator it=l.iterator();
		while(it.hasNext())
		{
			Integer i=(Integer)it.next();
			System.out.println(i);
			l.add(5);
		}

	}
}