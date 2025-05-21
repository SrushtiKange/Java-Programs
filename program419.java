//Doubly LL
class node
{
    public int data;
    public node next;
    public node prev;
    
    public node(int Value)
    {
        data=Value;
        next=null; 
        prev=null;
    }

}

class DoublyLL
{
    public node First;
    public int iCount=0;

    public DoublyLL()
    {
        System.out.println("Object gets created successfully");
        First=null;
        iCount=0;
    }

    public void InsertFirst(int No)
    {
        node newn=new node(No);

        if(First==null)
        {
            First=newn;
        }
        else
        {
            newn.next=First;
            First.prev=newn;
            First=newn;
        }
        iCount++;
       
    }

    public void InsertLast(int No)
    {
        node newn=new node(No);

        if(First==null)
        {
            First=newn;
        }
        else 
        {
            node temp=First;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newn;
            newn.prev=temp;
        }
        iCount++;
        
    }

    public void InsertAtPos(int No,int iPos)
    {
        if((iPos<1)||(iPos>iCount+1))
        {
            System.out.println("Invalid position");
            return;
        }

        if(iPos==1)
        {
            InsertFirst(No);
        }
        else if(iPos==iCount+1)
        {
            InsertLast(No);
        }
        else
        {
           node newn =new node(No);
           node temp=First;
           int i=0;
           for(i=1;i<iPos-1;i++)
           {
               temp=temp.next;
           }
            newn.next=temp.next;
            temp.next.prev=newn;
            temp.next=newn;
            newn.prev=temp;

            iCount++;
        }
       
    }

    public void Display()
    {
        node temp=First;
        while(temp!=null)
        {
            System.out.print("|"+temp.data+"|<=>");
            temp=temp.next;
        }
        System.out.print("NULL");
        System.out.println();
       
    }

    public int Count()
    {
        return iCount;

    }

    public void DeleteFirst()
    {
        if(First==null)
        {
            return;
        }
        else if(First.next==null)
        {
            First=null;
        }
        else
        {
            First=First.next;
            First.prev=null;
        }
        iCount--;


    }

    public void DeleteLast()
    {
        if(First==null)
        {
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

    public void DeleteAtPos(int iPos)
    {
        if((iPos<1)||(iPos>iCount))
        {
            return;
        } 
        if(iPos==1)
        {
            DeleteFirst();
        }
        else if(iPos==iCount)
        {
            DeleteLast();
        }
        else
        {
            node temp=First;
            int i=0;
            for(i=1;i<iPos-1;i++)
            {
                temp=temp.next;
            }
            temp.next=temp.next.next;
            temp.next.prev=temp;

            iCount--;
        }
    }
}

class program419
{
    public static void main(String Arg[])
    {
        DoublyLL obj=new DoublyLL();
        int iRet=0;

        obj.InsertFirst(11);
        obj.InsertFirst(21);
        obj.InsertFirst(51);

        obj.Display();
        iRet=obj.Count();
        System.out.println("Number of elements in linked list are : "+iRet);

        obj.InsertLast(101);
        obj.InsertLast(111);
        obj.InsertLast(121);

        obj.Display();
        iRet=obj.Count();
        System.out.println("Number of elements in linked list are : "+iRet);

        obj.DeleteFirst();
        obj.Display();
        iRet=obj.Count();
        System.out.println("Number of elements in linked list are : "+iRet);

        obj.DeleteLast();
        obj.Display();
        iRet=obj.Count();
        System.out.println("Number of elements in linked list are : "+iRet);

        obj.InsertAtPos(151,2);
        obj.Display();
        iRet=obj.Count();
        System.out.println("Number of elements in linked list are : "+iRet);

        obj.DeleteAtPos(2);
        obj.Display();
        iRet=obj.Count();
        System.out.println("Number of elements in linked list are : "+iRet);

        

    }

}
