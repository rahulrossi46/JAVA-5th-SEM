import java.io.BufferedReader;
import java.io.FileReader;
class main{
    public static void main(String[] args)
    {
        String filepath="F:/courses/readfile.txt";

        try (BufferedReader br = new BufferedReader(new FileReader("F:/courses/readfile.txt"))){
        String line;
        while(( line =br.readLine()) != null)
        {
            System.out.println(line);
        }
        }
            catch(Exception e)
            {
                System.out.println(e);                                                                          
            }
      
    }
}