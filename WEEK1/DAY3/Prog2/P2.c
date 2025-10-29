#include<stdio.h>

int reverse(int N){
    int rev=0;
    int dig=0;
    while(N>0){
        dig=N%10;
        rev=(rev*10)+dig;
        N/=10;
    }
    return rev;
}

int main(){
    int N;
    printf("Check if N is a palindrome\n");
    printf("Enter N: ");
    scanf("%d",&N);
    if(N<0){
        printf("Not palindrome\n");
    }
    else{
        if(reverse(N)==N){
            printf("Palindrome\n");
        }
        else{
            printf("Not palindrome\n");
        }
    }
    return 0;
}