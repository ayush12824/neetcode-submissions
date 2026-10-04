class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n=strs.length;
        String[] string=new String[n];
        for(int i=0;i<n;i++){
            String str=strs[i];
            char[] arr=str.toCharArray();
            Arrays.sort(arr);
            String sorted=new String(arr);
            string[i]=sorted;
        }

        HashMap<String,List<String>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            String str=string[i];
            if(!map.containsKey(str)){
                map.put(str,new ArrayList<>());
            }

            map.get(str).add(strs[i]);
        }

        List<List<String>> ans=new ArrayList<>();
        Set<String> keys=map.keySet();

        for(String key:keys){
            ans.add(map.get(key));
        }

        return ans;
    }
}
