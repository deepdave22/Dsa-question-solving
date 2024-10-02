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
        //edge cases (if there is only one element or no element)
        if(head == null && head.next == null){
            return null;
        }

        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            prev = slow;//for keeping track of prev and updating it
            slow = slow.next;//+1
            fast = fast.next.next;//+2
        }

        //if the middle node is the head(prev is null) 
        if(prev == null){
            return head.next;
        }

        prev.next = slow.next;//removing the the middle element 

        return head;
    }
}
