class Solution {
    public int countSeniors(String[] details) {
        int cnt=0;
        for(String s:details){
            StringBuilder sb=new StringBuilder();
            sb.append(s.charAt(11));
            sb.append(s.charAt(12));
            int n=Integer.parseInt(sb.toString());
            if(n>60)cnt++;
        }
        return cnt;
    }
}