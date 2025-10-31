print("Print first N prime numbers")
N = int(input("Enter N: "))
cnt=0
num=2
while cnt<N:
    flag=True
    for i in range(2, int(num ** 0.5) + 1):
        if num%i==0:
            flag=False
            break
    if flag:
        print(num)
        cnt+=1
    num+=1
