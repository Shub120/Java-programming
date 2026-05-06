import java.util.*;
class DivisionException
{
    public static void main(String A[])
    {
        Scanner sobj=new Scanner(System.in);

        int no1=0, no2=0, Ans =0;

        System.out.println("enetre 1st number:");
        no1=sobj.nextInt();
        
        System.out.println("enetre 2st number:");
        no2=sobj.nextInt();
        
        try
        {
            System.out.println("inside Try Block");
            Ans= no1/no2;
        }
        catch(java.lang.ArithmeticException aobj)
        {
         
            System.out.println("inside Catch Block");
            System.out.println("Exception occoured"+aobj);
            

        }
        catch(Exception eobj)
        {
            System.out.println("Inside Generic Catch"+eobj);


        }
        finally
        {
            System.out.println("Inside Finaly Block");
            sobj=null;  //resource DeallocAtion

        }

        
       System.out.println("Division is:"+Ans);
    }

}