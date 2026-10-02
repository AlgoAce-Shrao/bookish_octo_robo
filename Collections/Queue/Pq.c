#include <stdio.h>
#include <stdlib.h>

// Node structure
struct Node {
    int data;
    int priority;
    struct Node* next;
};

// Function to create new node
struct Node* newNode(int d, int p) {
    struct Node* temp = (struct Node*)malloc(sizeof(struct Node));
    temp->data = d;
    temp->priority = p;
    temp->next = NULL;
    return temp;
}

// Function to push according to priority
void enqueue(struct Node** head, int d, int p) {
    struct Node* temp = newNode(d, p);

    // If queue is empty OR new node has higher priority than head
    if (*head == NULL || p > (*head)->priority) {
        temp->next = *head;
        *head = temp;
    } else {
        struct Node* start = *head;

        // Traverse and insert at proper position
        while (start->next != NULL && start->next->priority >= p) {
            start = start->next;
        }

        temp->next = start->next;
        start->next = temp;
    }

    printf("Inserted %d with priority %d\n", d, p);
}

// Function to remove element with highest priority
void dequeue(struct Node** head) {
    if (*head == NULL) {
        printf("Queue is Empty\n");
        return;
    }

    struct Node* temp = *head;
    printf("Removed %d with priority %d\n", temp->data, temp->priority);
    *head = (*head)->next;
    free(temp);
}

// Peek at highest priority element
int peek(struct Node* head) {
    if (head == NULL) {
        printf("Queue is Empty\n");
        return -1;
    }
    return head->data;
}

// Check if empty
int isEmpty(struct Node* head) {
    return head == NULL;
}

// Display queue
void display(struct Node* head) {
    if (head == NULL) {
        printf("Queue is Empty\n");
        return;
    }
    printf("Priority Queue: ");
    while (head != NULL) {
        printf("(%d, priority=%d) -> ", head->data, head->priority);
        head = head->next;
    }
    printf("NULL\n");
}

// Main function
int main() {
    struct Node* pq = NULL;

    enqueue(&pq, 10, 2);
    enqueue(&pq, 20, 1);
    enqueue(&pq, 30, 3);
    enqueue(&pq, 40, 2);

    display(pq);

    printf("Top element is %d\n", peek(pq));

    dequeue(&pq);
    display(pq);

    return 0;
}
