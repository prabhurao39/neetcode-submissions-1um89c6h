class Solution {
    class Node {
    int key, index, result;
        public Node(int ku, int index) {
            this.key = ku;
            this.index = index;
            
        }
    }
    int[] arr;
    Stack<Node> stk = new Stack<>();
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        arr = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            if (stk.isEmpty()) {
                stk.push(new Node(temperatures[i], i));
                arr[i] = 0;
            } else if (stk.peek() != null && temperatures[i] >= stk.peek().key) {

                while (!stk.isEmpty() && temperatures[i] >= stk.peek().key) {
                    stk.pop();
                }
                if (stk.isEmpty()) {
                    arr[i] = 0;
                } else {
                    arr[i] = stk.peek().index - i;
                }
                stk.push(new Node(temperatures[i], i));

            } else if (stk.peek() != null && temperatures[i] < stk.peek().key) {

                arr[i] = stk.peek().index - i;
                stk.push(new Node(temperatures[i], i));
            }
        }

        return arr;
    }
}
