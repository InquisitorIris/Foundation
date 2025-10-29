"""def numDig(N):
    cnt=0
    while N>0:
        N//=10
        cnt+=1
    return cnt"""

def reverse(N):
    rev=0
    while N>0:
        """dig=N%10
        rev+=dig*(10**(c-1))
        c-=1
        N//=10"""
        dig=N%10
        rev=rev*10+dig
        N//=10
    return rev

print("Check if N is a palindrome")
N=int(input("Enter N: "))
if N<0:
    print("Not palindrome")
elif N==reverse(N):
    print("Palindrome")
else:
    print("Not palindrome")
