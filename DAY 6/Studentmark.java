package arraylist;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {

	public static void main(String[] args) {
		HashMap<String,Integer> studentMarks=new HashMap();
		studentMarks.put("john", 100);
		studentMarks.put("messi", 50);
		studentMarks.put("ronaldo", 60);
		int totalMarks=0;
		for(int marks:studentMarks.values()) {
			totalMarks +=marks;
			
		}
		System.out.println("Student Total Marks:"+totalMarks);
		double average=totalMarks / studentMarks.size();
		System.out.println("Student Average Mark:"+average);
		for(Map.Entry<String,Integer> entry : studentMarks.entrySet()) {
			System.out.println(entry.getKey()+ " "+entry.getValue());
		}
	}

}
 