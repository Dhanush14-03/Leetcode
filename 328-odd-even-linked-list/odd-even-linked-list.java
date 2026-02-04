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
    public ListNode oddEvenList(ListNode head) {
        ListNode ES=null;
        ListNode EE=null;
        ListNode OS=null;
        ListNode OE=null;
        ListNode temp=head;
        int index=0;
        while(temp!=null){
            ListNode next=temp.next;
            temp.next=null;
            if(index%2!=0){
                if(OS==null){
                    OS=OE=temp;
                }
                else{
                    OE.next=temp;
                    OE=temp;
                }
            }
            else{
                if(ES==null){
                    ES=EE=temp;
                }
                else{
                    EE.next=temp;
                    EE=temp;
                }
            }
            temp=next;
            index++;
        }
        if(OS==null) return ES;
        if(ES==null) return OS;
        EE.next=OS;
        return ES;
    }
}