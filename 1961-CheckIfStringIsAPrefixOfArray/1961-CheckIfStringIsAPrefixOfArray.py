# Last updated: 9/29/2026, 9:31:42 AM
class Solution:
    def isPrefixString(self, s: str, W: List[str]) -> bool:
        temp=W[0]
        if temp==s:
            return True
        for i in range(1,len(W)+1):
            if temp==s:
                return True
            else:
                if (i<len(W)):
                    temp+=W[i]

        return False
                 