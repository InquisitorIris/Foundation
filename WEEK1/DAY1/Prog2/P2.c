#include <stdio.h>
int main(void){
    printf("INTEGER SUM\n");
    int a=2;
    int b=3;
    int s1=a+b;
    printf("a = %d\n", a);
    printf("b = %d\n", b);
    printf("a+b = %d\n", s1);

    int c,d,s2;
    printf("Enter c: ");
    scanf("%d", &c);
    printf("Enter d: ");
    scanf("%d", &d);
    s2=c+d;
    printf("c+d = %d\n", s2);

    printf("*********************\n");

    printf("DECIMAL SUM\n");
    double a1=2.1;
    double b1=3.4;
    double s3=a1+b1;
    printf("a1 = %lf\n", a1);
    printf("b1 = %lf\n", b1);
    printf("a1+b1 = %lf\n", s3);

    double c1,d1,s4;
    printf("Enter c1: ");
    scanf("%lf", &c1);
    printf("Enter d1: ");
    scanf("%lf", &d1);
    s4=c1+d1;
    printf("\n");
    printf("c1+d1 = %lf\n", s4);

    return 0;
}