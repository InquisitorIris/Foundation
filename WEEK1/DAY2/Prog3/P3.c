#include <stdio.h>
int main(){
    printf("Check if N is a prime number\n");
    printf("Enter N: ");
    int N;
    scanf("%d",&N);
    int ans=1;
    if(N<=1){
        ans=0;
    }
    if(N<=3){
        ans=1;
    }
    if(N%2==0 || N%3==0){
        ans=0;
    }
    int i=5;
    while (i*i<=N){
        if (N%i==0 || N%(i+2)==0){
            ans=0;
            break;
        }
        i=i+2;
    }
    if(ans==1){
        printf("Prime\n");
    }
    else{
        printf("Not Prime\n");
    }
}
