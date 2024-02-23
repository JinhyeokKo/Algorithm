#include <stdio.h>
int main() {
    int N1=0, N2=0, Y=0, M=0;
    scanf("%d", &N1);
    for(int i=0;i<N1;i++) {
        scanf("%d", &N2);
        if(N2%30==0 || N2/30<1)
            Y+=(N2/30*10)+10;
        else Y+=(N2/30+1)*10;
        if(N2%60==0 || N2/60<1)
            M+=(N2/60*15)+15;
        else M+=(N2/60+1)*15;
    }
    if (Y<M)
        printf("Y %d",Y);
    else if (Y==M)
        printf("Y M %d",Y);
    else
        printf("M %d",M);
    return 0;
}