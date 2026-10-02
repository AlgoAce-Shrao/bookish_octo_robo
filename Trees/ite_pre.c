#include <stdio.h>
#include <stdlib.h>

// Structure for a tree node
struct TreeNode {
    int val;
    struct TreeNode* left;
    struct TreeNode* right;
};

// Function to create a new tree node
struct TreeNode* createNode(int x) {
    struct TreeNode* newNode = (struct TreeNode*)malloc(sizeof(struct TreeNode));
    newNode->val = x;
    newNode->left = NULL;
    newNode->right = NULL;
    return newNode;
}

// Stack structure for TreeNode pointers
struct Stack {
    int top;
    int capacity;
    struct TreeNode** array;
};

// Function to create a stack
struct Stack* createStack(int capacity) {
    struct Stack* stack = (struct Stack*)malloc(sizeof(struct Stack));
    stack->top = -1;
    stack->capacity = capacity;
    stack->array = (struct TreeNode**)malloc(capacity * sizeof(struct TreeNode*));
    return stack;
}

// Function to check if the stack is empty
int isEmpty(struct Stack* stack) {
    return stack->top == -1;
}

// Function to push a node onto the stack
void push(struct Stack* stack, struct TreeNode* node) {
    stack->array[++stack->top] = node;
}

// Function to pop a node from the stack
struct TreeNode* pop(struct Stack* stack) {
    return stack->array[stack->top--];
}

// Function to perform iterative preorder traversal
void preorderTraversal(struct TreeNode* root) {
    if (root == NULL)
        return;

    // Create a stack
    struct Stack* stack = createStack(100); // assuming max 100 nodes
    push(stack, root);

    while (!isEmpty(stack)) {
        // Pop the top node
        struct TreeNode* node = pop(stack);

        // Print the node's value
        printf("%d ", node->val);

        // Push right child first so that left is processed first
        if (node->right)
            push(stack, node->right);
        if (node->left)
            push(stack, node->left);
    }

    // Free memory
    free(stack->array);
    free(stack);
}

// Driver code
int main() {
    // Creating the binary tree
    struct TreeNode* root = createNode(1);
    root->left = createNode(2);
    root->right = createNode(3);
    root->left->left = createNode(4);
    root->left->right = createNode(5);

    // Displaying the preorder traversal
    printf("Preorder Traversal: ");
    preorderTraversal(root);
    printf("\n");

    return 0;
}
