import math
print("Print all factors of N")
N = int(input("Enter N: "))
for i in range(1, int(math.sqrt(N)) + 1):
    if N % i == 0:
        print(i)
for i in range(int(math.sqrt(N)), 0, -1):
    if N % i == 0 and i != N // i:
        print(N // i)
