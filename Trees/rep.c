// Representation of binary tree 
#include<stdio.h>
#include<stdlib.h>

struct node{
    int data;
    struct node* left;
    struct node* right;

};

// function to create a node  and initialise them
struct node* createnode(int key){
    struct node* newnode=(struct node*)malloc(sizeof(struct node));
    newnode->data=key;
    newnode->left=NULL;
    newnode->right=NULL;

    return newnode;
}

int main(){
    struct node* root =createnode(1);
    root->left=createnode(2);
    root->right=createnode(3);
    root->left->right=createnode(4);

    printf("Root: %d\n", root->data);
    printf("Left Child: %d\n", root->left->data);
    printf("Right Child: %d\n", root->right->data);

    return 0;
}