#include <stdio.h>
#include <stdlib.h>

// Node structure
struct QueueNode {
    int val;
    struct QueueNode* next;
};

// Queue structure
struct Queue {
    struct QueueNode* start;
    struct QueueNode* end;
    int size;
};

// Function to create a new node
struct QueueNode* createNode(int data) {
    struct QueueNode* newNode = (struct QueueNode*)malloc(sizeof(struct QueueNode));
    if (newNode == NULL) {
        return NULL;  // memory allocation failed
    }
    newNode->val = data;
    newNode->next = NULL;
    return newNode;
}

// Initialize Queue
void initQueue(struct Queue* q) {
    q->start = NULL;
    q->end = NULL;
    q->size = 0;
}

// Check if queue is empty
int isEmpty(struct Queue* q) {
    return (q->start == NULL);
}

// Peek front element
int peek(struct Queue* q) {
    if (isEmpty(q)) {
        printf("Queue is Empty\n");
        return -1;
    }
    return q->start->val;
}

// Enqueue operation
void enqueue(struct Queue* q, int value) {
    struct QueueNode* temp = createNode(value);
    if (temp == NULL) {
        printf("Queue is Full (Heap exhausted)\n");
        return;
    }
    if (q->start == NULL) {
        q->start = temp;
        q->end = temp;
    } else {
        q->end->next = temp;
        q->end = temp;
    }
    printf("%d Inserted into Queue\n", value);
    q->size++;
}

// Dequeue operation
void dequeue(struct Queue* q) {
    if (isEmpty(q)) {
        printf("Queue is Empty\n");
        return;
    }
    struct QueueNode* temp = q->start;
    printf("%d Removed From Queue\n", temp->val);
    q->start = q->start->next;
    free(temp);
    q->size--;
}

// Main function
int main() {
    struct Queue q;
    initQueue(&q);

    enqueue(&q, 10);
    enqueue(&q, 20);
    enqueue(&q, 30);
    enqueue(&q, 40);
    enqueue(&q, 50);

    dequeue(&q);

    printf("The size of the Queue is %d\n", q.size);
    printf("The Peek element of the Queue is %d\n", peek(&q));

    return 0;
}
