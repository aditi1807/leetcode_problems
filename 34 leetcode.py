class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        beg=0
        end=len(nums)-1
        p1=-1
        p2=-1
        while(beg<=end):
            mid=(beg+end)//2
            if nums[mid]==target:
                p1=mid
                end=mid-1
            else:
                if target<nums[mid]:
                    end=mid-1
                else:
                    beg=mid+1
        beg=0
        end=len(nums)-1
        while(beg<=end):
            mid=(beg+end)//2
            if nums[mid]==target:
                p2=mid
                beg=mid+1
            else:
                if nums[mid]<target:
                    beg=mid+1
                else:
                    end=mid-1
        l=[]
        l.append(p1)
        l.append(p2)
        return l
