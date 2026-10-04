class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());

        for(int i=0;i<stones.length;i++){
            pq.add(stones[i]);
        }

        int ans=0;

        while(pq.size()>1){
            int first=pq.remove();
            int second=pq.remove();

            if(first==second){
                continue;
            }else if(first>second){
                pq.add(first-second);
            }else{
                pq.add(second-first);
            }
        }

        if(pq.size()!=0){
            return pq.remove();
        }

        return 0;
    }
}
