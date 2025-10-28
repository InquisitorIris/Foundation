print("Check if N is a prime number")
N=int(input("Enter N: "))
ans=True
if N<=1:
    ans=False
if N<=3:
    ans=True
if N%2==0 or N%3==0:
    ans=False
i=5
while i*i<=N:
    if N%i==0 or N%(i+2)==0:
        ans=False
        break
    i+=6

if ans==True:
    print("Prime")
else:
    print("Not prime")