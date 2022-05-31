import java.util.Iterator;

public class MyIterator implements Iterator<Node> {
        Node node = new Node();
    @Override
    public boolean hasNext() {

        return node.next==null;
    }

    @Override
    public Node next() {
        while (hasNext()) node= node.next;
        return node;
    }
}
