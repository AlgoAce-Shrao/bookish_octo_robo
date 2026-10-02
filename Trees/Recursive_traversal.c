// program to learn the traveersal techniques with recursion
#include<stdio.h>
#include<stdlib.h>

//create a node 
struct node{
    int data;
    struct node*left;
    struct node*right;
};

//function to initilaise a node

struct node * createnode(int key){
    struct node* newnode=(struct node*)malloc(sizeof(struct node));
    newnode->data=key;
    newnode->left=NULL;
    newnode->right=NULL;
    return newnode;
}

void preorder(struct node* d){
    if (d==NULL) return;

    printf("%d ", d->data);
    preorder(d->left);
    preorder(d->right);
}

void inorder(struct node* d){
    if(d==NULL) return;

    inorder(d->left);
    printf(" %d ",d->data);
    inorder(d->right);

}

void postorder(struct node* d){
    if(d==NULL) return;

    postorder(d->left);
    postorder(d->right);
    printf(" %d ",d->data);
}

int main(){
    struct node* root =createnode(1);
    root->left=createnode(2);
    root->right=createnode(3);
    root->left->left=createnode(4);
    root->left->right=createnode(5);
    root->right->left=createnode(6);
    root->right->right=createnode(7);

    // preorder(root);
    // inorder(root);
    postorder(root);
    return 0;
}