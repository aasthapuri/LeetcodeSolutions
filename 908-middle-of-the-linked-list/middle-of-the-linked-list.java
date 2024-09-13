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
    public ListNode middleNode(ListNode head) {
        ListNode[] newNode = new ListNode[100];
        int t=0;
        while(head!=null){
            newNode[t]=head;
            t++;
            head=head.next;
        }
        return newNode[t/2];
    }
}