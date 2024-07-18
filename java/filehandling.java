import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;
public class filehandling {
    static void listFiles(File directory){
        File[] fileList = directory.listFiles();
        if(fileList!= null){
            for(File file: fileList){
                System.out.println(file.getName());
                if(file.isDirectory()){
                    listFiles(file);
                }
            }
        }
    }
    static void searchFile(File directory, String name){
        File[] fileList = directory.listFiles();
        if(fileList!=null){
            for(File file:fileList){
                if(file.isFile() && file.getName().equals(name)){
                    System.out.println("File found at "+file.getAbsolutePath());
                    return;
                }else if(file.isDirectory()){
                    searchFile(file, name);
                }
            }
        }
        System.out.println("File "+name+ " not found!");
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the directory path : ");
        String directory = s.nextLine();
        File f1 = new File(directory);
        if(f1.exists() && f1.isDirectory()){
            System.out.println("Files and directories :");
            listFiles(f1);
            System.out.println("Enter the filename to search : ");
            String fileName = s.nextLine();
            searchFile(f1, fileName);
        }
    }


    
}
