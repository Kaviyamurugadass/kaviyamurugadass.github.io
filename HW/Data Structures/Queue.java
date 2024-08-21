import java.util.*;
public class Queue
{
    static Node head;
    Queue()
    {
        head = null;
    }
    class Node
    {
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue queue = new Queue();
        int choice;
        do 
        {
            System.out.println("---------------------QUEUE USING LINKED LIST---------------------");
            System.out.println("Enter Your Choice:\n1.ENQUEUE\n2.DEQUEUE\n3.PEEK\n4.isEMPTY\n5.CLEAR\n6.DISPLAY\n7.EXIT");
            choice = sc.nextInt();
            switch (choice) 
            {
                case 1:
                    System.out.println("Enter the Data to insert into the Queue");
                    int Data = sc.nextInt();
                    queue.enqueue(Data);
                    break;

                case 2:
                    if(head==null)
                    {
                        System.out.println("Queue is Empty"); 
                    }
                    else
                    {
                        head = head.next; 
                        System.out.println("Deleted successfully");
                    } 
                    break;

                case 3:
                    System.out.println("element at front of queue --> "+head.data);
                    break;

                case 4:
                    if(head==null)
                    {
                        System.out.println("Yes, Queue is Empty"); 
                    }
                    else
                    {
                        System.out.println("No, Queue is Not Empty");
                    }
                    break;
                
                case 5:
                    head = null;
                    System.out.println("Queue is cleared completely");
                    break;
                case 6:
                    if (head == null) 
                    {
                        System.err.println("Queue is Empty");
                        return;
                    }
                    queue.display();
                    break;

                case 7:
                    System.out.println("Thank you for using our application");
                    break;
                    
                default:
                    System.out.println("Please enter the valid choice");
                    break;
            }
        } 
        while (choice <= 6);
    }
    void enqueue(int data) 
    {
        Node newNode = new Node(data);    
        if (head == null) 
        {
            head = newNode;
        }
        else if(head.data == data)
        {
                System.out.println("Data is already present in the Queue");
                return;
        } 
        else
        {
            Node temp = head;
                while (temp.next != null) 
                {             
                    if (temp.data == data || temp.next.data == data) 
                    {
                        System.out.println("Data is already present in the Queue");
                        return;
                    }
                    temp = temp.next;
                }
                newNode.next = temp.next;
                temp.next = newNode;
        }
        System.out.println("Successfully added");
    }
    void display() 
    {
        Node temp = head;
        while (temp != null) 
        {
            System.out.print("|   " + temp.data + "   |");
            temp = temp.next;
        }
        System.out.println();
    }
}
