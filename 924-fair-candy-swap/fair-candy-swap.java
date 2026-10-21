
class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumAlice = 0;
        int sumBob = 0;

        // 1. Calculate Alice's total
        for (int candy : aliceSizes) {
            sumAlice += candy;
        } // Missing brace was here!

        // 2. Calculate Bob's total
        for (int candy : bobSizes) {
            sumBob += candy;
        }

        // 3. Calculate the required difference
        int diff = (sumBob - sumAlice) / 2;

        // 4. Find the correct pair
        for (int a : aliceSizes) {
            for (int b : bobSizes) {
                if (b - a == diff) {
                    return new int[]{a, b};
                }
            }
        }

        return new int[0];
    }
}
