
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

// import javax.swing.tree.TreeNode;


class node{
    int val;
    node left;
    node right;

    node(int val){
        this.val=val;
        this.left=null;
        this.right=null;
    }
}

class Pair {
    node root;
    int num;

    Pair(node root, int num){
        this.root = root;
        this.num = num;
    }
}

// //DS for iterative traversal
// class TreeNode{

//     int val;
//     TreeNode left, right;

//     public TreeNode() {}

//     public TreeNode(int val){
//        this.val=val; 
//     }

//     public TreeNode(int val,TreeNode left,TreeNode right){
//         this.val=val;
//         this.left=left;
//         this.right=right;
//     }
// }

class solution{
    public node createBinaryTree(){
        node root=new node(1);
        root.left=new node(2);
        root.right=new node(3);
        root.left.left=new node(4);
        root.left.right=new  node(5);

        root.right.left=new node(6);
        root.right.right=new node(7);
        return root;
    }
}



class traversal{
    public void  preorder(node root){
        if(root==null) return;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);

    }

    public void postorder(node root){    // ryt left root
        if(root==null) {
            return;
        }
        postorder(root.right);
        postorder(root.left);
        System.out.print(root.val+" ");

    }

    public void  inorder(node root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);

    }

    public List<List<Integer>> levelOrder(node root){   // T.C.:O[n] SC:O[n]
        Queue<node> q=new LinkedList<node>();
        List<List<Integer>> wrapList=new LinkedList<List<Integer>>();
        if(root==null) return wrapList;
        q.offer(root);
        while(!q.isEmpty()){
            int noOfElementsinLevel=q.size();
            List<Integer> sublist=new LinkedList<Integer>();
            for(int i=0;i<noOfElementsinLevel;i++){
                if(q.peek().left!=null) q.add(q.peek().left);
                if(q.peek().right!=null) q.add(q.peek().right);
                sublist.add(q.poll().val);
            }
            wrapList.add(sublist);
            
        }

        return wrapList;


    }

    public List<Integer> iterative_inorder(node root){
        ArrayList<Integer> inorder=new ArrayList<>();
        Stack<node> st=new Stack<node>();

        node node=root;

        while(true){
            if(node!=null){
                st.push(node);
                node=node.left;
            }
            else{
                if(st.isEmpty()) break;

                node=st.pop();
                inorder.add(node.val);
                node=node.right;
            }
        }
        return inorder;

    }

    public List<Integer> iterative_preorder(node root){
        Stack<node> st=new Stack<>();
        ArrayList<Integer> ans=new ArrayList<>();
        st.push(root);
        while(!st.isEmpty()){
            node rt=st.pop();
            ans.add(rt.val);
            if(rt.right!=null){
                st.push(rt.right);
            }
            if(rt.left!=null){
                st.push(rt.left);
            }
        }
        return ans;
    }

     public List<Integer> iterative_postorder_using_2Stacks(node root){
        Stack<node> st1=new Stack<node>();
        Stack<node> st2=new Stack<node>();
        ArrayList<Integer> ans=new ArrayList<>();
        if(root==null) return ans;
        st1.push(root);
        while(!st1.isEmpty()){
            node node=st1.pop();
            st2.push(node);
            if(node.left!=null) st1.push(node.left);
            if(node.right!=null) st1.push(node.right);
        }

        while(!st2.isEmpty()){
            ans.add(st2.pop().val);
        }
        return ans;
    }


    public List<Integer> iterative_postorder_using_1Stack(node root){
        Stack<node> st1=new Stack<node>();
        ArrayList<Integer> ans=new ArrayList<>();
        if(root==null) return ans;
        st1.push(root);
        while(!st1.isEmpty()){
            node node=st1.peek();
            if(node.left!=null || node.right!=null){
                if(node.right!=null) st1.push(node.right);
                if(node.left!=null) st1.push(node.left);
            }else{
                ans.add(st1.pop().val);
            }
        }

        
        return ans;
    }

    public static  void pre_in_post(node root){
        List<Integer> pre=new ArrayList<>();
        List<Integer> in=new ArrayList<>();
        List<Integer> post=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        Stack<Pair> st=new Stack<Pair>();
        st.push(new Pair(root,1));
        if(root==null) return;
        while(!st.isEmpty()){
            Pair pr=st.pop();

            if(pr.num==1){    //preorder list
                pre.add(pr.root.val);
                pr.num++;
                st.push(pr);
                if(pr.root.left!=null){
                    st.push(new Pair(pr.root.left, 1));
                }
            }else if(pr.num==2){  //inorder list
                in.add(pr.root.val);
                pr.num++;
                st.push(pr);
                if(pr.root.right!=null){
                    st.push(new Pair(pr.root.right,1));
                }
            }else{   //postorder list
                post.add(pr.root.val);

            }
        }

        ans.add(pre);
        ans.add(in);
        ans.add(post);
        System.out.println(ans);
         
    }


    
}

public class bt_impl {
    public static void main(String [] args){
        solution s=new solution();
        node root=s.createBinaryTree();
        // System.out.println("Root value: "+root.val);
        // System.out.println("Left child of root: "+root.left.val);
        // System.out.println("Right child of root: "+root.right.val);
        // System.out.println("Left child of left child of root: "+root.left.left.val);
        // System.out.println("Right child of left child of root: "+root.left.right.val);
        // System.out.println("Left child of right child of root: "+root.right.left.val);
        // System.out.println("Right child of left child of right child of root: "+root.right.left.right.val);

        //preorder traversal
        traversal t=new traversal();
        // t.preorder(root);
        // t.postorder(root);  // wrong hai bc
        // t.inorder(root);
        // System.out.println(t.levelOrder(root));
        // System.out.println(t.iterative_preorder(root));
        // System.out.println(t.iterative_postorder_using_2Stacks(root));
        // System.out.println(t.iterative_postorder_using_1Stack(root));
        // System.out.println(t.pre_in_post(root));
        // t.pre_in_post(root);
        traversal.pre_in_post(root);
        
    }
    
}
