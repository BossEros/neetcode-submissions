class Solution {
    public int longestConsecutive(int[] nums) {
            if(nums.length == 0)
                return 0;
        
            Arrays.sort(nums);
            int longestStreak = 1;
            int currentStreak = 1;
            
            for(int a = 1; a < nums.length; a++)
            {
                if(nums[a] != nums[a-1])
                {
                    if(nums[a] == nums[a-1] + 1){
                        currentStreak++;
                    }
                    else {
                        longestStreak = Math.max(longestStreak, currentStreak);
                        currentStreak = 1;
                    }
                }
            }

            longestStreak = Math.max(longestStreak, currentStreak);
            return longestStreak;
        }
    }
