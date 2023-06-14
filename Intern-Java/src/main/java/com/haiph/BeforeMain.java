package com.haiph;

public class BeforeMain {
    public void addDataAndRemoveWithPosition() {
        LinkedList linkedList = new LinkedList();
        System.out.println("Create Data");
        linkedList.insertAt(new Node(1), 1);

        Node node = new Node(100);
        Node node1 = new Node(200);
        Node node2 = new Node(300);
        Node node3 = new Node(400);
        Node node4 = new Node(500);

        linkedList.insertAt(node, 2);
        linkedList.insertAt(node1, 3);
        linkedList.insertAt(node2, 4);
        linkedList.insertAt(node3, 5);
        linkedList.insertAt(node4, 6);
        linkedList.printData();

        linkedList.removeElement(4);
        linkedList.removeElement(2);
        linkedList.removeElement(0);
        System.out.println("After Delete");
        linkedList.printData();
    }

    public void createTwoLinkedListAndMerge() {
        LinkedList list1 = new LinkedList();
        list1.insertAt(new Node(1), 1);
        list1.insertAt(new Node(3), 2);
        list1.insertAt(new Node(5), 3);
        System.out.println("Data LinkedList One");
        list1.printData();

        LinkedList list2 = new LinkedList();
        list2.insertAt(new Node(2), 4);
        list2.insertAt(new Node(4), 5);
        list2.insertAt(new Node(6), 6);
        System.out.println("Data LinkedList Two");
        list2.printData();

        LinkedList mergedList = new LinkedList();
        mergedList = mergedList.mergeList(list1, list2);
        System.out.println("Affter MergeList");
        mergedList.printData();
    }

    public void createThirtyTwoLinkedListAndMerge() {
        LinkedList list1 = new LinkedList();
        list1.insertAt(new Node(1), 1);
        list1.insertAt(new Node(3), 2);
        list1.insertAt(new Node(5), 3);
        System.out.println("Data LinkedList One");
        list1.printData();

        LinkedList list2 = new LinkedList();
        list2.insertAt(new Node(2), 4);
        list2.insertAt(new Node(4), 5);
        list2.insertAt(new Node(6), 6);
        System.out.println("Data LinkedList Two");
        list2.printData();

        LinkedList list3 = new LinkedList();
        list3.insertAt(new Node(7), 7);
        list3.insertAt(new Node(9), 8);
        list3.insertAt(new Node(11), 9);
        System.out.println("Data LinkedList Three");
        list3.printData();

        LinkedList list4 = new LinkedList();
        list4.insertAt(new Node(8), 10);
        list4.insertAt(new Node(10), 11);
        list4.insertAt(new Node(12), 12);
        System.out.println("Data LinkedList Four");
        list4.printData();

        System.out.println("After Merge List");
        LinkedList mergedArrList = new LinkedList();
        LinkedList[] list = new LinkedList[] {list1,list2,list3,list4};
        mergedArrList.mergeAllLists(list);
        mergedArrList.printData();
    }
}
