import java.util.*;

class program210
{
        public static int SumDiff(int iNo)
    {
       int iSume=0,iSumo=0,iDig=0;

       while(iNo>0)
       {
         iDig=iNo%10;
         if(iDig%2!=0)
         {
            iSumo=iSumo+iDig;
         }
         else
         {
            iSume=iSume+iDig;
         }
         iNo=iNo/10;
            
       }
       return iSume-iSumo;
    }


    public static void main(String Arg[])
    {
        Scanner sobj=new Scanner(System.in);
        int iValue=0;
        int iRet=0;

        System.out.println("Enter number");
        iValue=sobj.nextInt();

        iRet=SumDiff(iValue);

        System.out.println("sum of odd digits is:"+iRet);
    }
}