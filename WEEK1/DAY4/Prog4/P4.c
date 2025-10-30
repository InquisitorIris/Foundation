#include <stdio.h>
int main(){
    int N;
    printf("Find sum of digits of N");
    printf("Enter N: ");
    scanf("%d",&N);
    int ans=0;
    int n=N;
    int dig;
    while(n>0){
        dig=n%10;
        ans+=dig;
        n/=10;
    }
    printf("Sum of digits of %d = %d\n",N,ans);
}