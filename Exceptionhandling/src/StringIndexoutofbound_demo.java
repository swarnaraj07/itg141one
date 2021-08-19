
public class StringIndexoutofbound_demo {
	public static void main(String args[])
	{
		try
		{
			String s="miracle software solutions";
			char c = s.charAt(30);
			//charAt() method returns a character at a specific index position in a string. 
			System.out.println(c);
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("StringOutOfBound");
		}
	}
}
