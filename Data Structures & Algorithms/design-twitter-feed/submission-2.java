class Twitter {
    HashMap<Integer,HashSet<Integer>> following;
    HashMap<Integer,List<int[]>> tweets;
    int time;
    public Twitter() {
        following=new HashMap<>();
        tweets=new HashMap<>();
        time=0;
    }
    
    public void postTweet(int userId, int tweetId) {
        if(!tweets.containsKey(userId)){
            tweets.put(userId,new ArrayList<>());
        }

        tweets.get(userId).add(new int[]{tweetId,time});
        time++;
    }
    
    public List<Integer> getNewsFeed(int userId) {
        PriorityQueue<int[]> pq=new PriorityQueue<>(
            (a,b)->b[1]-a[1]
        );

        if(tweets.containsKey(userId)){
            for(int i=0;i<tweets.get(userId).size();i++){
                pq.add(tweets.get(userId).get(i));
            }
        }

        if(following.containsKey(userId)){
            for(int followingId:following.get(userId)){
                if(tweets.containsKey(followingId)){
                    for(int i=0;i<tweets.get(followingId).size();i++){
                        pq.add(tweets.get(followingId).get(i));
                    }
                }
            }
        }

        List<Integer> ans=new ArrayList<>();
        while(!pq.isEmpty() && ans.size()<10){
            ans.add(pq.remove()[0]);
        }

        return ans;
        
    }
    
    public void follow(int followerId, int followeeId) {
        if(!following.containsKey(followerId)){
            following.put(followerId,new HashSet<>());
        }

        following.get(followerId).add(followeeId);
        
    }
    
    public void unfollow(int followerId, int followeeId) {
        if(following.containsKey(followerId)){
            following.get(followerId).remove(followeeId);
        }
    }
}
