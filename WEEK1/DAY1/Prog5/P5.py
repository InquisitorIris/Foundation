a=int(input("Enter the first number: "))
b=int(input("Enter the second number: "))
c=int(input("Enter the third number: "))

if (a>=b) and (a>=c):
    ans=a
elif (b>=a) and (b>=c):
    ans=b
else:
    ans=c

print("The largest number is ",ans)
