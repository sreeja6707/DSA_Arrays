
class Solution {
    private int countPartitions(int[] nums, long maxSum) {
        int partitions = 1;
        long sum = 0;
        for (int num : nums) {
            if (sum + num <= maxSum) {
                sum += num;
            } else {
                partitions++;
                sum = num;
            }
        }
        return partitions;
    }

    public int splitArray(int[] nums, int k) {
        long low = 0, high = 0;
        for (int num : nums) {
            low = Math.max(low, num);
            high += num;
        }

        long ans = high;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            int needed = countPartitions(nums, mid);
            if (needed > k) {
                low = mid + 1;
            } else {
                ans = mid;
                high = mid - 1;
            }
        }
        return (int) ans;
    }
}

