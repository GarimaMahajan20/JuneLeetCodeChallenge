/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
void deleteNode(struct ListNode* node) {
    
    struct ListNode *dnode=NULL;
    
    if(node!=NULL)
    {
        node->val= node->next->val;
    }
    dnode=node->next;
    node->next=dnode->next;
    dnode->next=NULL;
    free(dnode);
    dnode=NULL;
    
}
