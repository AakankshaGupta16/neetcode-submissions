class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            int ex=target-nums[i];
            if(map.containsKey(ex))
            return new int[]{map.get(ex),i};
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
        
    }
}
