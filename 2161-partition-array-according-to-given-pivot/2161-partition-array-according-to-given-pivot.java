class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> smaller = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();

        int equalCount = 0;

        for (int num : nums) {
            if (num < pivot) {
                smaller.add(num);
            } else if (num > pivot) {
                greater.add(num);
            } else {
                equalCount++;
            }
        }

        int[] result = new int[nums.length];
        int idx = 0;

        for (int num : smaller) {
            result[idx++] = num;
        }

        while (equalCount-- > 0) {
            result[idx++] = pivot;
        }

        for (int num : greater) {
            result[idx++] = num;
        }

        return result;
    }
}