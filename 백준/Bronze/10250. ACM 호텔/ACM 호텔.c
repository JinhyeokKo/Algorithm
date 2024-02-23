#include <stdio.h>
int main() {
    int T=0, H=0, N=0, W=0;
    int F, R;
    scanf("%d", &T);
    for(int i=0;i<T;i++){
        scanf("%d %d %d", &H, &W, &N);
        if((N%H)==0) {
            F = H * 100;
            R = N / H;
        }
        else {
            F = N % H * 100;
            R = N / H + 1;
        }
        printf("%d\n", F+R);
    }
    return 0;
}