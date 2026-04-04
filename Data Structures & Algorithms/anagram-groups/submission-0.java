class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Integer, List<String>> map = new HashMap<>();
        for (String data : strs) {
            char[] ch = data.toCharArray();
            Arrays.sort(ch);
            String sorted = String.valueOf(ch);
            int hv = sorted.hashCode();
            if (map.containsKey(hv)) {
                List<String> list = map.get(hv);
                list.add(data);
            } else {
                List<String> list = new ArrayList<>();
                list.add(data);
                map.put(hv, list);
            }
        }
        List<List<String>> myList = new ArrayList<>(map.values());
        return myList;
    }
}
