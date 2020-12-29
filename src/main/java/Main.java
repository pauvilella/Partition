public class Main {
    static class ListParts {
        MySinglyLinkedList<Integer> lower = new MySinglyLinkedList<Integer>();
        MySinglyLinkedList<Integer> higher = new MySinglyLinkedList<Integer>();
    }
    static ListParts partition1(MySinglyLinkedList<Integer> list, int x) {
        ListParts result = new ListParts();
        MySinglyLinkedListNode<Integer> n = list.head;
        n = n.next;
        while (n != null) {
            if (n.data < x) {
                result.lower.addEnd(n.data);
            } else {
                result.higher.addEnd(n.data);
            }
            n = n.next;
        }
        return result;
    }

    static MySinglyLinkedList<Integer> partition2(MySinglyLinkedList<Integer> list, int x) {
        MySinglyLinkedList<Integer> lower = new MySinglyLinkedList<Integer>();
        MySinglyLinkedListNode<Integer> n = list.head;
        while (n.next != null) {
            if (n.next.data < x) {
                lower.addEnd(n.next.data);
                if (n.next.next != null) {
                    n.next = n.next.next;
                } else {
                    n.next = null;
                }
            } else {
                n = n.next;
            }
        }
        return lower;
    }

    public static void main(String[] args) {
        MySinglyLinkedList<Integer> list = new MySinglyLinkedList<Integer>();
        list.addEnd(3);
        list.addEnd(5);
        list.addEnd(8);
        list.addEnd(5);
        list.addEnd(10);
        list.addEnd(2);
        list.addEnd(1);
        list.printMe();
        ListParts result = partition1(list, 5);
        result.lower.printMe();
        result.higher.printMe();
        MySinglyLinkedList<Integer> lower = partition2(list, 5);
        lower.printMe();
        list.printMe();
    }
}
