// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BTree tree=new BTree();
        tree.root=tree.insert(tree.root,10);
        tree.root=tree.insert(tree.root,15);
        tree.root=tree.insert(tree.root,8);
        tree.root=tree.insert(tree.root,20);
        tree.root=tree.insert(tree.root,4);
        tree.root=tree.insert(tree.root,12);

       // tree.inOrder(tree.root);
      //  tree.delete(tree.root,10);
      //  System.out.println();
      //  System.out.println("size : " +tree.size(tree.root));
      //  System.out.println("size : " +tree.sizeWithoutRecursion(tree.root));
        BTree tree2=new BTree();
        tree2.root=tree.insert(tree2.root,10);
        tree2.root=tree.insert(tree2.root,8);
        tree2.root=tree.insert(tree2.root,15);
        tree2.root=tree.insert(tree2.root,4);
        tree2.root=tree.insert(tree2.root,9);
        tree2.root=tree.insert(tree2.root,12);
        tree2.root=tree.insert(tree2.root,20);
        tree2.root=tree.insert(tree2.root,1);
        tree2.root=tree.insert(tree2.root,5);
        tree2.root=tree.insert(tree2.root,11);
        tree2.root=tree.insert(tree2.root,14);
        tree2.root=tree.insert(tree2.root,19);
        tree2.root=tree.insert(tree2.root,25);
        tree2.root = tree2.delete(tree2.root, 5);
       // System.out.println("root sag* sag: "+ tree2.root.right.left.left.data);

      tree2.preOrder(tree2.root);
      System.out.println( );
      tree2.inOrder(tree2.root);
      System.out.println();
      tree2.postOrder(tree2.root);





       /* tree2.inOrder(tree2.root);
        tree2.root= tree2.delete(tree2.root,71);
        System.out.println();
        tree2.inOrder(tree2.root);*/
       /*   System.out.println("preOrder: ");
        tree2.preOrder(tree2.root);
        System.out.println("\npostOrder: ");
        tree2.postOrder(tree2.root);*/

    }
}