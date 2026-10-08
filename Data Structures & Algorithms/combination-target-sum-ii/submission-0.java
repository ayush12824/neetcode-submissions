class Solution {
    public void find(int[] candidates,int target,int idx,int sum,List<Integer> curr,List<List<Integer>> ans){
        if(sum==target){
            ans.add(new ArrayList<>(curr));
            return;
        }

        if(sum>target){
            return;
        }

        for(int i=idx;i<candidates.length;i++){
            if(i>idx && candidates[i]==candidates[i-1]){
                continue;
            }

            if(candidates[i]>target){
                break;
            }

            curr.add(candidates[i]);
            find(candidates,target,i+1,sum+candidates[i],curr,ans);
            curr.remove(curr.size()-1);
        }

    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();

        find(candidates,target,0,0,curr,ans);
        return ans;
    }
}
