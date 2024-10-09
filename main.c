#include <stdio.h>
#include <stdlib.h>
#include "inventory.h"
#include "add.h"
#include "subtract.h"
#include "multiply.h"
#include "divide.h"
#include "execute.h"
int main(void) {
    srand(42);  // Set random seed for consistent results
    int NUM_ITEMS = 5;
    infoItem items[NUM_ITEMS];

    // Try loading existing inventory from file
    printf("Do you want to load the inventory from file? (y/n):\n");
    char choice;
    scanf(" %c", &choice);
    getchar();  // Clear newline character from buffer

    if (choice == 'y' || choice == 'Y') {
        readInventory(items, &NUM_ITEMS);
        displayInventory(items, NUM_ITEMS);
    } else {
        generateRandomInventory(items, NUM_ITEMS);
        displayInventory(items, NUM_ITEMS);
        writeInventory(items, NUM_ITEMS);
    }
    testSortFunctions(items, NUM_ITEMS);
    long result;

    result = execute(5, 3, add);
    printf("5 + 3 = %ld\n", result);

    result = execute(5, 3, subtract);
    printf("5 - 3 = %ld\n", result);

    result = execute(5, 3, multiply);
    printf("5 * 3 = %ld\n", result);

    result = execute(6, 3, divide);
    printf("6 / 3 = %ld\n", result);

    return 0;
}
