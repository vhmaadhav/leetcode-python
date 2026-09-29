# Last updated: 9/29/2026, 9:33:26 AM
class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        return len(set(nums))!=len(nums)