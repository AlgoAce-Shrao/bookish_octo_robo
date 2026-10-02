//implementation of stack using  arrays in c

#include<stdio.h>

#define MAX 10  //size of the static array

struct stack{
    int top;
    int a[MAX];
};

void init(struct stack *s){
    s->top=-1;
}

void push(struct stack * s,int n){
    if(s->top>=MAX-1) printf("No space left");
    s->top++;
    s->a[s->top]=n;
}

int pop(struct stack * s){
    if(s->top==-1) printf("Stack is empty");
    int x=s->a[s->top];
    s->top--;
    return x;
}

int  top(struct stack * s){
    if(s->top==-1) printf("Stack is empty");
    return s->a[s->top];
}

int size(struct stack * s){
    return s->top+1;
}

int main(){
    struct stack s;
    init(&s);

    push(&s, 6);
    push(&s, 3);
    push(&s, 7);

    printf("Top of the stack before deleting any element %d\n", top(&s));
    printf("Size of the stack before deleting any element %d\n", size(&s));
    printf("The element deleted is %d\n", pop(&s));
    printf("Size of the stack after deleting an element %d\n", size(&s));
    printf("Top of the stack after deleting an element %d\n", top(&s));
}