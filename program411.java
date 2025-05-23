class node
{
    public int data;
    public node next;
}

class SinglyLL
{
    public node First;
    public int iCount;

    public SinglyLL()
    {
        System.out.println("Objext of singly LL gets created successfully");
        First=null;
        iCount=0;
    }

    public void InsertFirst(int No)
    {
        node newn=null;

        newn=new node();

        newn.data=No;
        newn.next=null;

        if(First==null)
        {
            First=newn;
        }
        else
        {
            newn.next=First;
            First=newn;

        }
        iCount++;
    }

    public void Display()
    {
        System.out.println("Elements of linked list are: ");

        node temp=First;

        while(temp!=null)
        {
            System.out.print("|"+temp.data+"|->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public int Count()
    {
        return iCount;
    }

    public void InsertLast(int No)
    {
        node newn=null;
        node temp=null;

        newn=new node();

        newn.data=No;
        newn.next=null;

        if(First==null)
        {
            First=newn;
        }
        else
        {
            temp=First;

            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newn;

        }
        iCount++;
    }

    public void DeleteFirst()
    {
        if(First==null)
        {
            System.out.println("Linked list is empty");
            return;
        }
        else 
        {
            First=First.next;
        }
        iCount--;
    }

    public void DeleteLast()
    {
        if(First==null)
        {
            System.out.println("Linked list is empty");
            return;
        }
        else if(First.next==null)  
        {
            First=null;
        }
        else 
        {
           node temp=First;
           while(temp.next.next!=null)
           {
               temp=temp.next;
           }
           temp.next=null;
        }
        iCount--;
    }
}


class program411
{
    public static void main(String Arg[])
    {
        SinglyLL obj=new SinglyLL();
        int iRet=0;

        obj.InsertFirst(101);
        obj.InsertFirst(51);
        obj.InsertFirst(21);
        obj.InsertFirst(11);

        obj.Display();

        obj.InsertLast(110);
        obj.InsertLast(120);
        obj.InsertLast(130);
        obj.InsertLast(140);

        obj.Display();
        iRet=obj.Count();   
        System.out.println("Number of elements in linked list are: "+iRet);

        obj.DeleteFirst();
        obj.Display();
        iRet=obj.Count();
        System.out.println("Number of elements in linked list are: "+iRet);

        obj.DeleteLast();
        obj.Display();
        iRet=obj.Count();
        System.out.println("Number of elements in linked list are: "+iRet);
    }
}