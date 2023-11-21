package Data_Structures;

public class BinarySearchTree {
    class Node {
		int key;
		Node left, right;

		public Node(int item)
		{
			key = item;
			left = right = null;
		}
	}
	Node root;
	BinarySearchTree() { root = null; }
    BinarySearchTree(int value) { root = new Node(value); }
	void insert(int key) { root = insertRec(root, key); }
	Node insertRec(Node root, int key)
	{
		if (root == null) {
			root = new Node(key);
			return root;
		}
		else if (key < root.key)
			root.left = insertRec(root.left, key);
		else if (key > root.key)
			root.right = insertRec(root.right, key);
		return root;
	}
	void inorder() { inorderRec(root); }
	void inorderRec(Node root)
	{
		if (root != null) {
			inorderRec(root.left);
			System.out.print(root.key + " ");
			inorderRec(root.right);
		}
	}
    static Node search(Node root, int key) {
        if (root == null || root.key == key)
            return root;
        if (root.key < key)
            return search(root.right, key);
        return search(root.left, key);
    }
    void delete(Node root,int value){
        Node deleteNode=search(root, value);
        if(deleteNode.left==null && deleteNode.right==null){
            deleteLeafNode(root, value);
        }
        else{
            Node left=leftMax(deleteNode.left);
            deleteNode.key=left.key;
            deleteLeafNode(deleteNode,left.key);
        }
    }
    static Node deleteLeafNode(Node root,int value){
        if(root==null || (root.key==value && root.left==null && root.right==null)){
            return null;
        }
        else if (value < root.key)
			root.left = deleteLeafNode(root.left, value);
		else
			root.right = deleteLeafNode(root.right,value);
        return root;
    }
    Node leftMax(Node root){
        if (root == null || root.right == null)
            return root;
        return leftMax(root.right);
    }
}
