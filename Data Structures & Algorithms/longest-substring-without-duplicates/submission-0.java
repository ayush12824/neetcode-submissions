class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        if(n==0 || n==1){
            return n;
        }
        HashSet<Character> set=new HashSet<>();
        int left=0;
        int right=1;
        int ans=0;
        set.add(s.charAt(0));
        while(right<n){
            char ch=s.charAt(right);
            while(set.contains(ch)){
                set.remove(s.charAt(left));
                left++;
            }

            set.add(ch);
            ans=Math.max(ans,right-left+1);
            right++;
        }

        return ans;
    }
}
