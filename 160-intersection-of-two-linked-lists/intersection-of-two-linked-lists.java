/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set=new HashSet<>();
        ListNode temp=headA;
        while(temp!=null){
            set.add(temp);
            temp=temp.next;
        }
        temp=headB;
        while(temp!=null){
            if(set.contains(temp)) return temp;
            else{
                temp=temp.next;
            }
        }
        return null;
        // ListNode temp1=headA;
        // while(temp1!=null){
        //     ListNode temp2=headB;
        //     while(temp2!=null){
        //         if(temp1==temp2) return temp1;
        //         else{
        //             temp2=temp2.next;
        //         }
        //     }
        //     temp1=temp1.next;
        // }
        // return null;
    }
}