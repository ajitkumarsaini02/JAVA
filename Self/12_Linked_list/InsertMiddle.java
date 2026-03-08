

public class InsertMiddle {
    Node head;

    private int size;

    InsertMiddle(){
        this.size = 0;
    }

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // add first
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // add last
    public void addlast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // add middle
    public void addMiddle(int idx, String data){
        if(idx > size || idx < 0){
            System.out.println("Invalid index");
            return;
        }
        size++;
        Node newNode = new Node(data);
        if(head == null || idx == 0){
            newNode.next = head;
            head = newNode;
            return;
        }
        
        Node currNode = head;
        for(int i=0;i<size;i++){
            if(i == idx){
                Node nextNode = currNode.next;
                newNode.next = nextNode;
                currNode.next = newNode;
                break;
            }
            currNode = currNode.next;
        }
    }

    //print list
    public void printlist(){
        if(head == null){
            System.err.println("List is empty");
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    // size of list
    public int getSize(){
        return size;
    }
    public static void main(String[] args) {
        InsertMiddle list = new InsertMiddle();
        list.addFirst("a");
        list.addFirst("is");
        list.printlist();
        list.addlast("list");
        list.printlist();
        list.addFirst("This");
        list.printlist();
        list.addMiddle(2, "linked");
        list.printlist();
        System.out.println(list.getSize());
    }
}
