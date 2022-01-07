class anagrams {
    public String rles(String str) {
        int[] freq = new int[26];
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch - 'a']++;
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 26; i++) {
            if(freq[i] > 0) {
                sb.append((char)(i + 'a'));
                sb.append(freq[i]);
            }
        }
        return sb.toString();
    }
    public List<List<String>> Anagrams(String[] string_list) {
        // Code here
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for(String str : string_list) {
            String res = rles(str);  // O(len of str)
            map.putIfAbsent(res, new ArrayList<>());  //O(1)
            map.get(res).add(str);  //O(1)
        }
        
        List<List<String>> ans = new ArrayList<>();
        for(String key : map.keySet()) {
            ans.add(map.get(key));
        }
        
        return ans;
    }
}