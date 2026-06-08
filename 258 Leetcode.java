class Solution {
    public int addDigits(int num) {

        while (num > 9) {   // outer loop
            int sum = 0;

            while (num != 0) {   // inner loop
                int digit = num % 10;
                sum += digit;
                num = num / 10;
            }

            num = sum;   // prepare next round
        }

        return num;
    }
}
