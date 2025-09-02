public class LinkedList{
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void printList(){
        if(head == null){
            System.out.println("LL is Empty.");
            return;
        }

        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;   // linking
        head = newNode;
    }
    
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void add(int index, int data){
        if(index == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while(i < index-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.printList();
        
        ll.addFirst(1);
        ll.printList();
        ll.addFirst(2);
        ll.printList();
        
        ll.addLast(3);
        ll.printList();
        ll.addLast(4);
        ll.printList();
        
        ll.add(2, 5);
        ll.printList();

        System.out.print(ll.size);
    }
}