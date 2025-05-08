//
// Created by Rebeca on 9/11/2024.
//
#include <stdio.h>
#include <stdlib.h>

#include "inventory.h"
#include <string.h>

void inputInventory(infoItem items[], int count){
    for (int i = 0; i < count; i++) {
        printf("Enter details for item %d:\n", i + 1);
        printf("Item name: \n");
        fgets(items[i].itemName, MAX_NAME_LENGTH, stdin);
        items[i].itemName[strcspn(items[i].itemName, "\n")] = '\0';
        printf("Supplier name: \n");
        fgets(items[i].itemSupply, MAX_NAME_LENGTH, stdin);
        items[i].itemSupply[strcspn(items[i].itemSupply, "\n")] = '\0';
        printf("Cost of item: \n");
        scanf("%f", &items[i].itemCost);
        getchar();
        printf("Item Count: \n");
        scanf("%d", &items[i].itemCount);
        getchar();
    }
}

void getItemName(infoItem* theRecord, char* spotToCopyTheName) {
    strcpy(spotToCopyTheName, theRecord->itemName);
}
void setItemName(infoItem* theRecord, const char* newName) {
    strncpy(theRecord->itemName, newName, MAX_NAME_LENGTH);
    theRecord->itemName[MAX_NAME_LENGTH - 1] = '\0';
}

void getItemSupplier(infoItem* theRecord, char* spotToCopyTheSupplier) {
    strcpy(spotToCopyTheSupplier, theRecord->itemSupply);
}
void setItemSupplier(infoItem* theRecord, const char* newSupplier) {
    strncpy(theRecord->itemSupply, newSupplier, MAX_SUPPLIER_LENGTH);
    theRecord->itemSupply[MAX_SUPPLIER_LENGTH - 1] = '\0';
}

int getItemCount(infoItem* theRecord) {
    return theRecord->itemCount;
}
void setItemCount(infoItem* theRecord, int newAmount) {
    theRecord->itemCount = newAmount;
}

double getItemCost(infoItem* theRecord) {
    return theRecord->itemCost;
}
void setItemCost(infoItem* theRecord, double newCost) {
    theRecord->itemCost = newCost;
}

void toString(infoItem* theRecord, char* placeToPutTheString) {
    snprintf(placeToPutTheString, 256, "Item Name: %s, Supplier: %s, Count: %d, Cost: $%.2f",
             theRecord->itemName, theRecord->itemSupply, theRecord->itemCount, theRecord->itemCost);
}

int compareByName(const infoItem* item1, const infoItem* item2) {
    int ret = strcmp(item1->itemName, item2->itemName);
    if (ret == 0) {
        ret = strcmp(item1->itemSupply, item2->itemSupply);
    }
    return ret;
}
int compareByCost(const infoItem* item1, const infoItem* item2) {
    if (item1->itemCost < item2->itemCost) return -1;
    if (item1->itemCost > item2->itemCost) return 1;
    return 0;
}

int compareBySupplier(const infoItem* item1, const infoItem* item2) {
    return strcmp(item1->itemSupply, item2->itemSupply);
}
int compareByCount(const infoItem* item1, const infoItem* item2) {
    if (item1->itemCount < item2->itemCount) return -1;
    if (item1->itemCount > item2->itemCount) return 1;
    return 0;
}


void compareItemsByName(infoItem* item1, infoItem* item2) {
    printf("\nComparing two items by name:\n");
    printf("Comparing: %s and %s\n", item1->itemName, item2->itemName);
    int result = compareByName(item1, item2);
    printf("Result: %d\n", result);
}

void compareItemsByCost(infoItem* item1, infoItem* item2) {
    printf("\nComparing two items by cost:\n");
    printf("Comparing: %.2f and %.2f\n", item1->itemCost, item2->itemCost);
    int result = compareByCost(item1, item2);
    printf("Result: %d\n", result);
}


void writeInventory(infoItem inventory[], int itemCount) {
    FILE *file = fopen("../inventory.txt", "w");

    if (file == NULL) {
        printf("Error opening file for writing.\n");
        return;
    }

    // Write the number of items on the first line
    fprintf(file, "%d\n", itemCount);

    // Write each item's data on separate lines
    for (int i = 0; i < itemCount; i++) {
        fprintf(file, "%s\n%s\n%d\n%.2f\n",
                inventory[i].itemName,
                inventory[i].itemSupply,
                inventory[i].itemCount,
                inventory[i].itemCost);
    }

    fclose(file);  // Make sure to close the file properly
    printf("Inventory written to file successfully.\n");
}


void readInventory(infoItem inventory[], int *itemCount) {
    FILE *file = fopen("../inventory.txt", "r");  // Adjust the path if necessary
    if (file == NULL) {
        printf("Error opening file for reading.\n");
        return;
    }
    fscanf(file, "%d\n", itemCount);

    for (int i = 0; i < *itemCount; i++) {
        fgets(inventory[i].itemName, MAX_NAME_LENGTH, file);
        inventory[i].itemName[strcspn(inventory[i].itemName, "\n")] = '\0';  // Remove newline character


        fgets(inventory[i].itemSupply, MAX_SUPPLIER_LENGTH, file);
        inventory[i].itemSupply[strcspn(inventory[i].itemSupply, "\n")] = '\0';  // Remove newline character


        fscanf(file, "%d\n", &inventory[i].itemCount);
        fscanf(file, "%f\n", &inventory[i].itemCost);

        printf("Loaded Item %d: Name: %s, Supplier: %s, Count: %d, Cost: %.2f\n",
               i+1, inventory[i].itemName, inventory[i].itemSupply, inventory[i].itemCount, inventory[i].itemCost);
    }

    fclose(file);
    printf("Inventory loaded from file successfully.\n");
}

void swap(infoItem* first, infoItem* second) {
    infoItem temp = *first;
    *first = *second;
    *second = temp;
}
void selectionSort(infoItem items[], int count, int (*compare)(const infoItem*, const infoItem*)) {
    for (int i = 0; i < count - 1; i++) {
        int minIndex = i;
        for (int j = i + 1; j < count; j++) {
            if (compare(&items[j], &items[minIndex]) < 0) {
                minIndex = j;
            }
        }
        swap(&items[minIndex], &items[i]);
    }
}

void displayInventory(infoItem items[], int count) {
    printf("Displaying inventory:\n");
    printf("---------------------------------------------------\n");
    printf("| %-20s | %-15s | %-5s | %-10s |\n", "Item Name", "Supplier", "Count", "Cost");
    printf("---------------------------------------------------\n");

    for (int i = 0; i < count; i++) {
        printf("| %-20s | %-15s | %-5d | $%-9.2f |\n",
               items[i].itemName,
               items[i].itemSupply,
               items[i].itemCount,
               items[i].itemCost);
    }
    printf("---------------------------------------------------\n");
}

void testSortFunctions(infoItem items[], int count) {
    printf("\nSorting by Name:\n");
    selectionSort(items, count, compareByName);
    displayInventory(items, count);

    printf("\nSorting by Cost:\n");
    selectionSort(items, count, compareByCost);
    displayInventory(items, count);

    printf("\nSorting by Supplier:\n");
    selectionSort(items, count, compareBySupplier);
    displayInventory(items, count);

    printf("\nSorting by Count:\n");
    selectionSort(items, count, compareByCount);
    displayInventory(items, count);

}

void generateRandomInventory(infoItem items[], int count) {
    const char* names[] = {"Screwdriver", "Hammer", "Pliers", "Wrench", "Drill"};
    const char* suppliers[] = {"Ace Hardware", "Home Depot", "Lowe's", "Harbor Freight", "ToolKing"};

    for (int i = 0; i < count; i++) {
        snprintf(items[i].itemName, MAX_NAME_LENGTH, "%s", names[rand() % 5]);
        snprintf(items[i].itemSupply, MAX_SUPPLIER_LENGTH, "%s", suppliers[rand() % 5]);
        items[i].itemCost = (float) (rand() % 1000) / 10.0;  // Random cost between $0.0 and $100.0
        items[i].itemCount = rand() % 100 + 1;  // Random count between 1 and 100
    }
}


