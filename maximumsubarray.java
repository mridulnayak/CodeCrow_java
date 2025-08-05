class Solution{
  public int method(int[] nums){
    int cs = nums[0]; // current sum
    int ms = nums[0]; // max sum
  for(int i=1;i<nums.length;i++){
    if(cs<cs+nums[i]){
cs = cs+nums[i];
      if(cs>ms){
        ms = cs;
      }
    }
      else{
        cs = nums[i];
        if(cs>ms){
          ms = cs;
        }
      }
  }
    return ms;
  }
}

      
    
