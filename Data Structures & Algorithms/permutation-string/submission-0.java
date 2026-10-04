class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        if(n>m){
            return false;
        }

        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            char ch=s1.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }else{
                map.put(ch,map.get(ch)+1);
            }
        }

        for(int i=0;i<n;i++){
            char ch=s2.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }else{
                map.put(ch,map.get(ch)-1);
                if(map.get(ch)==0){
                    map.remove(ch);
                }
            }
        }

        if(map.isEmpty()){
            return true;
        }

        int left=0;
        int right=n;

        while(right<m){
            char ch=s2.charAt(left);
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }else{
                map.put(ch,map.get(ch)-1);
                if(map.get(ch)==0){
                    map.remove(ch);
                }
            }

            char ch2=s2.charAt(right);
            if(!map.containsKey(ch2)){
                map.put(ch2,1);
            }else{
                map.put(ch2,map.get(ch2)-1);
                if(map.get(ch2)==0){
                    map.remove(ch2);
                }
            }

            if(map.isEmpty()){
                return true;
            }

            right++;
            left++;
        }

        if(map.isEmpty()){
            return true;
        }

        return false;
    }
}
