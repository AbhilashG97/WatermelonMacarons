#include <stdlib.h>
#include <stdio.h>

int get_result(int houses[], int number_of_houses, int index)
{
    if (index >= number_of_houses)
    {
        return 0;
    }

    int items_one = houses[index] + get_result(houses, number_of_houses, index + 2);
    int items_two = get_result(houses, number_of_houses, index + 1);

    if (items_one > items_two)
    {
        return items_one;
    }
    else
    {
        return items_two;
    }
}

int main()
{
    int number_of_houses, items;
    scanf("%d", &number_of_houses);

    int *houses = malloc(sizeof(int) * number_of_houses);

    for (int i = 0; i < number_of_houses; i++)
    {
        scanf("%d", &houses[i]);
    }

    printf("%d", get_result(6, {9, 3, 5, 8, 2, 4}, 0));

    return 0;
}