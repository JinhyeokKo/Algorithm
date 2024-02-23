#include <stdio.h>
int main(void){
    char a[101]={};
    scanf("%s",a);
    for(int i=0;i<101;i++) {
        if (a[i] < 91)
            a[i] += 32;
        else if (a[i] > 91)
            a[i] -= 32;
        if (a[i] == 0)
            break;
    }
    printf("%s",a);
    return 0;
}