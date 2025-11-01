#include <stdio.h>
int main(){
    int N;
    printf("Find smallest digit in N\n");
    printf("Enter N: ");
    scanf("%d",&N);
    int m=10;
    int n=N;
    int dig;
    while(n>0){
        dig=n%10;
        if(m>dig){
            m=dig;
        }
        n/=10;
    }
    printf("The smallest digit in %d is %d\n",N,m);
}