def singleNumber(self, nums: List[int]) -> List[int]:
        l=[]
        freq=defaultdict(lambda:0)
        for i in nums:
            freq[i]+=1
        for i in freq:
            if freq[i]==1:
                l.append(i)
        return l
