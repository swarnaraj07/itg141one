
public class NumberFormat_demo {
	public static void main(String args[]) {
		try
		{
			int num = Integer.parseInt("yamu");
			System.out.println(num);
			
		}catch(NumberFormatException e) {
			System.out.println("Number format exception");
		}
		
	}

}
