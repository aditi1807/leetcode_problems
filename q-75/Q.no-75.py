def sortColors(self, nums: List[int]) -> None:
        n0=0
        n1=0
        n2=0
        for i in range(len(nums)):
            if nums[i]==0:
                n0+=1
            elif nums[i]==1:
                n1+=1
            else:
                n2+=1
        for i in range(len(nums)):
            if n0!=0:
                nums[i]=0
                n0-=1
            elif n1!=0:
                nums[i]=1
                n1-=1
            else:
                nums[i]=2
                n2-=1
        return nums
            
