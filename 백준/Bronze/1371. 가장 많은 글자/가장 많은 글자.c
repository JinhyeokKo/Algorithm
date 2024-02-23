#include <stdio.h>
int main(void){
    char a[5001];
    int count[26]={0};
    int max=0;
    while(gets(a)) {
        for (int i = 0; a[i]; i++)
                if (a[i] >= 'a' && a[i] <= 'z')
                    count[a[i] - 'a']++;
            }
    for(int i=0;i<26;i++)
        if (count[i]>max) max = count[i];

    for(int i=0;i<26;i++)
        if(count[i]==max) printf("%c", i+'a');
    return 0;
}