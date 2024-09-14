/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode[] nodes = new ListNode[100000];
        ListNode node = head;
        int length = 0;
        while(node!=null){
            
            nodes[length++] = node;
            node = node.next;
            
        }
        int mid = length/2;
        
        if(mid==0){
            return head.next;
        }
        
        nodes[mid - 1].next = nodes[mid].next;
        
        return head;
    }
}