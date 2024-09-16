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
    private int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;      
            b = a % b;         
            a = temp;          
        }
        return a;              
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next==null || head==null){
            return head;
        }
        
        ListNode slow = head;
        ListNode faster = head.next;
        
        while(faster!=null){
            int value = calculateGCD(slow.val,faster.val);
            ListNode newNode = new ListNode(value);
            
            slow.next = newNode;
            newNode.next = faster;
            
            slow = faster;
            faster = faster.next;
        }
        return head;
    }
}