class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        Map<Character, Integer> pMap = new HashMap<>();
        Map<Character, Integer> map = new HashMap<>();

        for(char ch: p.toCharArray())
            pMap.put(ch, pMap.getOrDefault(ch, 0) + 1);

        int left = 0, k = p.length();
        for(int right = 0; right < s.length(); right++){
            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        if (right - left + 1 == k){
           if(pMap.equals(map))
           result.add(left);

           char remove = s.charAt(left);
           map.put(remove, map.get(remove)- 1);

           if (map.get(remove) == 0)
            map.remove(remove);

            left++;
        }
        }
        return result;
        }
    }
