//if we tried to perform any operation on object which is null then it raises nullpointer exception
public class Nullpointer_demo {
	public static void main(String args[])
	{
		try
		{
			String a = null;
			System.out.println(a.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("NullPointerException");
		}
		System.out.println("hello");
	}
}
