package com.haiph;

public class LinkedList {
    private Integer size;
    private Node head;
    private Node tail;

    public LinkedList() {
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    public void insertAt(Node node, Integer position) {
        if (position < 1 || this.size == 0) {
            node.next = this.head;
            this.head = node;

            if (this.tail == null) {
                this.tail = node;
            }

            this.size++;
            return;
        }
        if (position >= this.size) {
            if (this.tail != null) {
                this.tail.next = node;
            }
            this.tail = node;

            if (this.head == null) {
                this.head = node;
            }

            this.size++;
            return;
        }
        Node preNode = null;
        Node currentNode = this.head;
        int counter = 0;
        while (counter < position) {
            counter++;
            preNode = currentNode;
            currentNode = currentNode.next;
        }
        node.next = currentNode;
        preNode.next = node;
        this.size++;
    }

    private Node getNodeAt(Integer position) {
        Node currentNode = head;
        for (int i = 0; i < position; i++) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }

    public void removeElement(int position) {
        if (position < 0 || position >= size) {
            System.out.println("Position Invalid");
            return;
        }

        if (position == 0) {
            head = head.next;
            size--;
            if (size == 0) {
                tail = null;
            }
            return;
        }

        Node previousNode = getNodeAt(position - 1);
        Node currentNode = previousNode.next;
        previousNode.next = currentNode.next;
        size--;

        if (position == size) {
            tail = previousNode;
        }
    }

    public LinkedList mergeList(LinkedList list1, LinkedList list2) {
        LinkedList mergedList = new LinkedList();
        Node current1 = list1.head;
        Node current2 = list2.head;
        while (current1 != null && current2 != null) {
            if (current1.getData() < current2.getData()) {
                Node newNode = new Node(current1.getData());
                mergedList.insertAt(newNode,mergedList.size);
                current1 = current1.next;
            }else {
                Node newNode = new Node(current2.getData());
                mergedList.insertAt(newNode, mergedList.size);
                current2 = current2.next;
            }
        }
        while (current1 != null) {
            Node newNode = new Node(current1.getData());
            mergedList.insertAt(newNode,mergedList.size);
            current1 = current1.next;
        }
        while (current2 != null) {
            Node newNode = new Node(current2.getData());
            mergedList.insertAt(newNode,mergedList.size);
            current2 = current2.next;
        }
        return mergedList;
    }

    public LinkedList mergeAllLists(LinkedList[] lists) {
        int n = lists.length;
        if (n == 0) {
            return null;
        }
        while (n > 1) {
            for (int i = 0; i < n-1; i++) {
                for (int j = i+1; j <n ; j++) {
                    lists[i] = mergeList(lists[i], lists[j]);
                }
            }
            n = (n + 1) / 2;
        }
        return lists[0];
    }

    public void printData() {
        System.out.println("Print-Data");
        Node currentNode = this.head;
        while (currentNode != null) {
            currentNode.print();
            currentNode = currentNode.next;
        }
    }
}
