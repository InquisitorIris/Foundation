def prime(n):
    if n<=1:
        return False
    if n==2 or n==3:
        return True
    if n%2==0 or n%3==0:
        return False
    i=5
    while i<=int(n**0.5):
        if n%i==0 or n%(i+2)==0:
            return False
        i+=6
    return True

print("Count primes between 1 and N")
N=int(input("Enter N: "))
cnt=0
for i in range(2,N+1):
    if prime(i):
        cnt+=1
print("There are "+cnt+"prime numbers")
