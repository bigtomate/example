package de.xing.tut.interview;

public class Node {
    private int value;
    private Node next;

    private Node tail;
    private Node head;

    private static Node nodeList(int [] numbers) {
        Node node = new Node();
        Node currentNode = null;
        for (int i = 0; i < numbers.length; i++) {
            if (i == 0) {
                node.value = numbers[i];
                node.next = null;
                currentNode = node;
            } else {
                insertAfter (currentNode, numbers[i]);
                currentNode = currentNode.next;
            }
        }
        return node;
    }

    private static Node nodePointer(Node nodelist, int backwardNth) {
        Node pointer = new Node();
        pointer.head = nodelist;
        pointer.tail = nodelist;
        Node currentNode = nodelist;
        for (int i = 0; i <= backwardNth; i++) {
            pointer.tail = currentNode;
            currentNode = currentNode.next;
        }
        return pointer;
    }

    public static Node retrieveBackWard(Node pointer) {
        Node currentNode = pointer.tail;
        Node targetNode = pointer.head;
        while(currentNode != null) {
            if (currentNode == null) {
                return targetNode;
            }
            currentNode = currentNode.next;
            targetNode = targetNode.next;
        }
        return targetNode;
    }

    private static void insertAfter(Node pre, int value) {
        Node node = new Node();
        node.value = value;
        pre.next = node;
    }

    public static void main(String [] args) {
        int nth = 3;
        int[] ary = new int[] {6,4,2,7,1,3,5,9,8};
        Node nodelist = nodeList(ary);
        Node pointer = nodePointer(nodelist, nth);
        Node backwardsNth = retrieveBackWard(pointer);
        System.out.println(String.format("backwards %s th is %s", nth,  backwardsNth.value));
    }
}
