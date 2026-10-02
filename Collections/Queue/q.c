//queue implementation using arrays
#include <stdio.h>
#include <stdlib.h>

struct Queue {
    int *a;        // dynamic array for queue
    int start;
    int end;
    int currSize;
    int maxSize;
};

// function to initialize with given size
void init(struct Queue *q, int maxSize) {
    q->maxSize = maxSize;
    q->a = (int*) malloc(maxSize * sizeof(int));
    q->start = -1;
    q->end = -1;
    q->currSize = 0;
}

// enqueue operation
void push(struct Queue *q, int n) {
    if (q->currSize >= q->maxSize) {
        printf("The queue is full\n");
        return;
    }
    if (q->currSize == 0) {
        q->start = 0;
        q->end = 0;
    } else {
        q->end = (q->end + 1) % q->maxSize;
    }
    q->a[q->end] = n;
    q->currSize++;
}

// dequeue operation
int pop(struct Queue *q) {
    if (q->currSize == 0) {
        printf("Queue empty\n");
        return -1;
    }
    int x = q->a[q->start];
    if (q->currSize == 1) {
        q->start = -1;
        q->end = -1;
    } else {
        q->start = (q->start + 1) % q->maxSize;
    }
    q->currSize--;
    return x;
}

// peek operation
int top(struct Queue *q) {
    if (q->currSize == 0) {
        printf("Queue empty\n");
        return -1;
    }
    return q->a[q->start];
}

// return size
int size(struct Queue *q) {
    return q->currSize;
}

void display(struct Queue *q) {
    if (q->currSize == 0) {
        printf("Queue is empty\n");
        return;
    }
    printf("Queue elements: ");
    int i = q->start;
    for (int count = 0; count < q->currSize; count++) {
        printf("%d ", q->a[i]);
        i = (i + 1) % q->maxSize;  // move circularly
    }
    printf("\n");
}

int main() {
    struct Queue q;
    init(&q, 6);

    push(&q, 4);
    push(&q, 14);
    push(&q, 24);
    push(&q, 34);

    printf("The peek of the queue before deleting any element: %d\n", top(&q));
    printf("The size of the queue before deletion: %d\n", size(&q));
    printf("The first element to be deleted: %d\n", pop(&q));
    printf("The peek of the queue after deleting an element: %d\n", top(&q));
    printf("The size of the queue after deleting an element: %d\n", size(&q));

    free(q.a); // free allocated memory
    return 0;
}
