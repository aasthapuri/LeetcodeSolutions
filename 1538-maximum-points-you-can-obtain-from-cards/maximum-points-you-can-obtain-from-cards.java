class Solution {
    public int maxScore(int[] cardPoints, int k) {
        
        int maxSum = 0;
        int leftSum = 0;
        int rightSum = 0;
        for(int i=0;i<k;i++){
            leftSum += cardPoints[i];
            maxSum = Math.max(maxSum,leftSum);
        }
        int rightIndex = cardPoints.length-1;
        for(int i=k-1;i>=0;i--){
            leftSum -= cardPoints[i];
            rightSum += cardPoints[rightIndex--];
            maxSum = Math.max(leftSum + rightSum , maxSum);
        }
        return maxSum;
    }
}