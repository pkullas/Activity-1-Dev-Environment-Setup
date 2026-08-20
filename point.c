#include <stdio.h>

int main()
{
    int n;
    printf("enter n values");
    scanf("%d",&n);
    int A[n];
    for(int i=0;i<n;i++)
    {
        scanf("%d",&A[i]);
    }
    int *p=A;
    printf("%d\t",*p++);
    printf("%d\t",++*p);
    printf("%d\t",*++p);

    return 0;
}