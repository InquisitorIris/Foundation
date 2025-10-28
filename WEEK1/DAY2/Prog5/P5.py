print("LCM of a and b")
a=int(input("Enter a: "))
b=int(input("Enter b: "))

def gcd(a,b):
    if b>a:
        a,b=b,a
    while b!=0:
        rem=a%b
        a=b
        b=rem
    return a

g=gcd(a,b)
l=(a*b)//g
print("LCM = ",l)