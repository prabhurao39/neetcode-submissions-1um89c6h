class KthLargest {

    Queue<Integer> q = new PriorityQueue<>();
    int k=0;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        for (int i : nums) {
           add(i);
        }
    }
    
    public int add(int val) {
        q.add(val);
        while (q.size() > k) {
            q.remove();
        }
        return !q.isEmpty() ? q.peek() : -1; 
    }
}
