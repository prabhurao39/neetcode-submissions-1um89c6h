class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                 map.put(num, 1);
            }
        }

        Map<Integer, Integer> m = map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, 
            (e1, e2) -> e1, LinkedHashMap::new));

        int[] arr = new int[k];
        System.out.println(m);
        List<Integer> output = new ArrayList<>(m.keySet());

        for (int i =0 ;i < k ; i++) {
            arr[i] = output.get(i);
        }
        
        return arr;
    }
}
