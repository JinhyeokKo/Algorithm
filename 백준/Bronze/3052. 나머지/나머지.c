#include <stdio.h>
int main(void){
    int L=0, N = 0;
    int M[10];
    for(int i=0;i<10;i++){
        scanf("%d", &N);
        M[i] = (N%42);
    }
    for(int i=0;i<10;i++){
        int K=0;
        for(int c=i+1;c<10;c++){
            if(M[i]==M[c])
                K++;
        }
        if(K==0)
            L++;
    }
    printf("%d", L);
    return 0;
}