import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            System.out.println("Please input information of a student:");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Address: ");
            String address = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            System.out.println("\nStudent Information:");
            System.out.println("Name: " + name);
            System.out.println("Address: " + address);
            System.out.println("Age: " + age);

            System.out.print("\nDo you want to continue? (Y/N): ");
            choice = scanner.nextLine().charAt(0);
        } while (Character.toLowerCase(choice) == 'y');

        System.out.println("Program has ended.");
        scanner.close();
    }
}
