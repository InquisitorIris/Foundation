#include <stdio.h>
int main(){
    printf("Check whether a character is vowel or consonant\n");
    char c;
    printf("Enter character: ");
    scanf("%c",&c);
    if ( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') ) {
        if(c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U'){
            printf("Vowel\n");
        }
        else{
            printf("Consonant\n");   
        }
    }
    else{
        printf("This is not an alphabet\n");
    }
}