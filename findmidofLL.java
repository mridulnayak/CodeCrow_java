class findmidofLL{
  public ListNode middle( ListNode head){
    int count = 0;
    ListNode temp = head;

    while(temp!=null){
      count++;
      temp = temp.next;
    }
    
    int mid = count/2;
    for(int i=0;i<mid;i++){
      head = head.next;
    }
    return head;
  }
}

      

  
