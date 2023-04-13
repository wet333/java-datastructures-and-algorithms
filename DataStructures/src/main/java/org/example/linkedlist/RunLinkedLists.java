package org.example.linkedlist;

public class RunLinkedLists {
    public static void main(String[] args) {

        // create an empty list
        MyLinkedList list = new MyLinkedList();
        list.printList();

        // Testing adding and removing ---------------------------------------------------------------------------------

        // add one element to the list
        list.append("apple");
        list.printList();

        // remove first in one element list
        String removed = list.removeFirst();
        System.out.println("Removed element: " + removed);
        list.printList();

        // add one element to the list
        list.append("orange");
        list.printList();

        // remove last in one element list
        String removed2 = list.removeLast();
        System.out.println("Removed element: " + removed2);
        list.printList();

        // add some more elements to the list
        list.append("banana");
        list.prepend("cherry");
        list.append("dragonfruit");
        list.prepend("pear");
        list.printList();

        // remove the first and last elements
        String first = list.removeFirst();
        String last = list.removeLast();
        System.out.println("Removed first: " + first);
        System.out.println("Removed last: " + last);
        list.printList();

        // remove all remaining elements
        while (list.removeFirst() != null) {
            // do nothing
        }
        list.printList();

        // Testing retrieving and setting ------------------------------------------------------------------------------
        list.append("23");
        list.append("35");
        list.append("58");
        list.append("98");
        list.append("00");

        System.out.println(list.get(2));
        System.out.println(list.get(-5));
        System.out.println(list.get(0));
        System.out.println(list.get(754));

        System.out.println(list.set(2, "1024"));
        System.out.println(list.set(84, "1024"));
        System.out.println(list.set(-15, "1024"));

        list.printList();
    }
}
