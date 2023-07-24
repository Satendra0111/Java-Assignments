public class primeArrays {
    public static void main(String[] args) {

        int[] arrNum = { 2, 29, 51, 8, 4 };
        int largestPrime = -1;

        for (int num : arrNum) {
            boolean isPrime = true;
            if (num > 1) {
                for (int i = 2; i * i <= num; i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime && num > largestPrime) {
                    largestPrime = num;
                }
            }
        }

        if (largestPrime != -1) {
            System.out.println("The largest prime number in the array is: " + largestPrime);
        } else {
            System.out.println("There is no prime number in the array.");
        }
    }
}
