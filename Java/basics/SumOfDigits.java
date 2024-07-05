class SumOfDigits {
    public static void main(String[] args) {
       System.out.println("Enter the values  ");
        int number = Utility.getI();
        int sum = sumOfDigits(number);
        System.out.println("Sum of digits of " + number + " is: " + sum);
        int singleDigitSum =findSingledigitSum(number);
        
        System.out.println("Single Digit Sum of " + number + " is: " + singleDigitSum);
    }

    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10; // Extract the last digit
            sum += digit; // Add the digit to the sum
            number /= 10; // Remove the last digit
        }
        return sum;
    }


    public static int findSingledigitSum(int value){
        int singleDigitSum = 0;
        do{

            singleDigitSum = sumOfDigits(value);
            if(singleDigitSum >=10){
                value = singleDigitSum;
            }

        }while(singleDigitSum >=10);

        return singleDigitSum;
    }

    
}