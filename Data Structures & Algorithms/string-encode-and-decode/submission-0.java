class Solution {

    public String encode(List<String> strs) {
        String str="";
        for(int i=0;i<strs.size();i++){
            str=str+strs.get(i).length()+"#"+strs.get(i);
        }

        return str;
    }

    public List<String> decode(String str) {
        List<String> ans=new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int j=i;

            while(str.charAt(j)!='#'){
                j++;
            }

            int length=Integer.parseInt(str.substring(i,j));
            int start=j+1;
            int end=start+length;

            String word=str.substring(start,end);
            ans.add(word);

            i=end;
        }

        return ans;
    }
}
