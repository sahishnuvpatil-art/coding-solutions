# cook your dish here
impoer sys 

def solve();
input =sys.stdin.read
data=input().split()

if not data:
    return 

t=int(data(0))
idx=1

out =[]
for _ in range(t);
n=int(data[idx])
a=[0] +[int(x) for x in data[idx+1: idx+1+n]]

dp=[-float ('inf')]*(n*1)

dp[1]=0

max_prev_expr=dp[1]+1;
for j in range (2,n+1)

dp[j]=