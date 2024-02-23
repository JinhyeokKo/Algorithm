#include <stdio.h>
int main() {
    int N=0, A=0, Min=1000000, Max=-1000000;
    scanf("%d", &N);
    for(int i=0;i<N;i++){
        scanf("%d", &A);
        if(Min>A)
            Min=A;
        if(Max<A)
            Max=A;
    }
    printf("%d %d", Min, Max);
    return 0;
}