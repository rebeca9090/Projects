#ifndef INVENTORY_H
#define INVENTORY_H

#define MAX_NAME_LENGTH 100
#define MAX_SUPPLIER_LENGTH 100

typedef struct {
    char itemName[MAX_NAME_LENGTH];
    int itemCount;
    float itemCost;
    char itemSupply[MAX_SUPPLIER_LENGTH];
} infoItem;

// Function declarations
void inputInventory(infoItem items[], int count);
void getItemName(infoItem* theRecord, char* spotToCopyTheName);
void setItemName(infoItem* theRecord, const char* newName);
void getItemSupplier(infoItem* theRecord, char* spotToCopyTheSupplier);
void setItemSupplier(infoItem* theRecord, const char* newSupplier);
int getItemCount(infoItem* theRecord);
void setItemCount(infoItem* theRecord, int newAmount);
double getItemCost(infoItem* theRecord);
void setItemCost(infoItem* theRecord, double newCost);
void toString(infoItem* theRecord, char* placeToPutTheString);
int compareByName(const infoItem* item1, const infoItem* item2);
int compareByCost(const infoItem* item1, const infoItem* item2);
int compareBySupplier(const infoItem* item1, const infoItem* item2);
int compareByCount(const infoItem* item1, const infoItem* item2);
void selectionSort(infoItem items[], int count, int (*compare)(const infoItem*, const infoItem*));
void swap(infoItem* first, infoItem* second);
void writeInventory(infoItem inventory[], int itemCount);
void readInventory(infoItem inventory[], int* itemCount);
void displayInventory(infoItem items[], int count);
void testSortFunctions(infoItem items[], int count);
void generateRandomInventory(infoItem items[], int count);

#endif //INVENTORY_H
