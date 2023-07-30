import java.io.FileWriter;

public class newfileStingbuilder {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        sb.append("My Name is Sam Gragers").append(System.lineSeparator());
        sb.append("I am In FSD 11 Batch").append(System.lineSeparator());
        sb.append("Java is going on currently").append(System.lineSeparator());
        try {

            FileWriter file = new FileWriter("Data.txt");
            file.write(sb.toString());
            file.close();

        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}
