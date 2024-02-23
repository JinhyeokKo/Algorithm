#include <stdio.h>
#include <limits.h>
int main() {
    int A=0, D=0, Bi=0, Cj=0;
    while(1){
        scanf("%d %d", &A, &D);
        if (A+D==0){
            break;
        }
        int X[A];
        int Y[D];
        for(int i=0;i<A;i++){
            scanf("%d",&Bi);
            X[i]=Bi;
        }
        int min2=INT_MAX;
        for(int i=0;i<A;i++){
            if(X[i]<min2){
                min2=X[i];
            }
        }
        for(int i=0;i<D;i++){
            scanf("%d",&Cj);
            Y[i]=Cj;
        }
        int min=INT_MAX;
        int second_min=INT_MAX;
        for(int i=0;i<D;i++){
            if(Y[i]<=min){
                second_min=min;
                min=Y[i];
            }
        }
        for(int i=0;i<D;i++) {
            if (Y[i] < second_min && Y[i] != min) {
                second_min = Y[i];
            }
        }
        if (second_min<=min2)
            printf("N \n");
        else printf("Y \n");
    }
    return 0;
}