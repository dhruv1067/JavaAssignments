class Node3 {
    int data;
    Node3 next;
};

class LinkedList3 {
    static Node3 head;

    LinkedList3(){
        head = null;
    }

    void push_back(int newElement) {
        Node3 newNode = new Node3();
        newNode.data = newElement;
        newNode.next = null;
        if(head == null) {
            head = newNode;
        } else {
            Node3 temp = new Node3();
            temp = head;
            while(temp.next != null)
                temp = temp.next;
            temp.next = newNode;
        }
    }

    static void deleteDuplicates() {
        if(head == null || head.next == null)
            return ;
        Node3 curr = head;

        while( curr != null && curr.next != null){

            if(curr.data == curr.next.data){
                curr.next = curr.next.next;
            }
            else{
                curr = curr.next;
            }
        }
        return;
    }
    void PrintList() {
        Node3 temp = new Node3();
        temp = this.head;
        if(temp != null) {
            System.out.print("The list contains: ");
            while(temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        } else {
            System.out.println("The list is empty.");
        }
    }

    public static void main(String[] args) {
        LinkedList3 MyList = new LinkedList3();

        MyList.push_back(3);
        MyList.push_back(3);
        MyList.push_back(5);
        MyList.push_back(6);
        MyList.push_back(6);
        MyList.push_back(7);
        MyList.PrintList();

        deleteDuplicates();

        MyList.PrintList();

    }
}
