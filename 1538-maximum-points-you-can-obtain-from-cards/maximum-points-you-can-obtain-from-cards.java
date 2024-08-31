class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int leftSum = 0;
        int max = 0;
        int rigthSum = 0;
        for(int i=0;i<k;i++){
            leftSum = leftSum + cardPoints[i];
            max = Math.max(max,leftSum);
        }
        int rightIndex = cardPoints.length-1;
        for(int i=k-1;i>=0;i--){
            leftSum = leftSum - cardPoints[i];
            rigthSum = rigthSum + cardPoints[rightIndex--];
            max = Math.max(max,leftSum+rigthSum);
        }
        return max;
    }
}