#include <stdio.h>
int main() {
    int A=0, B=0, V=0, X;
    scanf("%d %d %d", &A, &B, &V);
    if ((V-A)%(A-B)==0)
        X=(V-A)/(A-B)+1;
    else X=(V-A)/(A-B)+2;
    printf("%d", X);
    return 0;
}