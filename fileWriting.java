import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class fileWriting {
    public static void main(String[] args) {

        /*
         * boolean isHeaderWritten = false;
         * try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName,
         * true))) {
         * 
         * if (!isHeaderWritten) {
         * writer.write("Name, Age, Salary");
         * writer.newLine();
         * isHeaderWritten = true;
         * }
         */

        try {
            String f1 = "newFile.csv";
            BufferedWriter obj = new BufferedWriter(new FileWriter(f1, true));
            File f = new File(f1); // reference to the file
            if (f.length() == 0) {

                obj.write("Name, Age, Total Marks, Class");
                obj.newLine();
            }
            obj.newLine();
            obj.write("Sam, 28, 250, 12");
            obj.newLine();
            obj.write("Tom, 25, 230, 11");
            obj.newLine();
            obj.write("Jim, 30, 280, 12");
            obj.close();
            obj.write("Kim, 30, 280, 12");
            obj.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
