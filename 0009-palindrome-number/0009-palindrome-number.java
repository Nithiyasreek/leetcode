class Solution {
    public boolean isPalindrome(int n) {
        long div=1;
        int rev=0;
        while(div<=n){
            int ld=(int)((n%(div*10))/div);
            rev=rev*10+ld;
            div=div*10;
        }
        if(rev==n)return true;
        return false;
        
    }
}