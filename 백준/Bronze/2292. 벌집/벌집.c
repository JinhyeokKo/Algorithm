#include <stdio.h>
int main(){
    int N, Z = 1, Y = 0;
    scanf("%d", &N);
    for(int i = 0; 6*(Y+i)+1<N; i++){
        if(i >= 1)
            Y += i;
        Z+=1;
    }
    printf("%d", Z);
    return 0;
}