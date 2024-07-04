public class mergeNodesBwZeros {
    public ListNode mergeNodes(ListNode head) {
        ListNode node=head.next;
        ListNode curr=node;
        while(curr!=null){
            int sum=0;
            while(curr.val!=0){
                sum+=curr.val;
                curr=curr.next;
            }
            node.val=sum;
            curr=curr.next;
            node.next=curr;
            node=node.next;
        }
        return head.next;
    }
}
