class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}


public class LinkList {
    Node head;

    public LinkList() {
        head = null;
    }

    public int sizeListNodo(Node nodo){
        if(nodo == null) return 0;
        return 1 + sizeListNodo(nodo.next);
    }

    public int size(){
        return sizeListNodo(head);
    }

    public int indexOfNode (Node nodo, int data){
        if(nodo == null) return -1;
        if (nodo.data == data) return 0;
        return 1 + indexOfNode(nodo.next, data);
    }

    public int indexOf(int data){
        Node current = head;
        return indexOfNode(current, data);
    }

    public Node specificNode(int position){
        Node current = head;
        if(head == null) return null;
        if(position == 0) return head;
        if(position > size() || position < 0) return null;
        for(int i = 0; i < position; i++){
            current = current.next;
        }
        return current;
    }

    public void printList(){
        Node current = head;
        while(current != null){
            System.out.printf("%d -> ",current.data);
            current = current.next;
        }
        System.out.print("null");
    }

    public void addNewNode(int data) {
        Node current = head;
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void insertNode(int position, int data){
        Node newNode = new Node(data);
        if(position == 0){
            newNode.next = head;
            head = newNode;
            return;
        }
        Node current = specificNode(position);
        if(current == null){
            System.out.println("Position not found or out of range");
            return;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    public Node getTail(){
        return specificNode(size()-1);
    }

    public Node getHead(){
        return specificNode(0);
    }

    public Node eatAnotherLinkedList(LinkList victimList) {
        Node myCurrent = this.head;
        if(victimList.getHead() == null && myCurrent == null) return null;
        if (victimList.getHead() == null) return myCurrent;
        if (myCurrent == null) return victimList.getHead();

        while (myCurrent.next != null) {
            myCurrent = myCurrent.next;
        }
        myCurrent.next = victimList.getHead();

        return myCurrent;
    }

    public int count(int data){
      int occurences = 0;
      Node current = this.head;
      if(current == null) return 0;

      while(current.next != null){
          System.out.println("Me ejecuto");
          if(current.data == data){
                occurences++;
          }
          current = current.next;
      }
        return occurences;
    }

    public static void main (String[] args){
        LinkList list = new LinkList();
        LinkList victima = new LinkList();


        list.addNewNode(1);
        list.addNewNode(1);
        list.addNewNode(2);
        list.addNewNode(3);
        list.addNewNode(4);
        list.addNewNode(5);
        list.addNewNode(5);
        list.addNewNode(5);
        list.addNewNode(6);
        list.addNewNode(6);

        list.printList();
        System.out.println();

        victima.addNewNode(7);
        victima.addNewNode(8);
        victima.addNewNode(9);

        victima.printList();
        System.out.println();

        list.eatAnotherLinkedList(victima);
        list.printList();

        list.count(1);
        System.out.println(list.count(400));

    }
}

