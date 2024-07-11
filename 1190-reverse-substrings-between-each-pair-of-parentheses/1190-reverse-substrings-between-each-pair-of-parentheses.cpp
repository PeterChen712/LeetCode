#include <string>
#include <algorithm> 
#include <deque> 
#include <vector>
using namespace std;

class Solution {
public:
    string reverseParentheses(string s) {
        deque<int> stack; //
        vector<char> res; // i, l, o, v, e, u
        string result = "";
        
        for (char c : s){
            if (c == '('){
                stack.push_back(res.size());
            }
            else if (c == ')'){ // (u(love)i)
                int start = stack.back();
                stack.pop_back();
                reverse(res.begin() + start, res.end());
            }
            else{
                res.push_back(c);
            }
        }
        return string(res.begin(), res.end());
    }
};