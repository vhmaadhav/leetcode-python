# Last updated: 9/29/2026, 9:59:51 AM
1class Solution:
2    def isAnagram(self, s: str, t: str) -> bool:
3        if len(s) != len(t):
4            return False
5        
6        count = {}
7
8        for char in s:
9            count[char] = count.get(char,0) + 1
10        
11        for char in t:
12            if char not in count:
13                return False
14            
15            count[char] -=1
16
17            if count[char]< 0:
18                return False
19        return True