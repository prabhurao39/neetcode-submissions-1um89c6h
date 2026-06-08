class Solution {
    Queue<Integer> q = new PriorityQueue<>();
    int k=0;
    public int findKthLargest(int[] nums, int k) {
        for (int i : nums) {
            q.add(i);
            while (q.size() > k) {
                q.remove();
            }
        }
        return !q.isEmpty() ? q.peek() : -1; 
    }
}
