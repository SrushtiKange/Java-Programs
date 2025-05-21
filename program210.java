import java.util.*;

class program210
{
        public static int SumOddDig(int iNo)
    {
       int iSum=0,iDig=0;

       while(iNo>0)
       {
         iDig=iNo%10;
         if(iDig%2!=0)
         {
            iSum=iSum+iDig;
         }
         iNo=iNo/10;
            
       }
       return iSum;
    }


    public static void main(String Arg[])
    {
        Scanner sobj=new Scanner(System.in);
        int iValue=0;
        int iRet=0;

        System.out.println("Enter number");
        iValue=sobj.nextInt();

        iRet=SumOddDig(iValue);

        System.out.println("sum of odd digits is:"+iRet);
    }
}