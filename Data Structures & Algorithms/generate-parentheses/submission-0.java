class Solution {
    public void find(int n,int open,int close,String str,List<String> ans){
        if(str.length()==2*n){
            ans.add(str);
            return;
        }

        if(open<n){
            find(n,open+1,close,str+'(',ans);
        }

        if(close<open){
            find(n,open,close+1,str+')',ans);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        String str="";
        find(n,0,0,str,ans);
        return ans;
    }
}
