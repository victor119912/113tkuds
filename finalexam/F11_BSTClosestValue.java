import java.util.*;

public class F11_BSTClosestValue {
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
        // 最後一個是目標 T
        int T = vals.remove(vals.size() - 1);

        Node root = buildTree(vals);
        int closest = findClosest(root, T);
        System.out.println(closest);
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

    private static int findClosest(Node root, int T) {
        int closest = root.val;
        Node current = root;
        while (current != null) {
            int diffCurrent = Math.abs(current.val - T);
            int diffClosest = Math.abs(closest - T);
            if (diffCurrent < diffClosest || (diffCurrent == diffClosest && current.val < closest)) {
                closest = current.val;
            }
            if (T < current.val) {
                current = current.left;
            } else if (T > current.val) {
                current = current.right;
            } else {
                break; // exact match
            }
        }
        return closest;
    }
}
