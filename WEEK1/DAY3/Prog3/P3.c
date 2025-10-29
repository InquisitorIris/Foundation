#include <stdio.h>
void multiple15(int N){
    for(int i=1;i<=N;i++){
        if(i%15==0){
            printf("%d\n",i);
        }
    }
}
int main(){
    int N;
    printf("Print all numbers 1→N divisible by 3 and 5\n");
    printf("Enter N: ");
    scanf("%d",&N);
    multiple15(N);
}