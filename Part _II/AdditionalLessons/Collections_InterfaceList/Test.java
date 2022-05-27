package Collections_InterfaceList;

public class Test {
    public static void main(String args[]) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(1);

        myLinkedList.remove(1);
        System.out.println(myLinkedList);
    }
}
