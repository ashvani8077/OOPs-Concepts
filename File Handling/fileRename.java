import java.io.File;
import java.io.FileReader;

public class fileRename {
    
    public static void main(String[] args) {
        File f=new File("C:\\Users\\pandi\\OneDrive\\Desktop\\GitHub\\OOPs-Concepts\\File Handling\\lc.txt");

        File r=new File("C:\\Users\\pandi\\OneDrive\\Desktop\\GitHub\\OOPs-Concepts\\File Handling\\lc.txt");

        if(f.exists()){
            System.out.println(f.renameTo(r));
        }
        else{
            System.out.println("File does not exists");
        }
    }
}

