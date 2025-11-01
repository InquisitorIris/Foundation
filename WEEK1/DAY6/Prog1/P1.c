#include <stdio.h>
int main(){
    int N;
    printf("Find sum of squares of first N numbers\n");
    printf("Enter N: ");
    N=scanf("%d",&N);
    int ans=0;
    for(int i=1;i<=N;i++){
        ans+=(i*i);
    }
    printf("Sum of squares of first %d numbers = %d\n",N,ans);
}