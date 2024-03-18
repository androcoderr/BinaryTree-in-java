import java.util.Stack;

public class BTree {
    Node root;

    public Node insert(Node root,int data){
        Node newNode=new Node(data);
        if (root==null){
           root=newNode;
           // System.out.println("insert root"+root.data);
        }else{
            if (data>root.data){
                root.right=insert(root.right,data);
            }else{
                root.left=insert(root.left,data);
            }
        }
        return root;
    }
    public Node delete(Node root , int x){
        Node temp1;
        Node temp2;
        if (root==null){
            return null;
        }
        if (root.data==x){
            if (root.right==root.left){
                root=null;
                return root;
            } else if (root.right==null) {
                temp1=root.left ;
                return temp1;
            } else if (root.left==null) {
                temp1=root.right;
                return temp1;
            }else {
                temp1=temp2=root.right;
                while (temp1.left!=null){
                    temp1=temp1.left;
                }
                temp1.left=root.left;
                return temp2;
            }
        }else {
            if (x< root.data){
                root.left=delete(root.left,x);
            }else{
                root.right=delete(root.right,x);
            }
        }
        return root;
    }
    void preOrder(Node root){
        if (root!=null){
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    void inOrder(Node root){
        if (root!=null){
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }
    void postOrder(Node root){
        if (root!=null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");

        }
    }

    int size(Node root){
        if (root==null) return 0;
        else{
            return size(root.right)+1+ size(root.left);
        }
    }

    int sizeWithoutRecursion(Node root){
        int count=0;
        Stack<Node> stack = new Stack<>();
        if (root==null)return 0;
        else{
            Node temp=root;
            while (temp!=null||!stack.isEmpty()){
                while (temp!=null){
                    stack.push(temp);
                    temp=temp.left;
                }
                temp=  stack.pop();
                count++;
                temp=temp.right;
            }
        }
        return count;
    }

  int height(Node root){
        if (root==null){
            return -1;
        }
        else{
            int left=0;int right=0;
            left=height(root.left);
            right=height(root.right);
            if (left>right){
                return left+1;
            }else{
                return right+1;
            }
        }
  }
}
