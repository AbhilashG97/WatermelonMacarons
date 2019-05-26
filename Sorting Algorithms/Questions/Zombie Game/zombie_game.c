#include <stdio.h>
#include <stdlib.h>

int compare_function(const void *a, const void *b)
{
    return (*(int *)a - *(int *)b);
}

char *get_result(int zombies[], int number_of_zombies, int player_energy, int player_time, int minimum_energy)
{
    if (player_time > number_of_zombies)
    {
        int total_player_energy = player_energy, temp = 0;
        for (int i = 0; i < number_of_zombies; i++)
        {
            if (total_player_energy > zombies[i])
            {
                temp = total_player_energy - zombies[i];
                total_player_energy += temp;
            }
            else
            {
                return "NO";
            }

            if (total_player_energy > minimum_energy)
            {
                return "YES";
            }
        }
    }
    else
    {
        return "NO";
    }
}

int main()
{
    int number_of_zombies, player_energy, player_time, minimum_energy;
    printf("Enter the following - \n1. Number of Zombies\n2. Player Energy\n3. Player Time\n");
    scanf("%d %d %d", &number_of_zombies, &player_energy, &player_time);

    int *zombies = malloc(sizeof(int) * number_of_zombies);
    printf("Enter zombie energies\n");
    for (int i = 0; i < number_of_zombies; i++)
    {
        scanf("%d", &zombies[i]);
    }

    printf("Enter minimum energy\n");
    scanf("%d", &minimum_energy);

    qsort(zombies, number_of_zombies, sizeof(int), compare_function);

    printf("%s", get_result(zombies, number_of_zombies, player_energy, player_time, minimum_energy));

    return 0;
}