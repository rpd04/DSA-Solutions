class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = findMaxSubarray(nums);
        System.out.println("Maximum subarray sum: " + maxSum);
    }
}