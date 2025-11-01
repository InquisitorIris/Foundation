#include <stdio.h>
int factorial(int n){
    if(n==1 || n==0){
        return 1;
    }
    return n*factorial(n-1);
}
int main(){
    int N;
    printf("Check if N is strong number\n");
    printf("Enter N: ");
    scanf("%d",&N);
    int n=N;
    int dig;
    int ans=0;
    while(n>0){
        dig=n%10;
        ans+=factorial(dig);
        n/=10;
    }
    if(N==ans){
        printf("Strong number\n");
    }
    else{
        printf("Not strong number\n");
    }
}