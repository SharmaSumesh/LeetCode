class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int j = -1;
        int i= 0;
        while(i<n)
        {
            if(nums[i]==0 && j == -1)
            {
                j  = i;
            }
            else if(nums[i]!=0 && j!=-1)
            {
                nums[j] = nums[i];
                nums[i] = 0;
                j++;
            }
            i++;
        }
        
    }
}
