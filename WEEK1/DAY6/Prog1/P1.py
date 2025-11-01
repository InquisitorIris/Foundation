print("Find sum of squares of first N numbers")
N=int(input("Enter N: "))
ans=0
for i in range(1,N+1):
    ans+=(i*i)
print("Sum of squares of first ",N," numbers = ",ans)
