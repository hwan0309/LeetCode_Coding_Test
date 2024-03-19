class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
            
        }
        int reverse =0;
        int a=x;
        while(a!=0){
            reverse = reverse*10 + a%10;
            a /=10;
        }
        return reverse ==x;
        
    }
}