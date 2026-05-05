class Demo extends Thread
        {
            public void run()
            {
                System.out.println("inside main method");
            }
        }
class MultiThreading1
{
    public static void main(String A[])
    {
        System.out.println("main thread is reuunig");
       
       Demo dobj = new Demo();
       Demo dobj2= new Demo();

       dobj.start();
       dobj2.start();

       

       
    }
}