/* Write a Java program to copy the contents of one file to another using byte streams.
The program should:

Read data from a source file
Write data into a target file
Use FileInputStream and FileOutputStream
Handle file operations properly
*/
import java.io.*;

public class FileCopyByteStream {
    public static void main(String[] args) {

        try (FileInputStream sourceStream = new FileInputStream("sourcefile.txt");
             FileOutputStream targetStream = new FileOutputStream("targetfile.txt")) {

            int temp;

            while ((temp = sourceStream.read()) != -1) {
                targetStream.write(temp);
            }

            System.out.println("File copied successfully.");

        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}