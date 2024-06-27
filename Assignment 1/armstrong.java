class Solution {
    static String armstrongNumber(int n) {
        // code here
        int originalNumber = n;
        int numDigits = 0;
        int sum = 0;

        // Count the number of digits
        int temp = n;
        while (temp > 0) {
            temp /= 10;
            numDigits++;
        }

        // Calculate the sum of cubes of digits
        temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, numDigits);
            temp /= 10;
        }
        
        if(sum==originalNumber){
            return "true";
        }
        return "false";
    }
}
