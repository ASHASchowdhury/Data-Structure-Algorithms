/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* removeElements(ListNode* head, int val) {
        ListNode* nw=new ListNode(1);
        nw->next=head;

        ListNode* tmp=nw;
        while(tmp!=NULL && tmp->next!=NULL){
            if(tmp->next->val==val){
                ListNode* d=tmp->next;
                tmp->next=tmp->next->next;
                delete d;
            }
            else{
                tmp=tmp->next;
            }
        }
        return nw->next;
    }
};
