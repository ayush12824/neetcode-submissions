class Solution {
    public void find(int nums[],boolean[] used,List<Integer> curr,List<List<Integer>> ans){
        if(curr.size()==nums.length){
            ans.add(new ArrayList<>(curr));
        }

        for(int i=0;i<nums.length;i++){
            if(used[i]){
                continue;
            }
            used[i]=true;
            curr.add(nums[i]);
            find(nums,used,curr,ans);
            curr.remove(curr.size()-1);
            used[i]=false;
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        boolean[] used=new boolean[nums.length];
        find(nums,used,curr,ans);
        return ans;
    }
}
