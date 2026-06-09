class Solution {
    public int reverse(int x) {
        int num = x;
        long rev = 0;
        int digit = 0;
        while(num!=0){
            digit = num%10;
            num/=10;
            rev = (rev * 10) + digit;
        }
        if (rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE) {
            return 0;
        }
        
        return (int)rev;
    }
}
