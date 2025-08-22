class NextPermutaion{
  public void NextPErmutaion(int [] nums){
    int n = nums.length;
    int k = -1;
    for(int i = n-2;i>=0;i--){
      if(nums[i]>nums[i+1]){
        k = i;
      }
    }
    if(k==-1){
      reverse(nums,0,n-1);
        }
    int l = -1;
    for(int i=n-1;i>k;i--){
      if(nums[k]<nums[i]){
        l = i;
      }
    }

    int temp = nums[k];
    nums[k] = nums[l];
    nums[l] = temp;
    
    reverse(nums,k+1,n-1);
  }
  public void reverse(int []nums,r,l){
    while(l<r){
      int temp = nums[l];
      nums[l] = nums[r];
      nums[r] = temp;
      l++;
      r--;
    }
  }
}
