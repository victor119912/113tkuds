import java.util.*;

public class F12_TreeDiameter {
    static class Node {
        int val;
        Node left, right;
        Node(int v) { val = v; }
    }

    static int diameter = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> vals = new ArrayList<>();
        while (sc.hasNextInt()) {
            vals.add(sc.nextInt());
        }

        Node root = buildTree(vals);
        diameter = 0;
        height(root);
        System.out.println(diameter);
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

    private static int height(Node node) {
        if (node == null) return 0;
        int leftH = height(node.left);
        int rightH = height(node.right);

        // 更新直徑: 左右子樹高度和 - 1 邊數(因為邊數 = 節點數 - 1)
        diameter = Math.max(diameter, leftH + rightH);

        return Math.max(leftH, rightH) + 1;
    }
}
