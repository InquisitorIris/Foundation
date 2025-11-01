print("Find product of digits of N")
N=int(input("Enter N: "))
ans=1
n=N
while(n>0):
    d=n%10
    ans*=d
    n//=10
print("Product of digits of ",N," = ",ans)
