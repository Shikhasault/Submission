import java.util.Scanner;

// Generic class to handle any data type
class GenericPrinter<T> {
    private T Data;

    public GenericPrinter(T data) {
        this.Data = Data;
    }

    public T getData() {
        return Data;
    }

    public void printData() {
        System.out.println("You entered the Integer: " + Data);
    }
    public void getresult() {
        System.out.println("You entered the String: " + Data);
    }

}
public class lab2q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Scan Integer input from the user
        System.out.print("Enter an Integer: ");
        int intInput = scanner.nextInt();

        // Create a generic class object for Integer
        GenericPrinter<Integer> intPrinter = new GenericPrinter<>(intInput);
        intPrinter.printData();

        // Scan String input from the user
        System.out.print("Enter a String: ");
        scanner.nextLine(); // Consume the newline character
        String stringInput = scanner.nextLine();

        // Create a generic class object for String
        GenericPrinter<String> stringPrinter = new GenericPrinter<>(stringInput);
        stringPrinter.getresult();

        scanner.close();
    }
}
