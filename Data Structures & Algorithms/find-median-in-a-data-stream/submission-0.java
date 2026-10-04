class MedianFinder {
    PriorityQueue<Integer> min;
    PriorityQueue<Integer> max;
    public MedianFinder() {
        min=new PriorityQueue<>();
        max=new PriorityQueue<>(Comparator.reverseOrder());
    }
    
    public void addNum(int num) {
        if(min.isEmpty()){
            min.add(num);
        }else if(num>min.peek()){
            min.add(num);
        }else{
            max.add(num);
        }

        if(min.size()>max.size()+1){
            max.add(min.remove());
        }else if(max.size()>min.size()){
            min.add(max.remove());
        }
    }
    
    public double findMedian() {
        if(min.size()>max.size()){
            return min.peek();
        }

        return (min.peek()+max.peek())/2.0;
    }
}
