public class PatchingArray {
    public int solve(int[] nums, int n) {
        int missValue = 1;
        int result = 0;
        int i = 0;

        while (missValue <= n) {
            if (i < nums.length && nums[i] <= missValue) {
                missValue += nums[i];
                i += 1;
            } else {
                missValue += missValue;
                result += 1;
            }
        }

        return result;
    }
}
