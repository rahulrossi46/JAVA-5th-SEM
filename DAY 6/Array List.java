package arraylist;
import java.util.ArrayList;
public class ArrayListTask {

	public static void main(String[] args) {
		ArrayList<Object> ar = new ArrayList();
		ar.add("DEPRESSION");
		ar.add('A');
		ar.add("KGCAS");
		ar.add(86.77);
		ar.add(3,65);
		ar.set(4, "gki");
		
		for(Object data:ar)
		{
			System.out.println(data);
		
		}
		
		System.out.println(ar.get(3));
	}

}
