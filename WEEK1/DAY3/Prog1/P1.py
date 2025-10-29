print("Count the number of digits in N")
N=int(input("Enter N: "))
cnt=0
n=N
while N>0:
    cnt+=1
    N=N//10
print(str(n)+" has "+str(cnt)+" digits")
