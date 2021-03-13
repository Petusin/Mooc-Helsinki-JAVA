// Making the scanner available in the program
import java.util.Scanner;

public class Suma_dos_enteros {
    public static void main(String[] main) {
        // Creating the scanner
        Scanner reader = new Scanner(System.in);

        // Identifying the input values and declaring the variables for them
        int first = 1;
        int second = 2;

        // Assigning the user input to the variables
        first = Integer.valueOf(reader.nextLine());
        second = Integer.valueOf(reader.nextLine());

        // Identifying the operation and declaring a variable for the result
        int product = first + second;

        // Printing the result of the operation
        System.out.println("La suma de " + first + " y " + second + " es " + product);

    }
}