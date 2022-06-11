//first methid that work
  class Solution {
    public int removeElement(int[] nums, int val) 
    {
      int i = 0;
        for (int elem: nums){
            if (elem != val){
                nums[i] = elem;                
                i++;
            }
        }
        return i;
    }
}


//Second method that not work but output is correct
for(int i=0;i<nums.length;i++)
{
  class Solution {
    public int removeElement(int[] nums, int val) {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==val)
            {
                nums[i] = nums[i+1];
            }
            return nums[i];
        }
        return 0;
    }
    
}
