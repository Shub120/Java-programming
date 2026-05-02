import java.util.*;
class ArrayIndex
{
    public static void main(String A[])
    {
        Scanner sobj=new Scanner(System.in);

       int are[]={11,21,51,111};

       System.out.println("Entwer the index of array");

       int Index=sobj.nextInt();

       System.out.println("Element of that index is ",+are[Index]);

       System.out.println("End of application");
    }
}