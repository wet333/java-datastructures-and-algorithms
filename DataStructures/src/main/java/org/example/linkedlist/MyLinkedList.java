package org.example.linkedlist;

public class MyLinkedList {

    private Node head;
    private Node tail;
    private int length;

    public MyLinkedList() {
    }

    public String get(int index) {
        if (index < 0 || index >= this.length) {
            return null;
        }

        Node current = this.head;
        int currentIndex = 0;
        while (currentIndex != index) {
            current = current.next();
            currentIndex++;
        }
        return current.value();
    }

    public boolean set(int index, String value) {
        if (index < 0 || index >= this.length) {
            return false;
        }

        Node current = this.head;
        int currentIndex = 0;
        while (currentIndex != index) {
            current = current.next();
            currentIndex++;
        }
        current.setValue(value);

        return true;
    }

    public void prepend(String value) {
        Node newNode = new Node(value);

        if (length == 0) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            newNode.setNext(this.head);
            this.head = newNode;
        }
        this.length++;
    }

    public void append(String value) {
        Node newNode = new Node(value);

        if (length == 0) {
            this.head = newNode;
        } else {
            this.tail.setNext(newNode);
        }
        this.tail = newNode;
        this.length++;
    }

    public String removeLast() {
        String returnValue = null;

        if (this.length == 0) {
            return null;
        }

        if (this.length == 1) {
            returnValue = this.tail.value();
            this.head = null;
            this.tail = null;
            this.length--;
            return returnValue;
        }

        Node aux = this.head;
        while (true) {
            if(aux.next() == this.tail) {
                returnValue = this.tail.value();
                aux.setNext(null);
                this.tail = aux;
                break;
            }
            aux = aux.next();
        }
        this.length--;
        return returnValue;
    }

    public String removeFirst() {
        String returnValue = null;

        if (this.length == 0) {
            return null;
        }

        if (this.length == 1) {
            returnValue = this.head.value();
            this.head = null;
            this.tail = null;
            this.length--;
            return returnValue;
        }

        Node newHead = this.head.next();
        returnValue = this.head.value();
        this.head.setNext(null);
        this.head = newHead;
        this.length--;
        return returnValue;
    }

    // TODO: Falta implementar insert y remove de nodos.

    public void printList() {

        if (this.length == 0) {
            System.out.println("Empty list");
            return;
        }

        Node aux = this.head;
        while (aux != null) {
            System.out.println(aux.value());
            aux = aux.next();
        }
    }

}
