class Solution {
    public void find(int[] nums,int target,int idx,int sum,List<Integer> curr,List<List<Integer>> ans){
        if(idx==nums.length || sum>target){
            return;
        }

        if(sum==target){
            ans.add(new ArrayList<>(curr));
            return;
        }

        curr.add(nums[idx]);
        find(nums,target,idx,sum+nums[idx],curr,ans);
        curr.remove(curr.size()-1);
        find(nums,target,idx+1,sum,curr,ans);
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();

        find(nums,target,0,0,curr,ans);
        return ans;
    }
}
