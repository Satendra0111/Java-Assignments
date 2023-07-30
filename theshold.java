import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class theshold {
    public static void main(String[] args) {

    public static void findEmployeesAboveSalaryThreshold(String fileName, Scanner scanner) {

    // Method to find employees above a specific salary threshold
    private static void findEmployeesAboveSalaryThreshold(String fileName, Scanner scanner) {
        try {
            FileReader reader = new FileReader(fileName);
            BufferedReader bufferReader = new BufferedReader(reader);

            System.out.print("Enter salary threshold: ");
            double threshold = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character

            boolean found = false;

            String line;
            while ((line = bufferReader.readLine()) != null) {
                String[] employeeData = line.split(",");
                double salary = Double.parseDouble(employeeData[2]);

                if (salary > threshold) {
                    String name = employeeData[0];
                    int age = Integer.parseInt(employeeData[1]);
                    System.out.println("Name: " + name + ", Age: " + age + ", Salary: " + salary);
                    found = true;
                }
            }

            bufferReader.close();

            if (!found) {
                System.out.println("No employees found above the salary threshold.");
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error: Failed to find employees above salary threshold.");
        }
    }

    }catch(

    IOException e)
    {
        System.err.println("Error reading the file: " + e.getMessage());
    }catch(
    NumberFormatException e)
    {
            }
}}}
