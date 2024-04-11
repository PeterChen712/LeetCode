class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i = 0, j = 0;
        int m = word1.length(), n = word2.length();
        
        while (i < m && j < n) {
            sb.append(word1.charAt(i++));
            sb.append(word2.charAt(j++));
        }
        
        // Append the remaining characters from the longer string
        while (i < m) {
            sb.append(word1.charAt(i++));
        }
        
        while (j < n) {
            sb.append(word2.charAt(j++));
        }
        
        return sb.toString();
    }
}