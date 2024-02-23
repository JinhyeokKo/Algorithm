#include <stdio.h>
int main() {
    int N=0;
    while(1){
        scanf("%d", &N);
        int T=0;
        if (N==0)
            break;
        for(int i=1;i<=N;i++){
            T+=(i*i);
        }
        printf("%d\n",T);
    }
    return 0;
}