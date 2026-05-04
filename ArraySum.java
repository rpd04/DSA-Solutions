import java.util.HashMap;

class ArraySum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int t = 9;

        // Empty contacts list
        HashMap<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            
            // What number do I need?
            int k = t - arr[i];

            // Have I seen that number before?
            if (seen.containsKey(k)) {
                // Yes! Print both indices
                System.out.println("[" + seen.get(k) + ", " + i + "]");
            }

            // Store current number and its index
            seen.put(arr[i], i);
        }
    }
}