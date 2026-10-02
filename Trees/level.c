//level order traversal

#include<stdio.h>
#include<stdlib.h>
struct node {
    int data;
    struct node* left;
    struct node* right;
};

struct queue{
    int a*;
    int start;
    int end;
    int currsize;
    int maxsize;
};


struct node * createnode(int d){
    struct node* newnode=(struct node*)malloc(sizeof(struct node))    ;
    newnode->data=d;
    newnode->left=NULL;
    newnode->right=NULL;
}

//queue ds to implenment level order
void init(struct queue*q,int maxsize){
    q->maxsize=maxsize;
    q->currsize=0;
    q->start=-1;
    q->end=-1;
    q->a=(int *)malloc(maxsize*sizeof(int));
}


//enqueue 
void enqu(struct queue *q,int d){
    if(q->currsize>=q->maxsize){
        printf("queue full");
        return;
    }
    if(q->currsize==0){
        q->start=0;
        q->end=0;
    }else{
        q->end=(q->end+1)%q->maxsize;
    }
    q->a[q->end]=d;
    q->currsize++;
}

int dequeue(struct queue *q){
    if(q->currsize==0){
        printf("queue emoty");
        return;

    }
    int x=q->a[q->start];
    if(q->currsize==1){
        q->start=-1;
        q->end=-1;
    }else{
        q->start=(q->start+1)%q->maxsize;
    }

    q->currsize--;
    return x;
}

int isEmpty(struct queue*q){
    return q->currsize==0;
}
void levelorder(struct node*root){
    if (root==NULL) return;

    enqueue(root);
    while(!isEmpty()){
        struct node* curr=dequeue();
        printf("%d",curr->data);

        if(curr->left!=NULL){
            enqu(curr->left->data);

        }else if(curr->right!=NULL){
            enqu(curr->right->data);
        }
    }
    
}


int main(){
    struct Node* root = createnode(1);
    root->left = createnode(2);
    root->right = createnode(3);
    root->left->left = createnode(4);
    root->left->right = createnode(5);
    root->right->left = createnode(6);
    root->right->right = createnode(7);

    printf("Level Order Traversal: ");
    levelOrder(root);

    return 0;
}