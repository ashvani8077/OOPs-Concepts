import java.io.File;

public class fileInfo {
    public static void main(String[] args) {
        File f=new File("C:\\Users\\pandi\\OneDrive\\Desktop\\GitHub\\OOPs-Concepts\\File Handling\\newFile.txt");
        if(f.exists()){
            System.out.println("FileName: "+f.getName());
            System.out.println("FilePath: "+f.getAbsolutePath());
            System.out.println("Can we write: "+f.canWrite());
            System.out.println("Can we read: "+f.canRead());
            System.out.println("File Size: "+f.length());
        }
        else{
            System.out.println("File doesn't exists....");
        }
    }
}
