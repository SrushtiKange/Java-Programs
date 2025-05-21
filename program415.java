class node
{
    public int data;
    public node next;
    public node prev;

    public node (int Value)
    {
        data=Value;
        next=null;
        prev=null;
    }
}

class DoublyCL
{
    public node First;
    public node Last;
    public int iCount;

    public DoublyCL()
    {
        System.out.println("Objext of doubly Cl get created successfully");

        First=null;
        Last=null;
        iCount=0;
       
    }

    public void InsertFirst(int No)
    {
        node newn=null;

        newn=new node(No);

        if(First==null  &&  Last==null)
        {
            First=newn;
            Last=newn;
        }
        else
        {
            newn.next=First;
            First.prev=newn;
            First=newn;

        }
        Last.next=First;
        First.prev=Last;

        iCount++;
        
    }

    public void InsertLast(int No)
    {
        node newn=null;

        newn=new node(No);

        if(First==null  &&  Last==null)
        {
            First=newn;
            Last=newn;
        }
        else
        {
           Last.next=newn;
           newn.prev=Last;
           Last=newn;

        }
        Last.next=First;
        First.prev=Last;

        iCount++;
       
    }

    public void Display()
    {
        if(First==null && Last==null)
        {
            System.out.println("LL is empty");
            return;
        }
        System.out.println("Elements of LL are");
        do
        {
            System.out.print("|"+First.data+"|<=>");
            First=First.next;

        }while(First!=Last.next);

        System.out.println();
       
    }

    public int Count()
    {
        return iCount;
    }

    

    public void DeleteFirst()
    {
        if(First==null && Last==null)
        {
            System.out.println("LL is empty");
            return;
        }
        if(First==Last)
        {
            First=null;
            Last=null;
        }
        else
        {
            First=First.next;
            Last.next=First;
            First.prev=Last;
        }
        iCount--;
       
    }

    public void DeleteLast()
    {
        if(First==null && Last==null)
        {
            System.out.println("LL is empty");
            return;
        }
        else if(First==Last)
        {
            First=null;
            Last=null;
        }
        else
        {
           Last=Last.prev;
           Last.next=First;
           First.prev=Last;
        }
        iCount--;
       
    }

    public void InsertAtPos(int No,int iPos)
    {
        if(iPos<1 || iPos>iCount+1)
        {
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
            int i;
            node temp=First;
            node newn=null;

            newn=new node(No);

            for(i=1;i<iPos-1;i++)
            {
                temp=temp.next;
            }
            newn.next=temp.next;
            temp.next.prev=newn;
            newn.prev=temp;
            temp.next=newn;

            iCount++;
        }
        
    }

    public void DeleteAtPos(int iPos)
    {
        if(iPos<1  ||  iPos>iCount)
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
            int i;
            node temp=First;

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

class program415
{
    public static void main(String Arg[])
    {
        
        DoublyCL obj=new DoublyCL();
        int iRet=0;

        obj.InsertFirst(51);
        obj.InsertFirst(21);
        obj.InsertFirst(11);

        obj.InsertLast(101);
        obj.InsertLast(102);
        obj.InsertLast(103);

        obj.Display();
        iRet=obj.Count();
        System.out.println("Number of elements are:"+iRet);

        obj.DeleteFirst();
        obj.Display();
        iRet=obj.Count();
        System.out.println("Number of elements are:"+iRet);

        obj.DeleteLast();
        obj.Display();
        iRet=obj.Count();
        System.out.println("Number of elements are:"+iRet);

        obj.InsertAtPos(105,3);
        obj.Display();
        iRet=obj.Count();
        System.out.println("Number of elements are:"+iRet);

        obj.DeleteAtPos(3);
        obj.Display();
        iRet=obj.Count();
        System.out.println("Number of elements are:"+iRet);
       
    }
}