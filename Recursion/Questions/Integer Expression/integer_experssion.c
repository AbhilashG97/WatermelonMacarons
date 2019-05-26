#include <stdio.h>
#include <stdlib.h>

int main() 
{   
    int number;
    scanf("%d", &number);
    int quotient = number/11;
    int remainder = number%11;

    if (remainder == 0) 
    {
        printf("%d", (2*quotient) + (quotient-1));
    }
    else 
    {
    }

    return 0;    
}