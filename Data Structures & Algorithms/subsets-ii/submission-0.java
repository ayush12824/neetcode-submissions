class Solution {
    public void find(int[] nums,int idx,List<Integer> curr,List<List<Integer>> ans){
        if(idx==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }

        curr.add(nums[idx]);
        find(nums,idx+1,curr,ans);
        curr.remove(curr.size()-1);
        int next=idx+1;
        while(next<nums.length && nums[next]==nums[idx]){
            next++;
        }

        find(nums,next,curr,ans);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();

        find(nums,0,curr,ans);
        return ans;
    }
}
