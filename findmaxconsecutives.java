class findmaxconsecutives{
  public int find(int[] nums){
    int temp=0;
    int count=0;
    int i=0;
    while(i<nums.length){
      if(nums[i]==1){
        count++;
      }
      else{
        temp = Math.max(count,temp);
        count=0;
      }
      i++;
    }
    return Math.max(count,temp);
  }
}


  
