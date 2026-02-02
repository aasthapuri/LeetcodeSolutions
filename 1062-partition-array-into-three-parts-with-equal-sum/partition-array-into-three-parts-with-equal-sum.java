class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int leftSum = 0;
        int totalSum = 0;
        int currentSum = 0;
        int count = 0;
        for(int m=0;m<arr.length;m++){
            totalSum += arr[m];
        }
        if(totalSum%3!=0){
            return false;
        }
        for(int i=0;i<arr.length-1;i++){
            currentSum += arr[i];
            if(currentSum == totalSum/3){
                count++;
                currentSum = 0;
            }
            if(count == 2){
                return true;
            }
        }
        return false;
    }
}