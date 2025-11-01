#include <stdio.h>
int main(){
    int N;
    printf("Find product of digits of N\n");
    printf("Enter N: ");
    N=scanf("%d",&N);
    int ans=1;
    int n=N;
    int dig;
    while(n>0){
        dig=n%10;
        ans*=dig;
        n/=10;
    }
    printf("Product of digits of %d = %d\n",N,ans);
}