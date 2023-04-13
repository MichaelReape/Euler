public class euler4 {
    public static void main(String[] args) {
        // to find the largest pallindrome composed of the product two 3-digit numbers

        // find the largest product of two 3-digits numbers and decrement

        int largest = 0, large1 = 0, large2 = 0;

        for (int i = 999; i > 99; i--) {
            for (int j = 999; j > 99; j--) {
                int temp = (i * j);
                if (isPalindrome(temp)) {
                    if (temp > largest) {
                        largest = temp;
                        large1 = i;
                        large2 = j;

                    }
                }
            }
        }
        System.out.println("The largest pallindrome is " + largest + " and is made up of " + large1 + " " + large2);
    }

    public static boolean isPalindrome(int temp) {
        String s = Integer.toString(temp);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(s.length() - 1 - i))
                continue;
            else {
                return false;
            }
        }
        return true;
    }
}