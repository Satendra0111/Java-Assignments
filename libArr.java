import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class libArr {

    static String[][] catalog = {
            { "101", "HTML and CSS", "Jon Duckett", "available", "Null" },
            { "102", "JavaScript: The Good Parts", "Douglas C", "available", "Null" },
            { "103", "Learning Web Design", "Jennifer N", "CP2014", "23-May-2023" },
            { "103", "Responsive Web Design", "Ben Frain", "EC3142", "17-May-2023" },
            // Add more books here as needed
    };

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("----------------------------------------------------");
        System.out.println("Welcome to the Unique Library");
        System.out.println("----------------------------------------------------");

        int choice;
        do {
            System.out.println("\nMenu System:");
            System.out.println("1. Display all books");
            System.out.println("2. Issue a book");
            System.out.println("3. Return a book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Clear the new line character from the input buffer

            switch (choice) {
                case 1:
                    displayAllBooks();
                    break;
                case 2:
                    issueBook(scanner);
                    break;
                case 3:
                    returnBook(scanner);
                    break;
                case 4:
                    System.out.println("Exiting the application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option (1-4).");
            }
        } while (choice != 4);

        scanner.close();
    }

    private static void displayAllBooks() {
        System.out.println("\nList of all books in the catalog:");
        System.out.println("----------------------------------------------------");
        System.out.println("BookID\tTitle\t\tAuthor\t\tAvailability\tIssue Date");
        for (String[] book : catalog) {
            System.out.println(book[0] + "\t" + book[1] + "\t" + book[2] + "\t" + book[3] + "\t\t" + book[4]);
        }
        System.out.println("----------------------------------------------------");
    }

    private static void issueBook(Scanner scanner) {

        System.out.print("Enter the BookID to issue: ");
        String bookID = scanner.nextLine();
        boolean bookFound = false;

        for (String[] book : catalog) {
            if (book[0].equals(bookID) && book[3].equals("available")) {

                System.out.print("Enter the studentID: ");
                String studentID = scanner.nextLine();

                // Update book information
                book[3] = studentID;
                book[4] = LocalDate.now().toString();
                System.out.println("Book issued successfully to student with ID: " + studentID);
                bookFound = true;
                break;
            }
        }

        if (!bookFound) {
            System.out.println("Book with BookID " + bookID + " is either not available or does not exist.");
        }
    }

    private static void returnBook(Scanner scanner) {

        System.out.print("Enter the BookID to return: ");
        scanner.nextLine();
        String bookID = scanner.nextLine();
        boolean bookFound = false;

        for (String[] book : catalog) {
            if (book[0].equals(bookID) && !book[3].equals("available")) {
                String issueDate = book[4];
                LocalDate currentDate = LocalDate.now();
                LocalDate issueLocalDate = LocalDate.parse(issueDate);
                long daysDifference = ChronoUnit.DAYS.between(issueLocalDate, currentDate);

                double lateCharges = 0;
                if (daysDifference > 7) {
                    lateCharges = (daysDifference - 7) * 10;
                }

                // Update book information
                book[3] = "available";
                book[4] = "Null";
                System.out.println("Book returned successfully.");

                if (lateCharges > 0) {
                    System.out.println("Late charges applied: Rs. " + lateCharges);
                }

                bookFound = true;
                break;
            }
        }

        if (!bookFound) {
            System.out.println("Book with BookID " + bookID + " is either already available or does not exist.");
        }

    }
}
