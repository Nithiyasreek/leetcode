class Solution {
    public boolean squareIsWhite(String coordinates) {
        int num=0;
        char[] arr=coordinates.toCharArray();
        for(char ch:arr){
          num=num+ch;
        }
        if(num%2==0) return false;
             return true;
        
    }
}