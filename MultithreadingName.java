class Demo extends Thread
        {
            public void run()
            {
                System.out.println("inside main method"+Thread.currentThread().getName());
            }
        }
class MultithreadingName
{
    public static void main(String A[])
    {
        System.out.println("main thread is reuunig");
       
       Demo dobj = new Demo();
       Demo dobj2= new Demo();

       dobj.setName("First");
        dobj2.setName("Second");

       


       dobj.start();
       dobj2.start();

       

       
    }
}