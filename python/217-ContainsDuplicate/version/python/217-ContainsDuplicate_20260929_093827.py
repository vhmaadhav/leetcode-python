# Last updated: 9/29/2026, 9:38:27 AM
1class Solution:
2    def containsDuplicate(self, nums: list[int]) -> bool:
3        hashset = set()
4
5        for i in nums:
6            if i in hashset:
7                return True
8            else:
9                hashset.add(i)
10        return False