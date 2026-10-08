class Solution {
    public boolean isPalindrome(String s){
        int left=0;
        int right=s.length()-1;

        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
    public void find(String s,int idx,List<String> curr,List<List<String>> ans){
        if(idx==s.length()){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i=idx;i<s.length();i++){
            String str1=s.substring(idx,i+1);
            if(isPalindrome(str1)){
                curr.add(str1);
                find(s,i+1,curr,ans);
                curr.remove(curr.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        List<String> curr=new ArrayList<>();
        find(s,0,curr,ans);
        return ans;
    }
}
