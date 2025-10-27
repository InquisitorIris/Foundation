#include <stdio.h>

int main(){
    int a,b,c,ans;
    printf("Enter the first number: ");
    scanf("%d",&a);
    printf("Enter the second number: ");
    scanf("%d",&b);
    printf("Enter the third number: ");
    scanf("%d",&c);

    /*
    if (a>=b){
        if (a>=c){
            ans=a;
        }
    }
    else {
        if (b>=c){
            ans=b;
        }
        else{
            ans=c;
        }
    }
    

    if (a>=b && a>=c){
        ans=a;
    }
    else{
        if (b>=a && b>=c){
            ans=b;
        }
        else{
            ans=c;
        }
    }
    */

    if (a>=b && a>=c){
        ans=a;
    }
    else if(b>=a && b>=c){
        ans=b;
    }
    else{
        ans=c;
    }

    printf("The largest number is %d\n",ans);

    return 0;
}