// Height of a Binary Tree
// Time Complexity: O(n), Space Complexity: O(h), where h is the height of the tree

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Question147 {

    public static int maxDepth(TreeNode root) {
        // Base Condition
        if(root == null){
            return 0;
        }
        // Smaller Input
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        // Induction
        return 1 + Math.max(left, right);
    }
    public static void main(String[] args) {
        // Creating Binary Tree
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.right = new TreeNode(6);

        // Calculate Height
        int height = maxDepth(root);
        System.out.println(height);
    }
}
