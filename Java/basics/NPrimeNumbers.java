 class NPrimeNumbers {
    public static void main(String args[]) {
        System.out.println("Enter the value of n");

        int n = Utility.getI();
        generateNPrimes(n);

    }

    public static void generateNPrimes(int n) {
        int count = 0;
        int num = 2; // Start with the first prime number
        while (count < n) {                                                 // setting up two functions to the task
            if (isPrime(num)) {
                System.out.print(" " + num);
                count++;
            }
            num++;
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 2) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}