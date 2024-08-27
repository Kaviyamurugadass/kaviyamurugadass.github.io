import java.util.Scanner;
public class LinkedList
{
    Node head;
    static int printCount;

    class Node 
    {
        int data;
        Node next;

        Node(int data) 
        {
            this.data = data;
        }
    }
    LinkedList() 
    {
        head = null;
        printCount = 0;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        LinkedList n = new LinkedList();
        int choice;
        do 
        {
            System.out.println("---------------------LINKED LIST---------------------");
            System.out.println("Enter Your Choice:\n1.INSERT\n2.DELETE\n3.UPDATE\n4.DISPALY");
            choice = sc.nextInt();
            switch (choice) 
            {
                case 1:
                    System.out.println("Enter the Data to insert");
                    int Data = sc.nextInt();
                    n.addasc(Data);
                    break;
                case 2:
                    System.out.println("Enter the Data to delete");
                    int Data1 = sc.nextInt();
                    n.delete(Data1); 
                    if (printCount == 0)
                    {
                        System.out.println("Deleted successfully");
                    }
                    break;
                case 3:
                    System.out.println("Enter the data to update");
                    int olddata = sc.nextInt();
                    System.out.println("Enter the  new data");
                    int newdata = sc.nextInt();
                    n.update(olddata, newdata);
                    if(olddata==newdata)
                    {
                        System.out.println("Value is already available");
                        return;
                    }
                    break;
                case 4:
                    n.display();
                    break;
                default:
                    System.out.println("Please enter the valid choice");
                    break;
            }
        } 
        while (choice <= 4);
    }

    // 1.ascending order insertion
    void addasc(int data) 
    {
        Node newNode = new Node(data);    
        if (head == null) 
        {
            head = newNode;
        } 
        else if(head.data == data)
        {
            System.out.println("Data is already present");
        }
        else if (head.data > data) 
        {
            newNode.next = head;
            head = newNode;
        } 
        else
        {
        Node temp = head;
            if(temp.data < data) 
            {
                while (temp.next != null && temp.next.data <= data) 
                {             
                    temp = temp.next;
                }
                if (temp.data == data) 
                {
                    System.out.println("Data is already present in the List");
                    return;
                }
                newNode.next = temp.next;
                temp.next = newNode;
            }
        }
    }

    // 2. delete function
    void delete(int data) 
    {   
        if(head==null)
        {
            System.out.println("List is Empty"); 
            return;
        }
        else if (head.data == data) 
        {
            head = head.next;
            return;
        }
        Node temp = head;
        while (temp.data < data && temp.next!=null) 
        {              
            if (temp.next.data == data) 
            {
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }     
        System.out.println("Data is not present in the list");
    }

    // 3.update
    void update(int old, int newdata) 
    {
        Node newNode = new Node(newdata);
        Node insert = head;
        if(head==null)
        {
            System.out.println("List is Empty "); 
            return;
        }
        else if (head.data == old)  //delete @ head
        { 
            head = head.next;
            insert = head;   
        }
        if (head.data > newNode.data)  //insert @ head
        { 
            newNode.next = head;
            head = newNode;
        }
        else
        {
            Node temp = head.next;
            while (temp.next != null)
            {
                if(temp.data <= newdata) //hold the temp value to insert in future
                { 
                    insert = temp;
                }  
                if (temp.data == newdata) //only the newdata is less than olddata
                { 
                    System.out.println("Data is already present");
                    return;
                } 
                if(head.next.data == old) //delete in head.next     
                {  
                    head.next = head.next.next;
                    System.out.println("updated successfully");
                } 
                else if (temp.next.data == old) //delete
                { 
                    temp.next = temp.next.next;
                    System.out.println("updated successfully");
                }
                if(temp.next!=null)  //if this condition is not here it cause NullPointEx in while
                {
                    temp = temp.next;
                }
            }   
            if(insert.next!=null  && insert.next.data < newdata) // 50 40 - for this problem
            { 
                newNode.next = insert.next.next;
                insert.next.next = newNode; 
            }
            else
            {
                newNode.next = insert.next;
                insert.next = newNode; 
            }
        }
    }

    //4.display method
    void display() 
    {
        if (head == null) 
        {
            System.err.println("List is Empty");
        }
        Node temp = head;

        while (temp != null) 
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    //normal update
    void update1(int old, int newdata) 
    {
        printCount = 0;
        delete(old);
        if (printCount == 0) 
        {
            addasc(newdata);
            System.out.println("Updated Successfully");
        }
    }
    // 1.descending order insertion
    void adddesc(int data) 
    {
        Node newNode = new Node(data);
        if (head == null) 
        {
            head = newNode;
        }
        else if (head.data < newNode.data) 
        {
            newNode.next = head;
            head = newNode;
        }
        else if (head.data > newNode.data) 
        {
            Node temp = head;
            while (temp.data > newNode.data && temp.next != null) 
            {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    // Normal add
    public void add(int data) 
    {
        Node newNode = new Node(data);
        if (head == null) 
        {
            head = newNode;
        } else 
        {
            newNode.next = head;
            head = newNode;
        }
    }

    // Insert With position
    void InsertPos() 
    {
        System.out.println("Enter the Data ");
        int data = sc.nextInt();
        System.out.println("Enter the Position to insert ");
        int pos = sc.nextInt();
        Node newNode = new Node(data);
        if (pos == 0) 
        {
            add(data);
            return;
        }
        Node temp = head;
        for (int i = 0; i < pos - 1; i++) 
        {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    // add @ the end
    void Addend(int data) 
    {
        System.out.println("Enter the Data ");
        int Data = sc.nextInt();
        Node newNode = new Node(data);
        if (head == null) 
        {
            head = newNode;
        } else 
        {
            Node temp = head;
            while (temp.next != null) 
            {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
}
