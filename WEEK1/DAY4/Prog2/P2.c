#include <stdio.h>
int main(){
    printf("Print sum of even and odd numbers separately up to N\n");
    int N;
    printf("Enter N: ");
    scanf("%d",&N);
    int eSum=0;
    int oSum=0;
    for(int i=1;i<=N;i++){
        if(i%2==0){
            eSum+=i;
        }
        else{
            oSum+=i;
        }
    }
    printf("Even sum upto %d = %d\n",N,eSum);
    printf("Odd sum upto %d = %d\n",N,oSum);
}