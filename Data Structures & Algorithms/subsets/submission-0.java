class Solution {
    public void find(int[] nums,int idx,List<Integer> curr,List<List<Integer>> ans){
        if(idx==nums.length){
            List<Integer> temp=new ArrayList<>(curr);
            ans.add(temp);
            return;
        }
        curr.add(nums[idx]);
        find(nums,idx+1,curr,ans);
        curr.remove(curr.size()-1);
        find(nums,idx+1,curr,ans);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        find(nums,0,curr,ans);
        return ans;
    }
}
