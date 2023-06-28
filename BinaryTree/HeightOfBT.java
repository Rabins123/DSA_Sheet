package BinaryTree;
//height of binary tree


public class HeightOfBT{
     Node root;

   public int getHeight(Node root){
    
    if(root==null){
        return 0;
    }

    int lh=getHeight(root.left);
    int rh=getHeight(root.left);
     return 1+Math.max(lh, rh);
   }
}

class  Main{
    public static void main(String[] args) {
        
        // Create the nodes of the binary tree
        Node root = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        // Create a binary tree
        HeightOfBT tree = new HeightOfBT();
        // Set the root and child nodes
        tree.root = root;
        root.left = node2;
        root.right = node3;
        node2.left = node4;
        node2.right = node5;

         // Get the height of the binary tree
        int height = tree.getHeight(root);
        
        // Print the height
        System.out.println("Height of the binary tree: " + height);
    }


    
}