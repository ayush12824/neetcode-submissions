class Solution {
    public boolean isPalindrome(String s) {
        String curr="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if((ch<='Z' && ch>='A')|| (ch>='a' && ch<='z') ||     (ch>='0' && ch<= '9')){
                if(ch>='A' && ch<='Z'){
                    ch=(char)(ch+32);
                }
                curr+=ch;
            }
        }

        int left=0;
        int right=curr.length()-1;
        while(left<right){
            if(curr.charAt(left)!=curr.charAt(right)){
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
