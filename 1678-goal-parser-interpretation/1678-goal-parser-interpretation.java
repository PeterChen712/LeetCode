class Solution {
    public String interpret(String command) {
        String res = "";
        // int i = 0;
        for (int i = 0; i < command.length(); i++){
            if (command.charAt(i) == '('){
                i++;
                if (command.charAt(i) == 'a'){
                    res += "al";
                    i += 2;
                } else if (command.charAt(i) == ')'){
                    res += "o";
                }
            } else{
                res += command.charAt(i);
            }
        }
        return res;
    }
}