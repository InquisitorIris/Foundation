#include <stdio.h>
#include <math.h>
int prime(int n){
    if(n<2){
        return 0;
    }
    if(n==2 || n==3){
        return 1;
    }
    if(n%2==0 || n%3==0){
        return 0;
    }
    int i=5;
    while(i<(int)pow(n,0.5)){
        if(n%i==0 || n%(i+2)==0){
            return 0;
        }
        i+=6;
    }
    return 1;
}
int main(){
    int N;
    printf("Count primes between 1 and N\n");
    printf("Enter N: ");
    scanf("%d",&N);
    int cnt=0;
    for(int i=2;i<=N;i++){
        if(prime(i)==1){
            cnt+=1;
        }
    }
    printf("There are %d prime numbers\n",cnt);
}