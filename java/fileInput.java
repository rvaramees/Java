import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class fileInput {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter file name : ");
        String FileName = s.nextLine();
        FileOutputStream fos = new FileOutputStream(FileName);
        System.out.println("Enter text to insert : ");
        String text = s.nextLine();
        fos.write(text.getBytes());
        fos.close();
        FileInputStream fis = new FileInputStream(FileName);
        byte[] b = new byte[fis.available()];
        fis.read(b);
        fis.close();
        String fileContent = new String(b);
        System.out.println();
        System.out.println(fileContent);
        s.close();
    }
}
