print("Check if N is perfect number")
N = int(input("Enter N: "))
ans=0
for i in range(1,(N//2)+1):
    if N%i==0:
        ans+=i
if ans==N:
    print("Perfect number")
else:
    print("Not perfect number")
