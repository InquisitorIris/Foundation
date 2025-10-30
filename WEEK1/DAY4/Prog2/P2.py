print("Print sum of even and odd numbers separately up to N")
N=int(input("Enter N: "))
eSum=0
oSum=0
for i in range(1,N+1):
    if i%2==0:
        eSum+=i
    else:
        oSum+=i
print("Even sum upto",N,"=",eSum)
print("Odd sum upto",N,"=",oSum)
