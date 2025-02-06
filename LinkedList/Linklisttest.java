
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class Linklisttest {
    public LinkList list = new LinkList();
    public List<Integer> dataCollection = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

    @org.junit.jupiter.api.Test
    void addNewNode() {
        for(int data : dataCollection) {
            list.addNewNode(data);
        }
        assertEquals(10, list.size());

    }

    @org.junit.jupiter.api.Test
    void insertNode() {
        for(int data : dataCollection) {
            list.addNewNode(data);
        }
        list.insertNode(3, -4);
    }


    @org.junit.jupiter.api.Test
    void printList() {
        for(int data : dataCollection) {
            list.addNewNode(data);
        }
        list.printList();
    }

}