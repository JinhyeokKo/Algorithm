#include <stdio.h>
int main(void){
    char a[101]={};
    int b=0;
    scanf("%s", a);
    for(int i=0;i<101;i++){
        if(a[i]==0) {
            b=i;
            break;
        }
    }
    printf("%d\n",b);
    return 0;
}