# Last updated: 9/29/2026, 9:35:09 AM
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        prevMap = {}

        for i, n in enumerate(nums):
            diff = target - n
            if diff in prevMap:
                return [prevMap[diff],i]
            else:
                prevMap[n]=i
        return