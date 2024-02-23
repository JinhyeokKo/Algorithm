#include <stdio.h>
int main(void){
    int X, N, a, b, c=0;
    scanf("%d\n", &X);
    scanf("%d\n", &N);
    for(int i=0; i<N; i++){
        scanf("%d %d", &a, &b);
        c+=(a*b);
    }
    if (c==X)
        printf("Yes");
    else printf("No");
    return 0;
}