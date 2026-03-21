class Solution {
    public String makeSmallestPalindrome(String s) {
        char[] ch=s.toCharArray();
        int len=0;
        for(int i=s.length()-1;i>=s.length()/2;i--){
            if(ch[i]!=ch[len]){
                if(ch[i]<ch[len])ch[len]=ch[i];
                else ch[i]=ch[len];
            }
            len++;
        }
        StringBuilder sb=new StringBuilder();
        for(char c:ch){
            sb.append(c);
        }
        return sb.toString();
    }
}