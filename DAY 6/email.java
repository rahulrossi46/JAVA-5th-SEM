package arraylist;

import java.util.HashSet;

public class Email {
	
	public static void main(String[] args) {
		HashSet<String> stuemail=new HashSet();
		stuemail.add("ronaldo@gmail.com");
		stuemail.add("messi@gmail.com");
		stuemail.add("viart@gmail.com");
		for(String g:stuemail)
		{
			System.out.println(g);
		}
	}
}
