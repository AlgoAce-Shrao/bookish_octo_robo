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

int search(struct node * root,int val){
    if(root==NULL) return -1;

    if(root->data==val) return root->data;
    else if(root->data<val){
        search(root->right,val);
    }else {
        search(root->left,val);
    }
}

struct node*insert(struct node* root,int val){
    if(root==NULL){
        return createnode(val);
    }

    while(!root){
        if(root->data<val){
            root->right=insert(root->right,val);
        }else{
            root->left=insert(root->left,val);
        }
    }

    return root;
}



int main(){
    struct node* root =createnode(50);
    root->left=createnode(30);
    root->right=createnode(70);
    root->left->left=createnode(20);
    root->left->right=createnode(40);
    root->right->left=createnode(30);
    root->right->right=createnode(80);

    printf("%d",search(root,90));

    printf("%d",insert(root,90));
    return 0;    
}