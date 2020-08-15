package potapov.sergey.part5.HW32;

public class BinaryTree {

    public static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }

    public static TreeNode createBinaryTree() {

        TreeNode rootNode = new TreeNode(22);
        TreeNode node12 = new TreeNode(12);
        TreeNode node14 = new TreeNode(14);
        TreeNode node30 = new TreeNode(30);
        TreeNode node55 = new TreeNode(55);
        TreeNode node50 = new TreeNode(50);
        TreeNode node70 = new TreeNode(70);

        rootNode.left = node30;
        rootNode.right = node55;

        node30.left = node12;
        node30.right = node14;

        node55.left = node50;
        node55.right = node70;

        return rootNode;
    }

    public static int getLeafCountOfBinaryTree(TreeNode node) {
        if (node == null)
            return 0;
        if (node.left == null && node.right == null)
            return 1;
        else
            return getLeafCountOfBinaryTree(node.left) + getLeafCountOfBinaryTree(node.right);
    }
}
