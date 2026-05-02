import java.util.Scanner;

class DynamicMemoryIO

{
    
        public static void main(String A[])
{
    Scanner sobj= new Scanner(System.in);

    int size=0;
    int i=o;
    
    System.out.println("enter number of elements");
    size=sobj.nextInt();

//dynamic memory allocation
float marks[]= new float[size];

//use the memory
System.out.println("Enter the your marks");
for(i=0;i<size;i++)
{
    marks[i]=sobj.nextFloat();
}

System.out.println("Enetered marks are");
for(i=0;i<size;i++)
{
    marks[i]=sobj.nextFloat();
}
System.out.println(marks[i]);

marks= null;
System.gc();
    }


}