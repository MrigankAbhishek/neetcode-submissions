class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();

        backtrack(nums, 0, new ArrayList<>(), subsets);

        return subsets;
    }

    private void backtrack(int[] nums, int index,
                           List<Integer> current,
                           List<List<Integer>> subsets) {

        subsets.add(new ArrayList<>(current));

        for (int i = index; i < nums.length; i++) {
            current.add(nums[i]);

            backtrack(nums, i + 1, current, subsets);

            current.remove(current.size() - 1);
        }
    }
}