import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is prime
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close();
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // Numbers <= 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Divisible by a number other than 1 and itself
            }
        }
        return true; // Prime number
    }
}
