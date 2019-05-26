#include <stdlib.h>
#include <stdio.h>

int get_steps(int current, int number_of_steps)
{
    if (current == number_of_steps)
    {
        return 1;
    }

    if (current > number_of_steps)
    {
        return 0;
    }
    return get_steps(current + 1, number_of_steps) + get_steps(current + 2, number_of_steps);
}

int main()
{
    int steps;
    scanf("%d", &steps);

    printf("%d", get_steps(0, steps));
    return 0;
}