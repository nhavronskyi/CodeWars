package codewars.six;

public class NodeMania {
    public static Integer searchKFromEnd(Node linkedList, int k) {
        if (linkedList == null) {
            return null;
        }

        int size = getNodeSize(linkedList);

        if (k > size) {
            return null;
        }

        for (int i = k; i < size; i++) {
            linkedList = linkedList.next;
        }
        return linkedList.data;
    }

    private static int getNodeSize(Node nodes) {
        int size = 0;
        while (nodes != null) {
            nodes = nodes.next;
            size++;
        }
        return size;
    }

    public static class Node {
        public final int data;
        public Node next;

        public Node(int data) {
            this.data = data;
        }


        public static Node build(int... ints) {
            Node first = new Node(ints[0]);
            Node current = first;
            for (int i = 1; i < ints.length; i++) {
                current.next = new Node(ints[i]);
                current = current.next;
            }
            return first;
        }
    }
}
