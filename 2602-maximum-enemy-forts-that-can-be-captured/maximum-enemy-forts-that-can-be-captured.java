class Solution {
    public int captureForts(int[] forts) {
        int max = 0;
        int n = forts.length;

        for (int i = 0; i < n; i++) {
            if (forts[i] == 1) {
                // Check to the right
                int j = i + 1;
                while (j < n && forts[j] == 0) {
                    j++;
                }
                if (j < n && forts[j] == -1) {
                    max = Math.max(max, j - i - 1); // Calculate captured forts
                }

                // Check to the left
                j = i - 1;
                while (j >= 0 && forts[j] == 0) {
                    j--;
                }
                if (j >= 0 && forts[j] == -1) {
                    max = Math.max(max, i - j - 1); // Calculate captured forts
                }
            }
        }

        return max;
    }
}
