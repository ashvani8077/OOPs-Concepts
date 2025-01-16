import java.io.FileReader;
import java.io.IOException;

public class fileReader {
    public static void main(String[] args) {
        try{
            FileReader f=new FileReader("C:\\Users\\pandi\\OneDrive\\Desktop\\GitHub\\OOPs-Concepts\\File Handling\\lc.txt");
            try{
                int i=0;
                while((i=f.read())!=-1){
                    System.out.print((char)i);
                }
            }
            finally{
                f.close();
            }
        }
        catch(IOException i){
            System.out.println(i);
        }
    }
}
