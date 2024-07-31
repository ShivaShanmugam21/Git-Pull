public class ArmstrongNumber {
    // Function to check if a number is an Armstrong number
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;
        int digits = String.valueOf(number).length();

        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }

        return sum == originalNumber;
    }

    public static void main(String[] args) {
        // Test the function with some example numbers
        int[] testNumbers = {153, 370, 371, 407, 9474};

        for (int num : testNumbers) {
            if (isArmstrong(num)) {
                System.out.println(num + " is an Armstrong number.");
            } else {
                System.out.println(num + " is not an Armstrong number.");
            }
        }
    }
}
