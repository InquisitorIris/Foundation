#include <stdio.h>
int main(){
    int N;
    printf("Generate Fibonacci series up to N terms\n");
    printf("Enter N: ");
    scanf("%d",&N);
    int a=0;
    int b=1;
    for(int i=0;i<N;i++){
        print("%d\n",a);
        int c=a+b;
        a=b;
        b=c;
    }
}