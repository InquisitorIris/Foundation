def factorial(n):
    if n==1 or n==0:
        return 1
    return n*factorial(n-1)

print("Check if N is strong number")
N=int(input("Enter N: "))
n=N
ans=0
while n>0:
    dig=n%10
    ans+=factorial(dig)
    n//=10
if(ans==N):
    print("Strong number")
else:
    print("Not strong number")
