#include <stdio.h>

int main() {
    int arr[100], n, i, key;
    int low, high, mid, found = 0;
    printf("Enter the number of elements: ");
    scanf("%d", &n);
    printf("Enter %d sorted elements (ascending order):\n", n);
    for(i = 0; i < n; i++) {
        printf("Element [%d]: ", i);
        scanf("%d", &arr[i]);
    }
    printf("Enter the element to search: ");
    scanf("%d", &key);
    low = 0;
    high = n - 1;
    while(low <= high) {
        mid = (low + high) / 2;
        if(arr[mid] == key) {
            printf("Element %d found at position %d (index %d).\n", key, mid+1, mid);
            found = 1;
            break;
        }
        else if(arr[mid] < key) {
            low = mid + 1;
        }
        else {
            high = mid - 1;
        }
    }
    if(!found) {
        printf("Element %d not found in the array.\n", key);
    }
    return 0;
}