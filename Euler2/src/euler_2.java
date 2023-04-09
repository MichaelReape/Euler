public class euler_2 {
    public static void main(String[] args) {
        // fibonacci sequence with even numbers
        // a and b are the seeds
        // c is the sum of a and b
        // sum is the sum of all even numbers in the sequence
        // in this case sum begins at 2 because 2 is the first even number in the
        // sequence

        int a = 1;
        int b = 2;
        int c = 0;
        int sum = 2;
        while (c < 4000000) {
            c = a + b;
            a = b;
            b = c;
            if (c % 2 == 0) {
                sum += c;
            }
        }
        System.out.println(sum);
    }
}
