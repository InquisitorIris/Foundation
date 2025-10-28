print("Check if the year is a leap year")
Y=int(input("Enter the year: "))
ans=False
if Y<1:
    print("Invalid entry")
elif (Y%400==0):
    ans=True
else:
    if (Y%4==0 and Y%100!=0):
        ans=True
    else:
        ans=False

if ans==True:
    print(str(Y),"is a leap year!")
else:
    print(str(Y),"is not a leap year!")