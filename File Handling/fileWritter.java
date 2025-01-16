import java.io.FileWriter;
import java.io.IOException;

public class fileWritter {
    public static void main(String[] args) {
        try{
            FileWriter f=new FileWriter("C:\\Users\\pandi\\OneDrive\\Desktop\\GitHub\\OOPs-Concepts\\File Handling\\lc.txt");
            try{
                f.write("Java Programming is the best language....");
            }
            finally{
                f.close();
            }
            System.out.println("Successfully write");
        }
        catch(IOException i){
            System.out.println(i);
        }

    }
}

