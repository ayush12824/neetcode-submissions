class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n=position.length;
        double[][] car=new double[n][2];
        for(int i=0;i<n;i++){
            car[i][0]=position[i];
            car[i][1]=(double)(target-position[i])/speed[i];
        }

        Arrays.sort(car,(a,b)->Double.compare(b[0],a[0]));
        int ans=1;
        Stack<Double> s=new Stack<>();
        s.push(car[0][1]);
        for(int i=1;i<n;i++){
            if(s.peek()<car[i][1]){
                s.push(car[i][1]);
            }
        }

        return s.size();
    }
}
