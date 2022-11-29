def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        freq={}
        for i in range(len(strs)):
            stri= ''.join(sorted(strs[i]))
            if stri not in freq:
                freq[stri]=[strs[i]]
            else:
                freq[stri].append(strs[i])
        return freq.values()
