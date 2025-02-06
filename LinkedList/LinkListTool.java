public class LinkListTool {
    public static Node eatAnotherLinkedList(LinkList victimList, LinkList myList){
        if(victimList.getHead() == null) return myList.getHead();
        if(LinkList.head == null){
            myList.head = victimList.head;

        }else{
            Node myCurrent = myList.head;
            while(myCurrent.next != null){
                myCurrent = myCurrent.next;
            }
            myCurrent.next = victimList.head;
        }
        return myList.head;
    }

}
