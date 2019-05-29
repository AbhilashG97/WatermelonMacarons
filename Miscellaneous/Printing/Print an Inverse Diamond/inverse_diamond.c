#include <stdio.h>
#include <stdlib.h>

int main()
{
    int n;
    scanf("%d", &n);

    // upper half
    int upper_star1 = (n / 2), upper_star2 = (n / 2);
    int upper_space = 1;
    for (int i = 1; i <= (n / 2) + 1; i++)
    {
        for (int star1 = upper_star1; star1 > 0; star1--)
        {
            printf("*");
        }

        for (int j = 1; j <= upper_space; j++)
        {
            printf(" ");
        }
        upper_space += 2;

        for (int star2 = upper_star2; star2 > 0; star2--)
        {
            printf("*");
        }
        upper_star1--;
        upper_star2--;
        printf("\n");
    }

    // lower half
    int lower_star1 = 1, lower_star2 = 1, lower_space = n - 2;
    for (int k = n / 2; k > 0; k--)
    {
        for (int star1 = lower_star1; star1 > 0; star1--)
        {
            printf("*");
        }

        for (int m = lower_space; m > 0; m--)
        {
            printf(" ");
        }
        lower_space -= 2;

        for (int star2 = lower_star2; star2 > 0; star2--)
        {
            printf("*");
        }
        lower_star1++;
        lower_star2++;
        printf("\n");
    }
    return 0;
}