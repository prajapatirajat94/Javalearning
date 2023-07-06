package utiliy;
import java.io.*;

public class FilereadingPra {



    public static void main(String[]args) throws IOException {


File file = new File("C:\\Users\\s2743085\\OneDrive - The Bank of Nova Scotia\\Documents\\ProjectRunRajat\\Test.txt");

        FileReader f1 = new FileReader(file);

        BufferedReader br = new BufferedReader(f1);
        String st;
        String temp ="";
        while((st=br.readLine())!= null){
          temp=temp+st+","+"\n";
        }
        System.out.println(temp);
        System.out.println( temp.contains("i am Software Tester"));

        
    }
}
