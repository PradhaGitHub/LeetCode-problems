class Solution {
    public int minLength(String s) {
        while(true){
            if(s.contains("AB")){
                s=s.replaceFirst("AB","");
            }
            else if(s.contains("CD")){
                s=s.replaceFirst("CD","");
            }
            else{
                break;
            }
        }
        return s.length();
    }
}