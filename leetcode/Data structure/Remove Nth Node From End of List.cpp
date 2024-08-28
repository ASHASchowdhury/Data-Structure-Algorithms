/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    int size(ListNode* head) {
        ListNode* tmp = head;
        int siz = 0;
        while (tmp != nullptr) {
            siz++;
            tmp = tmp->next;
        }
        return siz;
    }

    ListNode* removeNthFromEnd(ListNode* head, int n) {
        int cnt = size(head);

        if (cnt == 1 && n == 1) {
            delete head;
            return nullptr;
        }

        if (cnt == n) {
            ListNode* newHead = head->next;
            delete head;
            return newHead;
        }

        ListNode* tmp = head;
        for (int i = 1; i < cnt - n; ++i) {
            tmp = tmp->next;
        }

        ListNode* toDelete = tmp->next;
        tmp->next = tmp->next->next;
        delete toDelete;

        return head;
    }
};
