class Solution {
    public int lengthOfLastWord(String s) {
        String nums[] = s.split(" ");
        return nums[nums.length-1].length();
        
    }
}
