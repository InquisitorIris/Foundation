print("Print all numbers 1→N divisible by 3 and 5.")
def multiple15(N):
    for i in range(1,N+1):
        if i%15==0:
            print(i)

N=int(input("Enter N: "))
multiple15(N)
