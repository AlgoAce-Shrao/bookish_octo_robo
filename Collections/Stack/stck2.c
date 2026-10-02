//implementation of stack using dynamic arrays
#include<stdio.h>

struct stack {
    int top;
    int capacity;
    int *a;
}

void init(struct stack *s,int capacity){
    s->top=-1;
    s->capacity=capacity;
    s->a=(int *)malloc(s->capacity*(sizeof(int )));
    if(!s->a) printf("Memory allocation failed");
}

void resize(struct stack *s){
    s->capacity*=2;
    s->a=(int*)realloc(s->capacity*sizeof(int));
     if(!s->a) printf("Reallocation failed");
}


void push(struct stack *s, int n) {
    if (s->top >= s->capacity - 1) {
        resize(s);
    }
    s->a[++(s->top)] = n;
}

int pop(struct stack *s) {
    if (s->top == -1) {
        printf("Stack is empty\n");
        return -1;
    }
    return s->a[(s->top)--];
}

int top(struct stack *s) {
    if (s->top == -1) {
        printf("Stack is empty\n");
        return -1;
    }
    return s->a[s->top];
}

int size(struct stack *s) {
    return s->top + 1;
}



int main(){
    struct stack s;
    init(&s, 2); // start with small capacity

    push(&s, 6);
    push(&s, 3);
    push(&s, 7); // will trigger resize
    push(&s, 10);

    printf("Top of the stack before deleting any element %d\n", top(&s));
    printf("Size of the stack before deleting any element %d\n", size(&s));
    printf("The element deleted is %d\n", pop(&s));
    printf("Size of the stack after deleting an element %d\n", size(&s));
    printf("Top of the stack after deleting an element %d\n", top(&s));

    freeStack(&s);
    return 0;
}