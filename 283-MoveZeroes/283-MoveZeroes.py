# Last updated: 9/29/2026, 9:33:15 AM
from typing import List

class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Moves all zeros to the end of the array while maintaining the relative order of non-zero elements.
        Operates in-place with O(1) extra space and O(n) time.
        """
        non_zero_position = 0
        # Place non-zero elements in their correct positions
        for num in nums:
            if num != 0:
                nums[non_zero_position] = num
                non_zero_position += 1
        # Fill the remaining positions with zeros
        for i in range(non_zero_position, len(nums)):
            nums[i] = 0
