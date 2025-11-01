print("Find smallest digit in N")
N=int(input("Enter N: "))
m=10
n=N
while(n>0):
    dig=n%10
    if m>dig:
        m=dig
    n//=10
print("The smallest digit in ",N," is ",m)
