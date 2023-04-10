import java.util.Scanner;

public class Euler3 {
    public static void main(String[] args) throws Exception {
        // To find the largest prime factor of a number

        // Takes the number from the scanner
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        sc.close();

        // Initial divisor is first prime number
        long i = 2;

        // Divides the number by the divisor until the divisor is greater than the
        // square root of the number
        while (i * i <= num) {
            // If the number is divisible by the divisor, divide the number by the divisor
            if (num % i == 0) {
                num /= i;
            }
            // If the number is not divisible by the divisor, increment the divisor
            else {
                i++;
            }
        }

        // Prints the largest prime factor
        System.out.println(num);
    }
}
