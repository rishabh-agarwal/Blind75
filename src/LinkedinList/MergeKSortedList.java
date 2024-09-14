package LinkedinList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Leetcode: 23
 **/
public class MergeKSortedList {
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> nodeList = new ArrayList<>();

        // Traverse each linked list and collect all node values
        for (ListNode node : lists) {
            while (node != null) {
                nodeList.add(node.val);
                node = node.next;
            }
        }

        // Sort all collected values
        Collections.sort(nodeList);

        // Create a new linked list from the sorted values
        ListNode head = new ListNode(0); // Dummy node
        ListNode curr = head;
        for (int val : nodeList) {
            curr.next = new ListNode(val);
            curr = curr.next;
        }

        return head.next; // Return the head of the merged linked list
    }
}