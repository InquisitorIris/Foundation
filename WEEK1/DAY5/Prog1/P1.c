#include <stdio.h>
#include <math.h>

int main() {
    int N;
    printf("Print all factors of N\n");
    printf("Enter N: ");
    scanf("%d", &N);
    for (int i = 1; i <= (int)sqrt(N); i++){
        if (N % i == 0){
            printf("%d\n", i);
        }
    }
    for (int i = (int)sqrt(N); i >= 1; i--) {
        if (N % i == 0 && i != (N / i)) {
            printf("%d\n", N / i);
        }
    }
    return 0;
}
