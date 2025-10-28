#include <stdio.h>
int main(){
    int a,b;
    printf("GCD of a and b\n");
    printf("Enter a: ");
    scanf("%d",&a);
    printf("\nEnter b: ");
    scanf("%d",&b);

    if(b>a){
        int c=a;
        a=b;
        b=c;
    }

    int rem;
    while(b!=0){
        rem=a%b;
        a=b;
        b=rem;
    }
    printf("GCD = %d\n",a);
}
