#include <stdio.h>
#include <stdlib.h>

int main() 
{
    int n;
    scanf("%d", &n);
    
    for(int row = 1; row <= 2*n-1; row++) 
    {
        for(int column = 1; column <= 2*n-1; column++) 
        {
            if( row+column == n+1 || column - row == n-1 || row - column == n-1 || row + column == 3*n-1) 
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
}