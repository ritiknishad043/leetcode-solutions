class Solution {
    public int majorityElement(int[] nums) {
        int number = 0;
        int count = 0;
        for (int num : nums) {
            if (count == 0) {
                number = num;
            }
            count += (num == number) ? 1 : -1;
        }
        int occurrences = 0;
        for (int num : nums) {
            if (num == number) {
                occurrences++;
            }
        }
        return occurrences > nums.length / 2 ? number : -1;
    }
}