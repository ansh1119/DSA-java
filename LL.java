public class LL {
    static class Node{
        int val;
        Node next;
        public Node(int val){
            this.val=val;
            this.next=null;
        }
    }

    public static Node insertFirst(int data,Node head){
        Node New=new Node(10);
        New.next=head;
        head=New;
        return head;
    }

    public static Node insertLast(int data,Node head){
        Node node=new Node(data);
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
        node.next=null;
        return head;
    }


    public static Node insertMiddle(int data,Node head){
        Node slow=head;
        Node fast=head;
        while(fast.next!=null && fast!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        Node node=new Node(data);
        Node t=slow.next;
        slow.next=node;
        node.next=t;
        return head;
    }

    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        LL ob=new LL();
        Node head=new Node(12);
        head=insertFirst(11,head);
        head=insertLast(9,head);
        display(head);
    }
}
