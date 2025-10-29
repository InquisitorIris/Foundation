#include <stdio.h>
int main(){
    int N;
    printf("Count the number of digits in N\n");
    printf("Enter N: ");
    scanf("%d",&N);
    int cnt=0;
    int n=N;
    while(n>0){
        n=n/10;
        cnt=cnt+1;
    }
    printf("%d has %d digits\n",N,cnt);
}