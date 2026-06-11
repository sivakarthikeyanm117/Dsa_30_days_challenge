class Solution {
    public boolean isHappy(int n) {
        int sum = 0;
        int digit;
        while(n!=1 && n!=4){
            sum=0;
            while(n!=0){
                digit = n%10;
                n/=10;
                sum+=digit*digit;
            }
            n=sum;
        }
        if(n==1){
            return true;
        }
        else{
            return false;
        }
    }
}
