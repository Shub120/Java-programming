import java.util.*;
class ArrayIndexException
{
    public static void main(String A[])
    {
        Scanner sobj=new Scanner(System.in);

       int are[]={11,21,51,111};

       System.out.println("Entwer the index of array");

       int Index=sobj.nextInt();

       try
       {
        System.out.println("Inside Try");
       System.out.println("Element of that index is ",+are[Index]);
       }
       catch(Exception eobj)
       {
        System.out.println("exception occoured"+eobj);
       }


       System.out.println("End of application");
    }
}