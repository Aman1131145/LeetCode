import java.util.Scanner;

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
public class RootEqualsSumOfChildren {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeNode root = new TreeNode();
        root.val = sc.nextInt();
        root.left.val = sc.nextInt();
        root.right.val = sc.nextInt();
        System.out.println(checkTree(root));
        sc.close();
    }

    private static boolean checkTree(TreeNode root) {
        if(root.left.val + root.right.val == root.val){
            return true;
        }else{
            return false;
        }
    }
        
}
