print("Find largest digit in N")
N=int(input("Enter N: "))
m=-1
n=N
while(n>0):
    dig=n%10
    if m<dig:
        m=dig
    n//=10
print("The largest digit in ",N," is ",m)
