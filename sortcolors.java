class Solution{
  public void sortColors(int [] nums){
    int low = 0; // initialize mid and low 
    int mid = 0; // low indicates left ( 0 place) mid indicates mid and its moving pointer as well as place of 1
    int high = nums.length-1; // high is place of 2 and at righ most 
// example [ 0 , 1 , 2 ]
    
    while(mid<=high){ // loop till mid is smaller/equal to high 
      if(nums[mid] ==0){ // if element = 0, swap its place with low 
        int temp = nums[mid];
        nums[mid] = nums[low];
        nums[low] = temp;
        low++; // incremenet low and mid towards right to go through all elements 
        mid++;
      }
      else if(nums[mid] == 1){ // if first element = 1, its on right place just increment mid towards right
        mid++;
      }
      else{
        int temp = nums[mid]; // if element is 2 , swap its position with high place to right most
        nums[mid] = nums[high];
        nums[high] = temp;
        high--
      }
    }
  }
}


      
        
        
        
