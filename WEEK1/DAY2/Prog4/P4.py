print("GCD of a and b")
a=int(input("Enter a: "))
b=int(input("Enter b: "))
if b>a:
    a,b=b,a
while b!=0:
    rem=a%b
    a=b
    b=rem
print("GCD = ",a)