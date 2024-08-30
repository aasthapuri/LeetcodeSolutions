class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int start = 0;
        int end = k;
        int max = 0;
        int leftSum = 0;
        for(int i=0;i<k;i++){
            leftSum = leftSum + cardPoints[i];
            max = Math.max(max,leftSum);
        }
        
        int rightSum = 0;
        int rightIndex = cardPoints.length - 1;
        for(int i = k-1;i>=0;i--){
            leftSum = leftSum - cardPoints[i];
            rightSum = rightSum + cardPoints[rightIndex--];
            max = Math.max(max,leftSum + rightSum);
        }
        return max;
    }
}