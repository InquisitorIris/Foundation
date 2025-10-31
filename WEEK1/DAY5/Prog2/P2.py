print("Generate Fibonacci series up to N terms")
N=int(input("Enter N: "))
a,b=0,1
for i in range(N):
    print(a)
    a,b=b,a+b
