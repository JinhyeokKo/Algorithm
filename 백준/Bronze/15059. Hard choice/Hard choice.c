#include <stdio.h>
int main() {
    int Ca=0, Ba=0, Pa=0, Cr=0, Br=0, Pr=0;
    int X=0,Z=0;
    scanf("%d %d %d", &Ca, &Ba, &Pa);
    scanf("%d %d %d", &Cr, &Br, &Pr);
    if (Ca-Cr<0)
        X=Cr-Ca;
    if (Ba-Br<0)
        X+=(Br-Ba);
    if (Pa-Pr<0)
        X+=(Pr-Pa);
    printf("%d",X);
    return 0;
}