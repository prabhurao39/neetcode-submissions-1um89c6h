class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        recurCombSum1(new ArrayList<>(), nums, target, 0);
        return ans;
    }


    public void recurCombSum1(List<Integer> list, int[] candidates, int target, int pos) {
        if (target < 0) {
            return;
        } else if (0 == target) {
            ans.add(new ArrayList<>(list));
        } else {
            for (int i = pos; i < candidates.length; i++) {
                int num = candidates[i];
                // if (i > pos && candidates[i] == candidates[i - 1])
                //     continue;
                list.add(num);
                recurCombSum1(list, candidates, target - num, i);
                list.remove(list.size() - 1);
            }
        }
    }
}
