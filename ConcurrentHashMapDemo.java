
import java.util.concurrent.*;
class ConcurrentHashMapDemo
{
	public static void main(String[] args)
	{
		ConcurrentHashMap m= new ConcurrentHashMap();
		m.put(101,"A");
		m.put(102,"B");
		m.putIfAbsent(101,"C");
		m.putIfAbsent(103,"D");
		m.remove(101,"C");
		m.replace(102,"B","E");

		System.out.println(m);
	}
}