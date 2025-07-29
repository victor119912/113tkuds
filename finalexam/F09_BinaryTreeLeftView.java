import java.util.*;

public class F09_BinaryTreeLeftView {
    static class Node {
        int val;
        Node left, right;
        Node(int v) { val = v; }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> vals = new ArrayList<>();
        while (sc.hasNextInt()) {
            vals.add(sc.nextInt());
        }

        Node root = buildTree(vals);
        List<Integer> leftView = getLeftView(root);

        System.out.print("LeftView:");
        for (int v : leftView) {
            System.out.print(" " + v);
        }
        System.out.println();
    }

    private static Node buildTree(List<Integer> vals) {
        if (vals.isEmpty() || vals.get(0) == -1) return null;

        Node root = new Node(vals.get(0));
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        int i = 1;

        while (i < vals.size()) {
            Node current = q.poll();

            if (i < vals.size() && vals.get(i) != -1) {
                current.left = new Node(vals.get(i));
                q.offer(current.left);
            }
            i++;

            if (i < vals.size() && vals.get(i) != -1) {
                current.right = new Node(vals.get(i));
                q.offer(current.right);
            }
            i++;
        }
        return root;
    }

    private static List<Integer> getLeftView(Node root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;

        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Node curr = q.poll();
                if (i == 0) {
                    res.add(curr.val);
                }
                if (curr.left != null) q.offer(curr.left);
                if (curr.right != null) q.offer(curr.right);
            }
        }
        return res;
    }
}
