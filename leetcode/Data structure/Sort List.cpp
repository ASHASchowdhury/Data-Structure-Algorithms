

class Solution {
public:
    ListNode* sortList(ListNode* head) {
        if(head==NULL){
            return NULL;
        }
        if(head->next==NULL){
            return head;
        }
        ListNode* tmp=head;
        vector<int> xo;
        while(tmp!=NULL){
            xo.push_back(tmp->val);
            tmp=tmp->next;
                    }
                    sort(xo.begin(),xo.end());
                    ListNode* prime= new ListNode(xo[0]);
                    ListNode* pro=prime;
                    for(int i=1;i<xo.size();i++){
                        pro->next=new ListNode(xo[i]);
                        pro=pro->next;
                    }
                    return prime;
    }
};
