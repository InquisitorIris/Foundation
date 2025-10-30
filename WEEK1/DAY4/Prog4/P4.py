print("Find sum of digits of N")
N=int(input("Enter N: "))
ans=0
n=N
ans=0
while(n>0):
    dig=n%10
    ans+=dig
    n//=10
print("Sum of digits of ",N,"=",ans)
