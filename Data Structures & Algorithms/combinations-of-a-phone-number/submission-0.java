class Solution {
    String map[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public void find(String digits,int idx,String curr,List<String> ans){
        if(idx==digits.length()){
            ans.add(new String(curr));
            return;
        }

        String letters=map[digits.charAt(idx)-'0'];
        for(int i=0;i<letters.length();i++){
            String next=curr+letters.charAt(i);
            find(digits,idx+1,next,ans);
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> ans=new ArrayList<>();

        if(digits.length()==0){
            return ans;
        }

        find(digits,0,"",ans);
        return ans;
    }
}
