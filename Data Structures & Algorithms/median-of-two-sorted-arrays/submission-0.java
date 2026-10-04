class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;

        int[] ans=new int[n+m];

        int idx=0;
        int left=0;
        int right=0;

        while(left<n && right<m){
            if(nums1[left]<nums2[right]){
                ans[idx++]=nums1[left];
                left++;
            }else{
                ans[idx++]=nums2[right];
                right++;
            }
        }

        while(left<n){
            ans[idx++]=nums1[left];
            left++;
        }

        while(right<m){
            ans[idx++]=nums2[right];
            right++;
        }

        double med=0;

        if((n+m)%2==0){
            int idx1=(n+m)/2;
            int idx2=(n+m)/2-1;

            med=(ans[idx1]+ans[idx2])/2.0;
        }else{
            med=ans[(n+m)/2];
        }

        return med;
    }
}
