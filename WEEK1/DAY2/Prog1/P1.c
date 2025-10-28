#include <stdio.h>

int main(){
    int N;
    printf("Enter N: ");
    scanf("%d",&N);
    int ans = (N*(N+1))/2;
    printf("\nSum of first N numbers = %d\n",ans);
}
