# cook your dish here
import sys

def solve():

t=int(sys.stdin.readline())

for_in range(t):
    n,x,y=map(int ,sys.stdin.readline().split())
    
    if n<=3:
    total_coast=n*n;
    else :
        total_coast=(3*x)+((n-3)*y)
        print(total_coast)
        
        if __name__ ==' __main__':
            solve()