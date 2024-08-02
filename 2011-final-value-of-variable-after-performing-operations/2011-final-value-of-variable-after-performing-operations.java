class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String i : operations){
            if (i.charAt(1) == '+') {
                x += 1;
            }
            else if(i.charAt(1) == '-'){
                x -= 1;
            }
        }
        return x;
    }
}