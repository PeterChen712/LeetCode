class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLen = 0;
        int start = 0;
        Map<Character, Integer> charMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            // If the character is already in the map and its index is >= start,
            // update the start index to the position after the previous occurrence
            if (charMap.containsKey(c) && charMap.get(c) >= start) {
                start = charMap.get(c) + 1;
            }

            // Update the maximum length
            maxLen = Math.max(maxLen, i - start + 1);

            // Update the character's index in the map
            charMap.put(c, i);
        }

        return maxLen;
    }
}