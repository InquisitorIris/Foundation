#include <stdio.h>
int main(){
    int Y;
    int ans=0;
    printf("Check if the year is a leap year\n");
    printf("Enter the year: ");
    scanf("%d",&Y);
    if(Y<1){
        printf("\nInvalid year");
    }
    else if(Y%400==0){
        ans=1;
    }
    else{
        if(Y%4==0 && Y%100!=0){
            ans=1;
        }
        else{
            ans=0;
        }
    }
    if(ans==1){
        printf("%d is a leap year!\n",Y);
    }
    else{
        printf("%d is not a leap year!\n",Y);
    }
}
