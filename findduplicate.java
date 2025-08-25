class Solution {
    public int findDuplicate(int[] nums){
        HashSet<Integer> duplicate = new HashSet<>();
        for(int i =0;i<nums.length;i++){
            if(duplicate.contains(nums[i])){
                return nums[i];
            }
            duplicate.add(nums[i]);

            }
            return -1;
        }
}
