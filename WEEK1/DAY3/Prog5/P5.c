#include<stdio.h>

int reverse(int N){
    int is_negative = N < 0;
    if(is_negative){
        N = -N; 
    }
    int rev=0;
    int dig=0;
    while(N>0){
        dig=N%10;
        rev=(rev*10)+dig;
        N/=10;
    }
    if(is_negative){
        rev = -rev;
    }
    return rev;
}

int main(){
    int N;
    printf("Reverse N\n");
    printf("Enter N: ");
    scanf("%d",&N);
    int rev=reverse(N);
    printf("Reverse of %d = %d\n",N,rev);
    return 0;
}