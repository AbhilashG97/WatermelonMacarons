#include <stdlib.h>
#include <stdio.h>

int* get_result(int freq[], int size, int unique_items) 
{
    
}

int main() 
{   
    int size, unique_items;
    scanf("%d", &n);

    int *input = (int *)malloc(sizeof(int) * n);
    for(int i=0; i<size; i++) 
    {
        scanf("%d", &input[i]);
    }

    int freq[100];
    for(int i=0; i<100; i++) 
    {
        freq[i] = 0;
    }

    for(int i=0; i<size; i++) 
    {
        freq[input[i]]++;
    }

    for(int i=0; i<100; i++) {
        if(freq[i] > 0) 
        {
            unique_items++;
        }
    }

    int *result = get_result(freq, 100, unique_items);

    for(int i=0; i<size; i++) 
    {
        printf("%d ", result[i]);
    }
    printf("\n");

    return 0;
}