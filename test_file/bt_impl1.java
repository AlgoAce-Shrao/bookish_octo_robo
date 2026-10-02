
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;



class node {
    int val;
    node left;
    node right;
    node(int val){
        this.val=val;
        this.left=null;
        this.right=null;
    }

}

class traversal{
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

    public  void  preorder(node root){
        if(root==null)  return;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public void postorder(node root){
        if(root==null) return;
         postorder(root.left);
         postorder(root.right);
         System.out.print(root.val+" ");
    }

    public void inorder(node root){
        if(root==null) return;
         inorder(root.left);
         System.out.print(root.val+" ");
         inorder(root.right);
    }


    public List<List<Integer>>  levelorder(node root){
        Queue<node>  q=new LinkedList<node>();
        List<List<Integer>> answer=new LinkedList<List<Integer>>();
        if(root==null) return answer;
        q.offer(root);  //else q will be empty from before
        while(!q.isEmpty()){
            int noOfElementsInQ=q.size();
             List<Integer> sublist=new ArrayList<Integer>();
            for(int i=0;i<noOfElementsInQ;i++){
                if(q.peek().left!=null) q.add(q.peek().left);
                if(q.peek().right!=null) q.add(q.peek().right);
                sublist.add(q.poll().val);
            }
            answer.add(sublist);
        }

        return answer;
    }

    public List<Integer> iterative_inorder(node root){
        Stack<node> st=new  Stack<>();
        List<Integer> ans=new ArrayList<>();
        while(true){
            if(root!=null){
                st.push(root);
                root=root.left;
            }else{
                if(st.isEmpty()) break;

                root=st.pop();
                ans.add(root.val);
                root=root.right;
            }
        }
        return ans;
    }

    public List<Integer> iterative_preorder(node root){
        Stack<node> st=new  Stack<>();
        List<Integer> ans=new ArrayList<>();
        node node =root;
        // st.push(node);
        while(true){
            if(node!=null){
                st.push(node);
                ans.add(node.val);
                node=node.left;
            }else{
                if(st.isEmpty()) break;

                node =st.pop();
                node=node.right;
            }
        }

        return ans;
    }

    public List<Integer> iterative_postorder(node root){
        Stack<node> st1=new Stack<>();
        Stack<node> st2=new Stack<>();
        List<Integer> ans=new ArrayList<>();
        st1.push(root);
        while(!st1.isEmpty()){
            node curr=st1.pop();
            st2.push(curr);
            if(curr.left!=null) st1.push(curr.left);
            if(curr.right!=null) st1.push(curr.right);
        }
        while(!st2.isEmpty()){
            ans.add(st2.pop().val);
        }
    
    return ans;
    }

}


public class bt_impl1 {
    public static void main(String args[]){
        traversal t=new traversal();
        node root=t.createBinaryTree();
        // t.preorder(root);
        // t.postorder(root);
        // t.inorder(root);
        // List<List<Integer>> l=t.levelorder(root);
        // System.out.println(l);
        // System.out.println(t.iterative_inorder(root));
        // System.out.println(t.iterative_preorder(root));
        // System.out.println(t.iterative_postorder(root));
        

    }
}
