import java.util.*;

class Arithmetic
{
    public int iNo1;
    public int iNo2; 

    public Arithmetic(int A,int B)
    {
        iNo1=A;
        iNo2=B;
    } 

    public int Addition()
    {
        int iAns=0;
        iAns=iNo1+iNo2;
        return iAns;  
    }
}

class program200
{
    public static void main(String Arg[])
    {
        Scanner sobj=new Scanner(System.in);

        int iValue1=0,iValue2=0;
        int iAns=0;

        System.out.println("Enter first number");
        iValue1=sobj.nextInt();

        System.out.println("Enter second number");
        iValue2=sobj.nextInt();

        Arithmetic aobj=new Arithmetic(iValue1, iValue2);

        iAns=aobj.Addition();

        System.out.println("Addition is:"+iAns);

        sobj.close();

    }
}

//int       nextInt()
//float     nextFloat()
//double    nextDouble()
//string    nextLine()