package LinkedinList;

import java.awt.*;

/**
 * Leetcode: 21
 **/
public class MergeTwoSortedList {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newNode = new ListNode(0);
        ListNode currPtr = newNode;

        while(list1!=null && list2!=null){
            if(list1.val < list2.val){
                currPtr.next = list1;
                list1 = list1.next;
            }else{
                currPtr.next = list2;
                list2 = list2.next;
            }
            currPtr = currPtr.next;
        }

        if(list1 != null)
            currPtr.next = list1;
        if(list2 != null)
            currPtr.next = list2;

        return newNode.next;
    }
}
