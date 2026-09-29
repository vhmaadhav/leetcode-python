# Last updated: 9/29/2026, 2:05:56 PM
1class Solution:
2    def twoSum(self, nums: list[int], target: int) -> list[int]:
3
4        hashmap = {}
5
6        for i, num in enumerate(nums):
7            complement = target - num
8
9            if complement in hashmap:
10                return [hashmap[complement], i]
11
12            hashmap[num] = i