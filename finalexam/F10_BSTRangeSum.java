import java.util.*;

public class F10_BSTRangeSum {
    static class Node {
        int val;
        Node left, right;
        Node(int v) { val = v; }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 讀輸入 BST 節點 (層序 -1代表null)
        List<Integer> vals = new ArrayList<>();
        while (sc.hasNextInt()) {
            vals.add(sc.nextInt());
        }
        // 假設最後兩個是 L 和 R
        int n = vals.size();
        int R = vals.remove(n - 1);
        int L = vals.remove(n - 2);

        Node root = buildTree(vals);
        int sum = rangeSum(root, L, R);
        System.out.println(sum);
    }

    private static Node buildTree(List<Integer> vals) {
        if (vals.isEmpty() || vals.get(0) == -1) return null;
        Node root = new Node(vals.get(0));
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        int i = 1;
        while (i < vals.size()) {
            Node cur = q.poll();
            if (i < vals.size() && vals.get(i) != -1) {
                cur.left = new Node(vals.get(i));
                q.offer(cur.left);
            }
            i++;
            if (i < vals.size() && vals.get(i) != -1) {
                cur.right = new Node(vals.get(i));
                q.offer(cur.right);
            }
            i++;
        }
        return root;
    }

    private static int rangeSum(Node root, int L, int R) {
        if (root == null) return 0;
        if (root.val < L) return rangeSum(root.right, L, R);
        if (root.val > R) return rangeSum(root.left, L, R);
        return root.val + rangeSum(root.left, L, R) + rangeSum(root.right, L, R);
    }
}
