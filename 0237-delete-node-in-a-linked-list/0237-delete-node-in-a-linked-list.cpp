class Solution {
public:
    void deleteNode(ListNode* node) {
        ListNode* nextNode = node->next;

        while(nextNode){
            if(nextNode)
                node->val = nextNode->val;
            if(!nextNode->next)
                node->next = nullptr;
            node = nextNode;
            nextNode = nextNode->next;
        }
    }
};