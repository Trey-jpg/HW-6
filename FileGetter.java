import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class FileGetter

{
    
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner input = new Scanner(new File(System.getProperty("user.dir") + "/src/treyfile.dat"));
        String fileContents = input.nextLine();
        input.close();
        String[] fileParts = fileContents.split(",");
        
        for(String s : fileParts)
        {
            System.out.println(s);
        }
        
        

    }  

}
