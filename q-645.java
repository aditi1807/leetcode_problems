class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        int[] hash=new int[n+1];
        Arrays.fill(hash,0);
        for(int i=0;i<nums.length;i++)
        {
            hash[nums[i]]++;
        }
        int[] ans=new int[2];
        for(int i=1;i<n+1;i++)
        if(hash[i]==0){
            ans[1]=i;
        }
        else if(hash[i]==2){
            ans[0]=i;
        }
        return ans;
    }
}