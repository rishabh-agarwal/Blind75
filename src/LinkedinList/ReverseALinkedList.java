package LinkedinList;

/**
 * Leetcode: 206
 **/

public class ReverseALinkedList {

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode temp = null;

        while(head!=null){
            temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }

        return prev; //because head will be pointing to null (last value of original list)
    }
}
