class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        hasDuplicate(nums);
    }

    public static void hasDuplicate(int[] nums) {
        java.util.HashSet<Integer> set = new java.util.HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                System.out.println("True");
                return;
            }
            set.add(num);
        }
        System.out.println("False");
    }
}