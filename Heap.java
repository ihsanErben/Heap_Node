
public class Heap {

    Node first;
    Node last;

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (first == null) {
            addFirst(data);
        } else {
            Node tmp = first;
            if (data > first.data) {
                addFirst(data);
                return;
            }
            while (tmp.next != null) {
                if (tmp.next.data < data) {
                    addAfter(data, tmp);
                    return;
                }
                tmp = tmp.next;
            }
            last.next = newNode;
            last = newNode;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            newNode.next = first;
            first = newNode;
        }
    }

    public void addAfter(int data, Node prev) {
        Node newNode = new Node(data);
        Node back = prev;
        Node front = prev.next;
        back.next = newNode;
        newNode.next = front;
    }

    public void print() {
        Node tmp = first;
        while (tmp != null) {
            System.out.print(tmp.data + ",");
            tmp = tmp.next;
        }
        System.out.println("");
    }
}
