#include <stdio.h>
int main(){
    int N;
    printf("Check if N is perfect number\n");
    printf("Enter N: ");
    scanf("%d",&N);
    int ans=0;
    for(int i=1;i<=(N/2);i++){
        if(N%i==0){
            ans+=i;
        }
    }
    if(N==ans){
        printf("\nPerfect number");
    }
    else{
        printf("\nNot perfect number");
    }
}