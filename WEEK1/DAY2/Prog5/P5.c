#include <stdio.h>
int gcd(int a, int b){
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
    return a;
}

int main(){
    int a,b,g;
    printf("LCM of a and b\n");
    printf("Enter a: ");
    scanf("%d",&a);
    printf("Enter b: ");
    scanf("%d",&b);
    g=gcd(a,b);
    int l=(a*b)/g;
    printf("LCM = %d\n",l);
}
