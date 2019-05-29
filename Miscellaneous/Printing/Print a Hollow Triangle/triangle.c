#include <stdlib.h>
#include <stdio.h>

int main() 
{   
    int n;
    scanf("%d", &n);

    for (int row=1; row<=n; row++) 
    {
        for(int column=1; column<=2*n-1; column++) 
        {
            if(row == n || row + column == n+1 || column - row == n-1) 
            {
                printf("*");
            }
            else 
            {
                printf(" ");
            }
        }
        printf("\n");
    }

    return 0;
}