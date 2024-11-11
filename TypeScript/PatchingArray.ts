function minPatches(nums: number[], n: number): number {
    let missValue  = 1;
    let i = 0;
    let result = 0;

    while (missValue <= n) {
        if (i <= nums.length && nums[i] <= missValue) {
            missValue += nums[i];
            i++;
        } else {
            result++;
            missValue += missValue;
        }
    }
    return result;
};