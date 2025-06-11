package Day5;
import java.io.FileWriter;
import java.io.InvalidObjectException;

public class Task_3 {

	public static void main(String[] args) { 
		try {
			FileWriter fw = new FileWriter("//C://Users//admin//Desktop//f1.txt");
			fw.write("FINAL DESTINATION");
			fw.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
