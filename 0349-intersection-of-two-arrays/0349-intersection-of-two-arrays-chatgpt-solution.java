class Solution {

    public int[] intersection(int[] nums1, int[] nums2) {

        // Always build set from smaller array
        if (nums1.length > nums2.length) {
            return intersection(nums2, nums1);
        }

        Set<Integer> baseSet = buildSet(nums1);
        Set<Integer> resultSet = findIntersection(nums2, baseSet);

        int[] result = new int[resultSet.size()];
        int idx = 0;

        for (int num : resultSet) {
            result[idx++] = num;
        }

        return result;
    }

    private Set<Integer> buildSet(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        return set;
    }

    private Set<Integer> findIntersection(int[] arr, Set<Integer> baseSet) {
        Set<Integer> result = new HashSet<>();
        for (int num : arr) {
            if (baseSet.contains(num)) {
                result.add(num);
            }
        }
        return result;
    }
}
