class Solution {
    public boolean hasDuplicate(int[] arr) 
    {
        Arrays.sort(arr);
        int i=0;
        int n=arr.length;
        for(int j=1;j<n;j++)
        {
            if(arr[i]!=arr[j])
            i++;
            else
            return true;

        }
        return false;
        
    }
}