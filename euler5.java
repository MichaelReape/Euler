public class euler5 {
    public static void main(String[] args) {
        // to find the smallest possible number that is divisible by all numbers
        // 1-20 without any remainder

        int num = 20;
        boolean isFound = false;
        while (!isFound) {
            for (int i = 1; i < 21; i++) {
                if (num % i != 0) {
                    num++;
                    isFound = false;
                    break;
                } else {
                    isFound = true;
                }
            }
        }
        System.out.println(num);
    }
}
