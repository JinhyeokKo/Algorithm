#include <stdio.h>
int main(){
    float max = 0, total = 0;
    float score[1000];
    int N;
    scanf("%d", &N);
    for(int i = 0; i<N; i++) {
        scanf("%f", &score[i]);
        if (score[i] > max)
            max = score[i];
    }
    for(int j = 0; j<N; j++){
        score[j] = score[j] / max * 100;
        total += score[j];
    }
    printf("%f", total/N);
    return 0;
}