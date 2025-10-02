class Solution {
    public int numWaterBottles(int B, int E) {
      return B + (B - 1) / (E - 1);
    }
}