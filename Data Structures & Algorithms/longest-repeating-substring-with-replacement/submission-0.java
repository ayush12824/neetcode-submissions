class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map=new HashMap<>();
        int left=0;
        int right=0;
        int maxFrequency=0;
        int ans=0;
        int n=s.length();

        while(right<n){
            char ch=s.charAt(right);
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }else{
                map.put(ch,map.get(ch)+1);
            }

            maxFrequency=Math.max(maxFrequency,map.get(ch));

            while((right-left+1)-maxFrequency>k){
                char leftChar=s.charAt(left);
                map.put(leftChar,map.get(leftChar)-1);
                left++;
            }

            ans=Math.max(ans,right-left+1);
            right++;
        }

        return ans;
    }
}
