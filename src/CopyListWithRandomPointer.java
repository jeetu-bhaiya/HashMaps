public class CopyListWithRandomPointer {
    public Node copyRandomList(Node head) {
        HashMap<Node, Node> map = new HashMap<Node, Node>();
        Node p = head;
        while(p != null){
            map.put(p, new Node(p.val));
            p = p.next;
        }

        Node q = head;
        while(q != null){
            map.get(q).next = map.get(q.next);
            map.get(q).random = map.get(q.random);
            q = q.next;
        }
        return map.get(head);
    }
}
