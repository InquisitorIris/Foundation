#include <stdio.h>
int main(){
    int N;
    printf("Factorial of N\n");
    printf("Enter N: ");
    scanf("%d",&N);
    int ans=1;
    for(int i=2; i<=N; i++){
        ans*=i;
    }
    printf("Factorial of %d = %d\n",N,ans);
}