print("Factorial of N")
N=int(input("Enter N: "))
ans=1
for i in range(2,N+1):
    ans*=i
print("Factorial of N = ",ans)
