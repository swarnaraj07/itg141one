
public class ArrayOutOfBound_demo {
	public static void main (String args[]) {
		try {
			int a[] = new int[5];
			a[9]= 10;
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
