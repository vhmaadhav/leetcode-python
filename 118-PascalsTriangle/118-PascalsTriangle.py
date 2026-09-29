# Last updated: 9/29/2026, 9:33:48 AM
class Solution:
    def generate(self, nr: int) -> List[List[int]]:
        N=[]
        N.append([1])
        for i in range(nr-1):
            nr=[1]
            for j in range(i):
                nr.append(N[i][j]+N[i][j+1])
            nr.append(1)
            N.append(nr)
        return N