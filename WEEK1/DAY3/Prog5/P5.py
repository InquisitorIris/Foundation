def reverse(N):
    isNegative = N < 0
    if isNegative:
        N = -N 
    rev=0
    while N>0:
        dig=N%10
        rev=rev*10+dig
        N//=10
    if isNegative:
        rev = -rev
    return rev

print("Reverse N")
N=int(input("Enter N: "))
rev=reverse(N)
print("Reverse of ",str(N)," = ",str(rev))
