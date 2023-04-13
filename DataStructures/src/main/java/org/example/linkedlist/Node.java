package org.example.linkedlist;

public class Node {

    private String value;
    private Node next;

    public Node() {
    }
    public Node(String value) {
        this.value = value;
    }
    public Node(String value, Node next) {
        this.value = value;
        this.next = next;
    }

    public String value() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Node next() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
