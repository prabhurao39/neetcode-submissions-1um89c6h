class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length()).append("#").append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int i = 0;
        
        while (i < str.length()) {
            // Find the delimiter '#' starting from current index
            int j = str.indexOf('#', i);
            
            // Extract the length of the next string
            int length = Integer.parseInt(str.substring(i, j));
            
            // Move i to the start of the actual string (right after '#')
            i = j + 1;
            
            // Extract the string based on the known length
            list.add(str.substring(i, i + length));
            
            // Move i to the beginning of the next "Length#..." segment
            i += length;
        }
        
        return list;
    }
}
