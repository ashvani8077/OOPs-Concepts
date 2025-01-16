import java.io.File;
import java.io.IOException;
class createFile{
    public static void main(String[] args) {
        File f=new File("C:\\Users\\pandi\\OneDrive\\Desktop\\GitHub\\OOPs-Concepts\\File Handling\\newFile.txt");
        try{
            if(f.createNewFile()){
                System.out.println("File created");
            }
            else{
                System.out.println("File already exists...");
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}