class ReverseLinkedList{
  public ListNode reverse(ListNode head){
    ListNode curr = head;
    ListNode prev = null;
    while(curr!=null){
      ListNode temp = curr.next; // current's next in temporary 
      curr.next = prev; // current's next to prev
      prev = curr; // move prev forward 
      curr = temp // move current forward
        }
    return prev;
  }
}
    
