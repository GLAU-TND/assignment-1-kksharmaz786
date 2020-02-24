package Definition;

import Helper_Methods.Node;

public class MyLinkedList<T> {
    private Node<T> head;           //It is the beginning of linked list
    private Node<T> iter;           //It is used to iterate the list

    public Node<T> getHead() {
        return head;
    }        //getter for head
}
