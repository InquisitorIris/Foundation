#include <stdio.h>
#include <math.h>
int numDig(int N){
    int l=0;
    while(N>0){
        l+=1;
        N/=10;
    }
    return l;
}
void armstrong(int N){
    int l=numDig(N);
    int n=N;
    int dig;
    int ans=0;
    while(n>0){
        dig=n%10;
        ans+=(int)pow(dig,l);
        n/=10;
    }
    if(ans==N){
        printf("Armstrong number\n");
    }
    else{
        printf("Not armstrong number\n");
    }
}
int main(){
    int N;
    printf("Check if N is an Armstrong number\n");
    printf("Enter N: ");
    scanf("%d",&N);
    armstrong(N);
}