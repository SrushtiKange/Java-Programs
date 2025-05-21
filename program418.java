class node
{
    public int data;
    public node next;
    
    public node(int Value)
    {
        data=Value;
        next=null; 
    }

}

class SinglyCL
{
    public node First;
    public node Last;
    public int iCount=0;

    public SinglyCL()
    {
        System.out.println("Object gets created successfully");
        First=null;
        Last=null;
        iCount=0;
    }

    public void InsertFirst(int No)
    {
        node newn=new node(No);

        if(First==null && Last==null)
        {
            First=newn;
            Last=newn;
        }
        else
        {
            newn.next=First;
            First=newn;
        }
        Last.next=First;

        iCount++;
    }

    public void InsertLast(int No)
    {
        node newn=new node(No);

        if(First==null && Last==null)
        {
            First=newn;
            Last=newn;
        }
        else
        {
           Last.next=newn;
           Last=newn;
        }
        Last.next=First;

        iCount++;
    }

    public void InsertAtPos(int No,int iPos)
    {
        if((iPos<1) || (iPos>iCount+1))
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
            node newn=new node(No);
            node temp=First;
            for(int i=1;i<iPos-1;i++)
            {
                temp=temp.next;
            }
            newn.next=temp.next;
            temp.next=newn;

            iCount++;
        }
    }

    public void Display()
    {
       node temp=First;
       System.out.print("->");
       do
       { 
        System.out.print("|"+temp.data+"|->");
        temp=temp.next;
       }while(temp!=Last.next);

       System.out.println();

    }

    public int Count()
    {
        return iCount;

    }

    public void DeleteFirst()
    {
        if((First==null)  && (Last==null))
        {
            return;
        }
        else if(First==Last)
        {
            First=null;
            Last=null;
        }
        else
        {
            First=First.next;
        }  
        Last.next=First;

        iCount--;

    }

    public void DeleteLast()
    {
        if((First==null)  && (Last==null))
        {
            return;
        }
        else if(First==Last)
        {
            First=null;
            Last=null;
        }
        else
        {
            node temp=First;
            while(temp.next!=Last)
            {
                temp=temp.next;
            }
            Last=temp;
            Last.next=First;
        }  
        iCount--;

    
    }

    public void DeleteAtPos(int iPos)
    {
        if((iPos<1) || (iPos>iCount))
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
            for(int i=1;i<iPos-1;i++)
            {
                temp=temp.next;
            }
            temp.next=temp.next.next;

            iCount--;
        }
    
    }
}

class program418
{
    public static void main(String Arg[])
    {
        SinglyCL obj=new SinglyCL();
        int iRet=0;

        obj.InsertFirst(11);
        obj.InsertFirst(21);
        obj.InsertFirst(51);

        obj.Display();
        iRet=obj.Count();
        System.out.println("Number of elements are"+iRet);
 
        obj.InsertLast(101);
        obj.InsertLast(121);
        obj.InsertLast(151);

        obj.Display();
        iRet=obj.Count();
        System.out.println("Number of elements are"+iRet);

        obj.DeleteFirst();
        obj.Display();
        iRet=obj.Count();
        System.out.println("Number of elements are"+iRet);

        obj.DeleteLast();
        obj.Display();
        iRet=obj.Count();
        System.out.println("Number of elements are"+iRet);

        obj.InsertAtPos(105,3);
        obj.Display();
        iRet=obj.Count();
        System.out.println("Number of elements are"+iRet);

        obj.DeleteAtPos(3);
        obj.Display();
        iRet=obj.Count();
        System.out.println("Number of elements are"+iRet);

    }

}
