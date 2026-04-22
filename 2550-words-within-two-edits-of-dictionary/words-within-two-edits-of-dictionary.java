class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> list=new ArrayList<>();
        for(String s1:queries){
            for(String s2:dictionary){
                int cnt=0;
                for(int i=0;i<s1.length();i++){
                    if(s1.charAt(i)!=s2.charAt(i))cnt++;
                    if(cnt>2)break;
                }
                if(cnt<3){
                    list.add(s1);
                    break;
                }
            }
        }
        return list;
    }
}