def numDigit(N):
    l=0
    while N>0:
        l+=1
        N//=10
    return l
def armstrong(N):
    l=numDigit(N)
    ans=0
    n=N
    while(n>0):
        dig=n%10
        ans+=(dig**l)
        n//=10
    if ans==N:
        print("Armstrong number")
    else:
        print("Not armstrong number")

if __name__=='__main__':
    print("Check if N is an Armstrong number")
    N=int(input("Enter N: "))
    armstrong(N)
