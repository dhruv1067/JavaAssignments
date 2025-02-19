class Node2 {
    int data;
    Node2 next;
};

class LinkedList2 {
    Node2 head;

    LinkedList2(){
        head = null;
    }

    void push_back(int newElement) {
        Node2 newNode = new Node2();
        newNode.data = newElement;
        newNode.next = null;
        if(head == null) {
            head = newNode;
        } else {
            Node2 temp = new Node2();
            temp = head;
            while(temp.next != null)
                temp = temp.next;
            temp.next = newNode;
        }
    }

    void push_at(int newElement, int position) {
        Node2 newNode = new Node2();
        newNode.data = newElement;
        newNode.next = null;

        if(position < 1) {
            System.out.print("\nposition should be >= 1.");
        } else if (position == 1) {
            newNode.next = head;
            head = newNode;
        } else {

            Node2 temp = new Node2();
            temp = head;
            for(int i = 1; i < position-1; i++) {
                if(temp != null) {
                    temp = temp.next;
                }
            }

            if(temp != null) {
                newNode.next = temp.next;
                temp.next = newNode;
            } else {
                System.out.print("\nThe previous node is null.");
            }
        }
    }

    void PrintList() {
        Node2 temp = new Node2();
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
        LinkedList2 MyList = new LinkedList2();

        MyList.push_back(3);
        MyList.push_back(6);
        MyList.push_back(5);
        MyList.PrintList();

        MyList.push_at(8, 2);
        MyList.PrintList();

        MyList.push_at(9, 3);
        MyList.PrintList();
    }
}
