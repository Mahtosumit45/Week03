package DoublyLinkedList.FunctionalityforTextEditor;

class Node {
    String text;
    Node prev, next;

    public Node(String text) {
        this.text = text;
        this.prev = this.next = null;
    }
}

