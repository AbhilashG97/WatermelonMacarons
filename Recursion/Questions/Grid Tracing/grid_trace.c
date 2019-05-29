#include <stdio.h>
#include <stdlib.h>

int get_result(int x, int y, int grid_size)
{
    if (x == grid_size && y == grid_size)
    {
        return 1;
    }

    if (x > grid_size || y > grid_size) 
    {
        return 0;
    }

    return get_result(x+1, y, grid_size) + get_result(x, y+1, grid_size);
}

int main()
{
    int n;
    scanf("%d", &n);

    printf("%d", get_result(1, 1, n));
    return 0;
}