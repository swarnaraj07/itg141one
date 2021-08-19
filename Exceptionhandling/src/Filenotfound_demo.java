import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.File;

public class Filenotfound_demo {
	public static void main(String args[])
	{
		try
		{
			File a=new File("c://file.txt");
			FileReader fr = new FileReader(a);
		}
		catch(FileNotFoundException e) {
		System.out.println("file does not exist");
	}
	}

}
