//implementation of stack using linked list in c
#include <stdio.h>
#include <stdlib.h>

// Node definition
struct Node {
    int data;
    struct Node* next;
};

// Stack definition
struct Stack {
    struct Node* top;
    int size;
};

// Initialize stack
void init(struct Stack* s) {
    s->top = NULL;
    s->size = 0;
}

// Push operation
void push(struct Stack* s, int x) {
    struct Node* temp = (struct Node*) malloc(sizeof(struct Node));
    if (!temp) {
        printf("Heap overflow\n");
        return;
    }
    temp->data = x;
    temp->next = s->top;
    s->top = temp;
    s->size++;
}

// Pop operation
int pop(struct Stack* s) {
    if (s->top == NULL) {
        printf("Stack underflow\n");
        return -1;
    }
    int topData = s->top->data;
    struct Node* temp = s->top;
    s->top = s->top->next;
    free(temp);
    s->size--;
    return topData;
}

// Top operation
int top(struct Stack* s) {
    if (s->top == NULL) {
        printf("Stack empty\n");
        return -1;
    }
    return s->top->data;
}

// Stack size
int stackSize(struct Stack* s) {
    return s->size;
}

// Stack is empty?
int stackIsEmpty(struct Stack* s) {
    return s->top == NULL;
}

// Print stack
void printStack(struct Stack* s) {
    struct Node* temp = s->top;
    while (temp != NULL) {
        printf("%d -- ", temp->data);
        temp = temp->next;
    }
    printf("NULL\n");
}

// Driver
int main() {
    struct Stack s;
    init(&s);

    push(&s, 10);
    push(&s, 20);
    push(&s, 30);

    printf("Stack: ");
    printStack(&s);

    printf("Element popped: %d\n", pop(&s));
    printf("Stack size: %d\n", stackSize(&s));
    printf("Stack is empty: %s\n", stackIsEmpty(&s) ? "true" : "false");

    printf("Stack after pop: ");
    printStack(&s);

    printf("Top element: %d\n", top(&s));

    return 0;
}
